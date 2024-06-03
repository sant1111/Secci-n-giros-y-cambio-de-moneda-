
package giros.y.cambio.de.moneda;

public class Cliente extends Persona{
    private int idCliente;
    private String detallesEnvio;
    private String detallesTransaccion;

    public Cliente(int idCliente, String detallesEnvio, String detallesTransaccion, String nombre, String apellido, int numeroIdentificacion, int numeroTelefono, String correoElectronico, String direccionResidencia) {
        super(nombre, apellido, numeroIdentificacion, numeroTelefono, correoElectronico, direccionResidencia);
        this.idCliente = idCliente;
        this.detallesEnvio = detallesEnvio;
        this.detallesTransaccion = detallesTransaccion;
    }

    public void registrarCliente(){
        System.out.println("registrar cliente");
    }
    public void actualizarCliente(){
        System.out.println("Actualizar cliente");
    }
    public void informacionCliente(){
        System.out.println("info cliente");
    }
    public void eliminarCliente(){
        System.out.println("Eliminarcliente");
    }
    
    //getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDetallesEnvio() {
        return detallesEnvio;
    }

    public void setDetallesEnvio(String detallesEnvio) {
        this.detallesEnvio = detallesEnvio;
    }

    public String getDetallesTransaccion() {
        return detallesTransaccion;
    }

    public void setDetallesTransaccion(String detallesTransaccion) {
        this.detallesTransaccion = detallesTransaccion;
    }
    
}
