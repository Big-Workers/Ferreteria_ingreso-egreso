package bigworkers.ingresoegreso.ferreteria.entity;

public class Employee {
    private String idUser;
    private String documentType;
    private String documentNumber;
    private String name;
    private String surnames;
    private String address;
    private String email;
    private String phoneNumber;
    private int age;
    private String role;
    private String enterprise;
    private boolean state;

    public Employee(String idUser, String documentType, String documentNumber, String name, String surnames, String address, String phoneNumber, String email, int age, String role, String enterprise, boolean state){
        this.idUser = idUser;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.enterprise = enterprise;
        this.role = role;
        this.state = state;
    }

    public String getIdUser() {return idUser;}
    public void setIdUser(String idUser) {this.idUser = idUser;}

    public String getDocumentType() {return documentType;}
    public void setDocumentType(String documentType) {this.documentType = documentType;}

    public String getDocumentNumber() {return documentNumber;}
    public void  setDocumentNumber(String documentNumber) {this.documentNumber = documentNumber;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurnames() {return surnames;}
    public void setSurnames(String surnames) {this.surnames = surnames;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getEmail() {return email;}
    public void setEmail(String emails) {this.email = emails;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}

    public String getEnterprise() {return enterprise;}
    public void setEnterprise(String empresa) {this.enterprise = empresa;}

    public boolean isState() {return state;}
    public boolean getState() {return state;}
    public void setState(boolean State) {this.state = state;}

    @Override
    public String toString() {
        return "Employee" +
                "\n     idUser = " + idUser +
                "\n     documentType = " + documentType +
                "\n     documentNumber = " + documentNumber +
                "\n     name = " + name +
                "\n     surnames = " + surnames +
                "\n     address = " + address +
                "\n     email = " + email +
                "\n     phoneNumber = " + phoneNumber +
                "\n     age = " + age +
                "\n     role = " + role +
                "\n     enterprise = " + enterprise +
                "\n     state = " + state;
    }
}
