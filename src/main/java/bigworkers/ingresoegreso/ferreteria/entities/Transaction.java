package bigworkers.ingresoegreso.ferreteria.entities;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_transaction")
    private long idTransaction;
    @Column(name="concept", nullable = false)
    private String concept;
    @Column(name="detail", nullable = false)
    private String detail;
    @Column(name="amount", nullable = false)
    private float amount;
    @ManyToOne
    @JoinColumn(name="id_employee", nullable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name="id_enterprise", nullable = false)
    private Enterprise enterprise;
    @Column(name="state", nullable = false)
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
