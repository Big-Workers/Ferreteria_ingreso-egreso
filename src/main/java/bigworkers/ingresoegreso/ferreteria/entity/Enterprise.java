package bigworkers.ingresoegreso.ferreteria.entity;

public class Enterprise {

    private long idEnterprise;
    private String name;
    private String nit;
    private String address;
    private String phone;
    private Transaction transaction;
    private Employee employee;
    private boolean state;

    public long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "idEnterprise=" + idEnterprise +
                ", name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", transaction=" + transaction +
                ", employee=" + employee +
                ", state=" + state +
                '}';
    }
}
