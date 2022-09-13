package ua.ithillel.hillelwebapp.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.ithillel.hillelwebapp.db.session.HibernateSessionFactory;
import ua.ithillel.hillelwebapp.entity.Car;

import java.util.List;

public class CarDAO implements AbstractDAO<Car> {

    @Override
    public Car findById(int id) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.get(Car.class, id);
        }
    }

    @Override
    public void save(Car entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }

    @Override
    public void update(Car entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }

    @Override
    public void delete(Car entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }

    @Override
    public List<Car> findAll() {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.createQuery("From Car", Car.class).getResultList();
        }
    }
}

