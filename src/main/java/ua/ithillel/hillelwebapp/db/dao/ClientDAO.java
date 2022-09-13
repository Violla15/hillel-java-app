package ua.ithillel.hillelwebapp.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.ithillel.hillelwebapp.db.session.HibernateSessionFactory;
import ua.ithillel.hillelwebapp.entity.Client;

import java.util.List;

public class ClientDAO implements AbstractDAO<Client> {
    @Override
    public Client findById(int id) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.get(Client.class, id);
        }
    }

    @Override
    public void save(Client entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }

    @Override
    public void update(Client entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }

    @Override
    public void delete(Client entity) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }

    @Override
    public List<Client> findAll() {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            return session.createQuery("From Client", Client.class).getResultList();
        }
    }
}

