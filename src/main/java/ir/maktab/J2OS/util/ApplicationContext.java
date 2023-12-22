package ir.maktab.J2OS.util;

import ir.maktab.J2OS.repository.MediaCategoryRepository;
import ir.maktab.J2OS.repository.UserRepository;
import ir.maktab.J2OS.repository.impl.MediaCategoryRepositoryImpl;
import ir.maktab.J2OS.repository.impl.UserRepositoryImpl;
import ir.maktab.J2OS.service.AuthenticationProvider;
import ir.maktab.J2OS.service.MediaCategoryService;
import ir.maktab.J2OS.service.UserService;
import ir.maktab.J2OS.service.impl.AuthenticationProviderImpl;
import ir.maktab.J2OS.service.impl.MediaCategoryServiceImpl;
import ir.maktab.J2OS.service.impl.UserServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContext {

    private static final MediaCategoryRepository mediaCategoryRepository;
    private static final MediaCategoryService mediaCategoryService;
    private static final UserRepository userRepository;
    private static final UserService userService;
    private static final AuthenticationProvider authenticationProvider;

    static {
        EntityManager entityManager = HibernateUtil.getTestEntityManagerFactory().createEntityManager();
        mediaCategoryRepository = new MediaCategoryRepositoryImpl(entityManager);
        mediaCategoryService = new MediaCategoryServiceImpl(mediaCategoryRepository);

        userRepository = new UserRepositoryImpl(entityManager);
        userService = new UserServiceImpl(userRepository);

        authenticationProvider = new AuthenticationProviderImpl(userService);
    }

    private ApplicationContext() {

    }

    public static MediaCategoryRepository getMediaCategoryRepository() {
        return mediaCategoryRepository;
    }

    public static MediaCategoryService getMediaCategoryService() {
        return mediaCategoryService;
    }

    public static UserRepository getUserRepository() {
        return userRepository;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static AuthenticationProvider getAuthenticationProvider() {
        return authenticationProvider;
    }
}
