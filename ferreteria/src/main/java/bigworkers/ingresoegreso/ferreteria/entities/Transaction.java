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
    @Column(name="state", nullable = false)
    private boolean state;
    @OneToOne
    @JoinColumn(name="id_employee")
    private Employee employee;

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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", concept='" + concept + '\'' +
                ", detail='" + detail + '\'' +
                ", amount=" + amount +
                ", state=" + state +
                ", employee=" + employee +
                '}';
    }
}
