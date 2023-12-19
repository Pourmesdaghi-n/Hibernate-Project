package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.domain.MediaCategory;
import ir.maktab.J2OS.repository.MediaCategoryRepository;
import ir.maktab.J2OS.util.ApplicationContext;
import ir.maktab.J2OS.util.HibernateUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

class MediaCategoryRepositoryImplTest {
    private final MediaCategoryRepository mediaCategoryRepository;

    public MediaCategoryRepositoryImplTest() {
        mediaCategoryRepository = ApplicationContext.getMediaCategoryRepository();
    }

    @BeforeAll
    static void insertFakeData() {
        EntityManager entityManager =
                HibernateUtil.getTestEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        MediaCategory parent = new MediaCategory();
        parent.setTitle("sport");
        entityManager.persist(parent);

        MediaCategory child = new MediaCategory();
        child.setParent(parent);
        child.setTitle("football");
        entityManager.persist(child);
        entityManager.getTransaction().commit();
    }

    @Test
    void findAllByTitleContaining() {
        assertEquals(
                1,
                mediaCategoryRepository.findAllByTitleContaining("a").size());
        assertEquals(
                1,
                mediaCategoryRepository.findAllByTitleContaining("p").size()
        );
    }

    @Test
    void findAllByParentId() {
        assertEquals(
                0,
                mediaCategoryRepository.findAllByParentId(2L).size()
        );
        assertEquals(
                "football",
                mediaCategoryRepository.findAllByParentId(1L).get(0).getTitle()
        );
    }

    @Test
    void save() {
        MediaCategory mediaCategory = new MediaCategory();
        assertNull(mediaCategory.getId());
        mediaCategoryRepository.save(mediaCategory);
        assertNotNull(mediaCategory.getId());
    }

    @Test
    void findById() {
        assertNotNull(
                mediaCategoryRepository.findById(1L)
        );
    }

    @Test
    void findAll() {
        assertEquals(
                2,
                mediaCategoryRepository.findAll().size()
        );
    }

    @Test
    void existsById() {
        assertTrue(
                mediaCategoryRepository.existsById(1L)

        );
    }

    @Test
    void countAll() {
        assertEquals(
                2,
                mediaCategoryRepository.countAll()
        );
    }
}