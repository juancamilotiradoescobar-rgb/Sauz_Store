package domain;

public class Cliente extends Usuario {
    private String direccionEnvio;
    private String ciudad;
    private String codigoPostal;

    public Cliente() {
        super();
    }

    public Cliente(int id, String nombre, String apellido, String correo, String telefono, boolean estado, String direccionEnvio, String ciudad, String codigoPostal) {
        super(id, nombre, apellido, correo, telefono, estado);
        this.direccionEnvio = direccionEnvio;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
