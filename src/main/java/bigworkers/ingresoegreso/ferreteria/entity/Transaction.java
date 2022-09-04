package bigworkers.ingresoegreso.ferreteria.entity;

public class Transaction {

    private long idTransaction;
    private String concept;
    private String detail;
    private float amount;
    private Employee employee;
    private Enterprise enterprise;
    private boolean state;

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", concept='" + concept + '\'' +
                ", detail='" + detail + '\'' +
                ", amount=" + amount +
                ", employee=" + employee +
                ", enterprise=" + enterprise +
                ", state=" + state +
                '}';
    }
}
