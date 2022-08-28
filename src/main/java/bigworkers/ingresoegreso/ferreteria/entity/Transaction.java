package bigworkers.ingresoegreso.ferreteria.entity;

public class Transaction {

    private long idTransaction;
    private String concept;
    private float amount;
    private String user;

    public Transaction(long idTransaction, String concept, float amount, String user) {
        this.idTransaction = idTransaction;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
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

    public String getUser() {return user; }

    public void setUser(String usuario) {this.user = usuario; }

    @Override
    public String toString() {
        return "Transaction" +
                "\n     idTransaction = " + idTransaction +
                "\n     concept = " + concept +
                "\n     amount = " + amount +
                "\n     user = " + user;
    }
}
