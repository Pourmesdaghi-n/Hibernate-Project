package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.Media;
import ir.maktab.J2OS.repository.MediaRepository;

import javax.persistence.EntityManager;

public class MediaRepositoryImpl extends BaseEntityRepositoryImpl<Media, Long>
        implements MediaRepository {

    public MediaRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Media> getEntityClass() {
        return Media.class;
    }
}
