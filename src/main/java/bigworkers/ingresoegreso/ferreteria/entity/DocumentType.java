package bigworkers.ingresoegreso.ferreteria.entity;

public class DocumentType {

    private long idDocumentType;
    private String description;
    private String initials;
    private boolean state;

    public long getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(long idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "idDocumentType=" + idDocumentType +
                ", description='" + description + '\'' +
                ", initials='" + initials + '\'' +
                ", state=" + state +
                '}';
    }
}
