
package giros.y.cambio.de.moneda;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int numeroIdentificacion;
    private int numeroTelefono;
    private String correoElectronico;
    private String DireccionResidencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccionResidencia() {
        return DireccionResidencia;
    }

    public void setDireccionResidencia(String DireccionResidencia) {
        this.DireccionResidencia = DireccionResidencia;
    }
    
}
