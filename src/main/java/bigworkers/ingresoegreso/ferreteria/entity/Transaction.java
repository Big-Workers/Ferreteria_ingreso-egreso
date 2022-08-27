package bigworkers.ingresoegreso.ferreteria.entity;

public class Transaction {

    public long idTransaction;
    public String concept;
    public float amount;
    private user User:
    private enterprise Enterprise;

    public Transaction(long idTransaction, String concept, float amount, user user, enterprise enterprise) {
        this.idTransaction = idTransaction;
        this.concept = concept;
        this.amount = amount;
        User = user;
        Enterprise = enterprise;
    }

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public user getUser() {
        return User;
    }

    public void setUser(user user) {
        User = user;
    }

    public enterprise getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(enterprise enterprise) {
        Enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", User=" + User +
                ", Enterprise=" + Enterprise +
                '}';
    }
}
