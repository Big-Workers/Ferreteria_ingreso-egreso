package bigworkers.ingresoegreso.ferreteriaThymeleaf.entities;

import javax.persistence.*;

@Entity
@Table(name="enterprises")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_enterprise")
    private long idEnterprise;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="nit", nullable = false)
    private String nit;
    @Column(name="address", nullable = false)
    private String address;
    @Column(name="phone", nullable = false)
    private String phone;
    @Column(name="state")
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
                ", state=" + state +
                '}';
    }
}
