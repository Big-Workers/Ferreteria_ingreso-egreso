package bigworkers.ingresoegreso.ferreteria.entities;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_employee")
    private long idEmployee;
    @ManyToOne
    @JoinColumn(name="id_document_type", nullable = false)
    private DocumentType documentType;
    @Column(name="document_number", nullable = false)
    private String documentNumber;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="surnames", nullable = false)
    private String surnames;
    @Column(name="address", nullable = false)
    private String address;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="phone", nullable = false)
    private String phone;
    @OneToOne
    @JoinColumn(name="id_profile",nullable = false)
    private Profile profile;
    @Column(name="name", nullable = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name="id_enterprise",nullable = false)
    private Enterprise enterprise;
    @OneToMany
    @JoinColumn(name="id_transaction",nullable = false)
    private Transaction transaction;
    @Column(name="state", nullable = false)
    private boolean state;

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprise=" + enterprise +
                ", transaction=" + transaction +
                ", state=" + state +
                '}';
    }
}
