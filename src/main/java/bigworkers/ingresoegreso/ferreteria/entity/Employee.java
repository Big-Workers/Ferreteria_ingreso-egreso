package bigworkers.ingresoegreso.ferreteria.entity;

public class Employee {
    private long idEmployee;
    private String email;

    private String profile;
    private String documentType;
    private String documentNumber;
    private String name;
    private String surnames;
    private String address;
    private String role;

    private String transaction;
    private String enterprise;
    private boolean state;

    public Employee() {
    }

    public Employee(long idEmployee, String documentType, String documentNumber, String name, String surnames, String address, String email, String profile, String role, String transaction, String enterprise, boolean state) {
        this.idEmployee = idEmployee;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.transaction = transaction;
        this.enterprise = enterprise;
        this.state = state;
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTransaction() {return transaction; }

    public void setTransaction(String transaction) {this.transaction = transaction; }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


}
