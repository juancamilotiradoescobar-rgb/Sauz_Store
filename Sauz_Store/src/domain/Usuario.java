package domain;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String correo, String telefono, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) { if (correo == null || !correo.contains("@")) { throw new IllegalArgumentException("El correo ingresado no es válido"); } this.correo = correo; }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}