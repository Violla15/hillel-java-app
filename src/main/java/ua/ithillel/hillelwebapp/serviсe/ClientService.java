package ua.ithillel.hillelwebapp.serviсe;

import ua.ithillel.hillelwebapp.db.dao.ClientDAO;
import ua.ithillel.hillelwebapp.entity.Client;

import java.util.List;

public class ClientService {
    private ClientDAO clientDAO = new ClientDAO();

    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }

    public void createClient(Client client) {
        clientDAO.save(client);
    }

    public void updateClient(Client client) {
        clientDAO.update(client);
    }

    public Client findById(int clientId) {
        return clientDAO.findById(clientId);
    }

    public void deleteClient(Client client) {
        clientDAO.delete(client);
    }
}

