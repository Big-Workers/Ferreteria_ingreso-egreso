package bigworkers.ingresoegreso.ferreteria.entity;

public class Profile {

    private long idProfile;

    private String name;

    private String password;
    private String image;
    private boolean state;

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", state=" + state +
                '}';
    }
}
