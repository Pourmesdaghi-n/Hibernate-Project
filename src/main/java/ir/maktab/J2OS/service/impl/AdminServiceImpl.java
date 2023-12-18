package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.Admin;
import ir.maktab.J2OS.repository.AdminRepository;
import ir.maktab.J2OS.service.AdminService;

public class AdminServiceImpl extends BaseEntityServiceImpl<Admin, Long, AdminRepository>
        implements AdminService {

    public AdminServiceImpl(AdminRepository repository) {
        super(repository);
    }
}
