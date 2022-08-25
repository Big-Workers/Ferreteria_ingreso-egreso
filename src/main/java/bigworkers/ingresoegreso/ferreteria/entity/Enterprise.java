package bigworkers.ingresoegreso.ferreteria.entity;

public class Enterprise {

    private long idEnterprise;
    private String name;
    private TipoDocumento tipoDocumento;
    private String document;
    private String phone;
    private String address;
    private boolean status;

    public Enterprise(long idEnterprise, String name, TipoDocumento tipoDocumento, String document, String phone, String address, boolean status) {
        this.idEnterprise = idEnterprise;
        this.name = name;
        this.tipoDocumento = tipoDocumento;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.status = status;
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

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "idEnterprise=" + idEnterprise +
                ", name='" + name + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}