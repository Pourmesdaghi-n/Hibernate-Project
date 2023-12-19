package ir.maktab.J2OS.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static EntityManagerFactory mainEntityManagerFactory;
    private static EntityManagerFactory testEntityManagerFactory;

    static {
        mainEntityManagerFactory = Persistence.createEntityManagerFactory("Unit");
        testEntityManagerFactory = Persistence.createEntityManagerFactory("Test");
    }

    public static EntityManagerFactory getMainEntityManagerFactory() {
        return mainEntityManagerFactory;
    }

    public static EntityManagerFactory getTestEntityManagerFactory() {
        return testEntityManagerFactory;
    }
}
