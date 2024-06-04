
package giros.y.cambio.de.moneda;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int numeroIdentificacion;
    private int numeroTelefono;
    private String correoElectronico;
    private String direccionResidencia;

    public Persona(String nombre, String apellido, int numeroIdentificacion, int numeroTelefono, String correoElectronico, String direccionResidencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public String toString() {
        return this.nombre + this.apellido + this.numeroIdentificacion + this.numeroTelefono + this.correoElectronico + this.direccionResidencia  ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


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
        return direccionResidencia;
    }

    public void setDireccionResidencia(String DireccionResidencia) {
        this.direccionResidencia = DireccionResidencia;
    }
    
}
