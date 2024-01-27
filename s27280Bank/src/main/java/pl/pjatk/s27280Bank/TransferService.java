package pl.pjatk.s27280Bank;

import org.springframework.stereotype.Component;

@Component
public class TransferService {
    private final ClientStorage clientStorage;
    public TransferService(ClientStorage clientStorage){
        this.clientStorage = clientStorage;
    }

    public Transfer sendMoney(String clientID, int amount){
        Transfer transfer = new Transfer();
        Client client = clientStorage.findClientbyID(clientID);

        if (client == null){
            System.out.println("Client not exist");
            return null;
        }

        int newBalance = client.getBalance() - amount;

        if (newBalance < 0){
            System.out.println("jestes za biedny");
            transfer.setNewBalance(client.getBalance());
            transfer.setTransferType(TransferType.DECLINED);
        }
        else {
            transfer.setNewBalance(newBalance);
            transfer.setTransferType(TransferType.ACCEPTED);
            client.setBalance(newBalance);
        }
        return transfer;
    }
    public Transfer addMoney(String clientID, int amount){
        int newBalance;
        Transfer transfer = new Transfer();
        Client client = clientStorage.findClientbyID(clientID);

        if (client == null){
            System.out.println("Client not exist");
            return null;
        }

        newBalance = client.getBalance() + amount;

        if (amount < 0){
            System.out.println("negative value");
            transfer.setNewBalance(client.getBalance());
            transfer.getTransferType(TransferType.DECLINED);
        }
        else {
            transfer.setNewBalance(newBalance);
            transfer.setTransferType(TransferType.ACCEPTED);
            client.setBalance(newBalance);
        }
        return transfer;
    }
}
