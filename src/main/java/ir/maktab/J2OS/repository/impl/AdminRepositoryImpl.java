package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.Admin;
import ir.maktab.J2OS.repository.AdminRepository;

import javax.persistence.EntityManager;

public class AdminRepositoryImpl extends BaseEntityRepositoryImpl<Admin, Long>
        implements AdminRepository {

    public AdminRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Admin> getEntityClass() {
        return Admin.class;
    }
}
