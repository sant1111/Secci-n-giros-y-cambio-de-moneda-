
package giros.y.cambio.de.moneda;

import Logica.giros.y.cambio.moneda.Transaccion;
import Logica.mensajeria.Envio;

public class Cliente extends Persona{
    private int idCliente;
    private Envio detallesEnvio;
    private Transaccion detallesTransaccion;
    
    public Cliente(){
        
    }
    
    public Cliente(int idCliente, Envio detallesEnvio, Transaccion detallesTransaccion, String nombre, String apellido, int numeroIdentificacion, int numeroTelefono, String correoElectronico, String direccionResidencia) {
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

    @Override
    public String toString() {
        return super.toString()+ "\n" + this.idCliente+ "\n" + this.detallesEnvio+ "\n" + this.detallesTransaccion; 
    }
    
    
    //getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Envio getDetallesEnvio() {
        return detallesEnvio;
    }

    public void setDetallesEnvio(Envio detallesEnvio) {
        this.detallesEnvio = detallesEnvio;
    }

    public Transaccion getDetallesTransaccion() {
        return detallesTransaccion;
    }

    public void setDetallesTransaccion(Transaccion detallesTransaccion) {
        this.detallesTransaccion = detallesTransaccion;
    }
    
}
