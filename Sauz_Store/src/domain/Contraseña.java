package domain;

public class Contraseña {
    private int id;
    private int idUsuario;
    private String hashContraseña;
    private boolean estado;

    public Contraseña() {
    }

    public Contraseña(int id, int idUsuario, String hashContraseña, boolean estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.hashContraseña = hashContraseña;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getHashContraseña() {
        return hashContraseña;
    }

    public void setHashContraseña(String hashContraseña) {
        if (hashContraseña == null || hashContraseña.length() < 8) {
            throw new IllegalArgumentException("La contraseña ingresada debe tener al menos 8 caracteres");
        }
        this.hashContraseña = hashContraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
