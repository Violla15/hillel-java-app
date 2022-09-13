package ua.ithillel.hillelwebapp.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ua.ithillel.hillelwebapp.entity.Order;
import ua.ithillel.hillelwebapp.serviсe.OrderService;

import java.util.List;

@Path("/orders")
public class OrderRestService {

    private OrderService orderService = new OrderService();

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(Order order) {
        orderService.createOrder(order);
    }

    @PUT
    @Path("/modify")
    @Produces(MediaType.APPLICATION_JSON)
    public void modifyOrder(Order order) {
        orderService.updateOrder(order);
    }

    @DELETE
    @Path("/delete/{id}")
    public void deleteOrder(@PathParam("id") int orderId) {
        Order orderToDelete = orderService.findById(orderId);
        orderService.deleteOrder(orderToDelete);
    }
}
