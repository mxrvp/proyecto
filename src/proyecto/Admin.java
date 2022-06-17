
package proyecto;

public class Admin {

    private String usuario = "Edwin";
    private String contrasena = "Hola";
    private String cedula = "000";

    public Admin() {}
    
    public Admin(String usuario, String contrasena, String cedula) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    
    
    
}
