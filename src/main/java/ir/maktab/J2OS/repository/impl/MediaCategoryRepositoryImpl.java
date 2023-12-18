package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.domain.MediaCategory;
import ir.maktab.J2OS.repository.MediaCategoryRepository;
import ir.maktab.J2OS.repository.base.impl.BaseCategoryRepositoryImpl;

import javax.persistence.EntityManager;

public class MediaCategoryRepositoryImpl extends BaseCategoryRepositoryImpl<MediaCategory>
        implements MediaCategoryRepository {

    public MediaCategoryRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<MediaCategory> getEntityClass() {
        return MediaCategory.class;
    }

}
