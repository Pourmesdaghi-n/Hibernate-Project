package ir.maktab.J2OS.util;

import ir.maktab.J2OS.repository.MediaCategoryRepository;
import ir.maktab.J2OS.repository.impl.MediaCategoryRepositoryImpl;
import ir.maktab.J2OS.service.MediaCategoryService;
import ir.maktab.J2OS.service.impl.MediaCategoryServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContext {

    private static final MediaCategoryRepository mediaCategoryRepository;
    private static final MediaCategoryService mediaCategoryService;

    static {
        EntityManager entityManager = HibernateUtil.getTestEntityManagerFactory().createEntityManager();
        mediaCategoryRepository = new MediaCategoryRepositoryImpl(entityManager);
        mediaCategoryService = new MediaCategoryServiceImpl(mediaCategoryRepository);
    }

    private ApplicationContext() {

    }

    public static MediaCategoryRepository getMediaCategoryRepository() {
        return mediaCategoryRepository;
    }

    public static MediaCategoryService getMediaCategoryService() {
        return mediaCategoryService;
    }
}
