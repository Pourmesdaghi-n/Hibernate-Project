package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.Tag;
import ir.maktab.J2OS.repository.TagRepository;

import javax.persistence.EntityManager;

public class TagRepositoryImpl extends BaseEntityRepositoryImpl<Tag, Long>
        implements TagRepository {

    public TagRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Tag> getEntityClass() {
        return Tag.class;
    }
}
