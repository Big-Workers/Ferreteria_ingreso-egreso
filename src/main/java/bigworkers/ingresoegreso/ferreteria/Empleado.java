package bigworkers.ingresoegreso.ferreteria;

public class Empleado {
    private String idUsuario;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidos;
    private String direcion;
    private String email;
    private int edad;
    private String rol;
    private boolean estado;

    public Empleado(String idUsuario, String tipoDocumento, String numeroDocumento, String nombre, String apellidos, String direccion, String email, int edad, String rol, boolean estado){
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direcion = direccion;
        this.email = email;
        this.edad = edad;
        this.rol = rol;
        this.estado = estado;
    }

    public Empleado() {

    }
    public String getIdUsuario() {return idUsuario;}
    public void setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;}

    public String getTipoDocumento() {return tipoDocumento;}
    public void setTipoDocumento(String tipoDocumento) {this.tipoDocumento = tipoDocumento;}

    public String getNumeroDocumento() {return numeroDocumento;}
    public void  setNumeroDocumento(String numeroDocumento) {this.numeroDocumento = numeroDocumento;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDirecion() {return direcion;}
    public void setDirecion(String direcion) {this.direcion = direcion;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getRol() {return rol;}
    public void setRol(String rol) {this.rol = rol;}

    public boolean getEstado() {return estado;}
    public void setEstado(boolean estado) {this.estado = estado;}

}
