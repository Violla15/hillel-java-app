package ua.ithillel.hillelwebapp.db.session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {

    private  static final String CONFIG_PATH = "hibernate.cfg.xml";

    private  static SessionFactory sessionFactory ;

    private HibernateSessionFactory(){
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            Configuration configuration = new Configuration();
            configuration.configure(CONFIG_PATH);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .configure()
                    .build();

            sessionFactory= configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
