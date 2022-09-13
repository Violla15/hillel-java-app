package ua.ithillel.hillelwebapp.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.ithillel.hillelwebapp.db.session.HibernateSessionFactory;
import ua.ithillel.hillelwebapp.entity.Order;

import java.util.List;

public class OrderDAO implements AbstractDAO<Order> {
    @Override
    public Order findById(int id) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.get(Order.class, id);
        }
    }

    @Override
    public void save(Order entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }

    @Override
    public void update(Order entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }

    @Override
    public void delete(Order entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }

    @Override
    public List<Order> findAll() {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.createQuery("From Order", Order.class).getResultList();
        }
    }
}
