package bigworkers.ingresoegreso.ferreteria.entity;

public class DocumentType {
    private long idDocumentType;
    private String Description;
    private String Initials;
    private boolean state;

    public DocumentType(long idDocumentType, String description, String initials, boolean state) {
        this.idDocumentType = idDocumentType;
        Description = description;
        Initials = initials;
        this.state = state;
    }

    public DocumentType() {

    }

    public long getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(long idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getInitials() {
        return Initials;
    }

    public void setInitials(String initials) {
        Initials = initials;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
