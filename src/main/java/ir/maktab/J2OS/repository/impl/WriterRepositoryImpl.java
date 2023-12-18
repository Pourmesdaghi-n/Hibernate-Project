package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.Writer;
import ir.maktab.J2OS.repository.WriterRepository;

import javax.persistence.EntityManager;

public class WriterRepositoryImpl extends BaseEntityRepositoryImpl<Writer, Long>
        implements WriterRepository {

    public WriterRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Writer> getEntityClass() {
        return Writer.class;
    }
}
