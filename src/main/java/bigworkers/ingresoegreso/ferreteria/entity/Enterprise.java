package bigworkers.ingresoegreso.ferreteria.entity;

public class Enterprise {

    private long idEnterprise;
    private String name;
    private String document;
    private String address;
    private String phone;

    public Enterprise(long idEnterprise, String name, String document, String address, String phone) {
        this.idEnterprise = idEnterprise;
        this.name = name;
        this.document = document;
        this.address = address;
        this.phone = phone;
    }

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    @Override
    public String toString() {
        return "Enterprise{" +
                "idEnterprise=" + idEnterprise +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
