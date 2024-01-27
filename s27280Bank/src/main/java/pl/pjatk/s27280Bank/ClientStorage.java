package pl.pjatk.s27280Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private List<Client> clientList = new ArrayList<>();

    public ClientStorage(){
        clientList.add(new Client("1", "Staszek", 2000));
        clientList.add(new Client("2", "Maciek", 90000));
        clientList.add(new Client("3", "Darek", 45000));
    }

    public void registerClient(Client client){
        clientList.add(client);
    }

    public Client findClientbyID(String clientID){
        for (Client client : clientList){
            if (client.getClientID().equals(clientID)){
                return client;
            }
        }
        return null;
    }

    public List<Client> getClientList(){
        return clientList;
    }

    public void showClient(){
        for (Client client: clientList){
            System.out.println(client.getClientID() + " | " + client.getName() + " | " + client.getBalance());
        }
    }

}
