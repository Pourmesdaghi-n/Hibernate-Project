package ir.maktab.J2OS.repository.base.impl;


import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.BaseCategory;
import ir.maktab.J2OS.repository.base.BaseCategoryRepository;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseCategoryRepositoryImpl<E extends BaseCategory<E>> extends BaseEntityRepositoryImpl<E, Long>
        implements BaseCategoryRepository<E> {

    public BaseCategoryRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public List<E> findAllByTitleContaining(String title) {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName() + " c where c.title like '%" + title + "%'",
                getEntityClass()
        ).getResultList();
    }

    @Override
    public List<E> findAllByParentId(Long parentId) {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName() + " c where c.parent.id = :parentId",
                getEntityClass()
        ).setParameter("parentId", parentId).getResultList();
    }
}
