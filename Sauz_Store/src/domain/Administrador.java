package domain;

public class Administrador extends Usuario {
    private String rolAdmin;

    public Administrador() {
        super();
    }

    public Administrador(int id, String nombre, String apellido, String correo, String telefono, boolean estado, String rolAdmin) {
        super(id, nombre, apellido, correo, telefono, estado);
        this.rolAdmin = rolAdmin;
    }

    public String getRolAdmin() {
        return rolAdmin;
    }

    public void setRolAdmin(String rolAdmin) {
        this.rolAdmin = rolAdmin;
    }
}