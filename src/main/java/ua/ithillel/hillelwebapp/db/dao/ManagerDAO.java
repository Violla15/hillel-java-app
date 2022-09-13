package ua.ithillel.hillelwebapp.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.ithillel.hillelwebapp.db.session.HibernateSessionFactory;
import ua.ithillel.hillelwebapp.entity.Manager;


import java.util.List;

public class ManagerDAO implements AbstractDAO<Manager> {
    @Override
    public Manager findById(int id) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.get(Manager.class, id);
        }
    }

    @Override
    public void save(Manager entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }

    @Override
    public void update(Manager entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }

    @Override
    public void delete(Manager entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }

    @Override
    public List<Manager> findAll() {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.createQuery("From Manager", Manager.class).getResultList();
        }
    }
}
