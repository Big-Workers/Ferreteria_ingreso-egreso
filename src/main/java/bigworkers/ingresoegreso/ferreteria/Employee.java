package bigworkers.ingresoegreso.ferreteria;

public class Employee {
    private String idUser;
    private String documentType;
    private String documentNumber;
    private String name;
    private String surnames;
    private String address;
    private String phoneNumber;

    private String emails;
    private int age;
    private String role;
    private boolean state;

    public Employee(String idUser, String documentType, String documentNumber, String name, String surnames, String address, String phoneNumber, String emails, int age, String role, boolean state){
        this.idUser = idUser;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emails = emails;
        this.age = age;
        this.role = role;
        this.state = state;
    }

    public Employee() {

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

    public String getEmails() {return emails;}
    public void setEmails(String emails) {this.emails = emails;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}

    public boolean getState() {return state;}
    public void setState(boolean State) {this.state = state;}

}
