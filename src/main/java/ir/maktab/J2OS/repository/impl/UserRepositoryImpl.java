package ir.maktab.J2OS.repository.impl;

import ir.maktab.J2OS.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.J2OS.domain.User;
import ir.maktab.J2OS.repository.UserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<User, Long>
        implements UserRepository {

    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User getUserByUserName(String username) {
        return entityManager.createQuery(
                "from User u where u.username = :username", User.class
        ).setParameter("username", username).getSingleResult();
    }
}
