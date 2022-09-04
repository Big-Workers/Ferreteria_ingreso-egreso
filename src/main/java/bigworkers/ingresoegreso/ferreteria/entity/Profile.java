package bigworkers.ingresoegreso.ferreteria.entity;

public class Profile {

    private long idProfile;
    private String image;
    private boolean state;

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "idProfile=" + idProfile +
                ", image='" + image + '\'' +
                ", state=" + state +
                '}';
    }
}
