package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.User;
import ir.maktab.J2OS.repository.UserRepository;
import ir.maktab.J2OS.service.UserService;

public class UserServiceImpl extends BaseEntityServiceImpl<User, Long, UserRepository>
        implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
