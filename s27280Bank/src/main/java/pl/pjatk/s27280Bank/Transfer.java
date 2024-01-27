package pl.pjatk.s27280Bank;

public class Transfer {
    private int newBalance;
    private TransferType transferType;

    public int getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }

    public TransferType getTransferType(TransferType declined) {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "newBalance=" + newBalance +
                ", transferType=" + transferType +
                '}';
    }
}
