package ua.ithillel.hillelwebapp.serviсe;

import ua.ithillel.hillelwebapp.db.dao.OrderDAO;
import ua.ithillel.hillelwebapp.entity.Order;

import java.util.List;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();


    public List<Order> getAllOrders() {
        return orderDAO.findAll();
    }

    public void createOrder(Order order) {
        orderDAO.save(order);
    }

    public void updateOrder(Order order) {
        orderDAO.update(order);
    }

    public Order findById(int orderId) {
        return orderDAO.findById(orderId);
    }

    public void deleteOrder(Order order) {
        orderDAO.delete(order);
    }
}
