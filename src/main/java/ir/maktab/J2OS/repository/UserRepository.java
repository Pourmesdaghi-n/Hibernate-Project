package ir.maktab.J2OS.repository;

import ir.maktab.J2OS.base.repository.BaseEntityRepository;
import ir.maktab.J2OS.domain.User;

public interface UserRepository extends BaseEntityRepository<User, Long> {
    User getUserByUserName(String username);
}
