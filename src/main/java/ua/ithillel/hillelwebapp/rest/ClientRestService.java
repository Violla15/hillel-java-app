package ua.ithillel.hillelwebapp.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ua.ithillel.hillelwebapp.entity.Client;
import ua.ithillel.hillelwebapp.servise.ClientService;

import java.util.List;

@Path("/clients")
public class ClientRestService {

    private ClientService clientService = new ClientService();

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addClient(Client client) {
        clientService.createClient(client);
    }

    @PUT
    @Path("/modify")
    @Produces(MediaType.APPLICATION_JSON)
    public void modifyClient(Client client) {
        clientService.updateClient(client);
    }

    @DELETE
    @Path("/delete/{id}")
    public void deleteClient(@PathParam("id") int clientId) {
        Client clientToTable = clientService.findById(clientId);
        clientService.deleteClient(clientToTable);
    }
}

