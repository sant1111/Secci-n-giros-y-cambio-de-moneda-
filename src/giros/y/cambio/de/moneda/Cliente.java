
package giros.y.cambio.de.moneda;

import Logica.giros.y.cambio.moneda.Transaccion;
import Logica.mensajeria.Envio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cliente extends Persona{
    private int idCliente = 0;
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
    
    //NUEVO METODO (se crea el documento donde se almacenan todos los clientes registrados )
    public void crearArchivoClientes(){
        try{
            File archivoClientes = new File ("Clientes.txt");
            if (archivoClientes.createNewFile()){
                System.out.println("Archivo creado" + archivoClientes.getName());
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch ( Exception evt) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }
    //NUEVO metodo  (agregar los clientes al archivo txt
    public void agregarRegistroCliente(){
        idCliente ++;
        System.out.println(idCliente);
        try {
            //FileWriter fileWriter = new FileWriter("Clientes.txt",Charset.forName("utf-8"), true);
            BufferedWriter bw = new BufferedWriter( new FileWriter("Clientes.txt", true));
            bw.write(getIdCliente()+","+getNombre()+","+getApellido()+","+String.valueOf(getNumeroIdentificacion())+","+//con String.valueOf()  se convierte a cadena el entero
                    String.valueOf(getNumeroTelefono())+","+getCorreoElectronico()+","+getDireccionResidencia()+"\n");
            bw.close();
            
        }catch(Exception evt){
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente " + evt.toString());
        }
    }
    //Nuevo metodo mostrar los clientes en la tabla 
    public void mostrarClientes(JTable tablaClientes){
        String nombreArchivo = "Clientes.txt"; // ruta del archivo a mostrar
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader  br = new BufferedReader(new FileReader(archivo));
            //se lee la primera linea
            String pirmeraLinea  = br.readLine().trim();
            
            //se crea la tabla 
            DefaultTableModel modelo = new DefaultTableModel();
                //se agregan las columnas a la modelo
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Numero identificacion");
            modelo.addColumn("Numero Telefono");
            modelo.addColumn("Correo Electronico");
                //se agrega el modelo a la tabla
            tablaClientes.setModel(modelo);
            
            //se crea una Array que guarda las lineas del archivo txt
            Object[] lineasTablaClientes = br.lines().toArray();
                //se lee cada linea del archivo txt
            for ( int i = 0; i < lineasTablaClientes.length; i++){
                //se guarda los datos del cliente que estan guardados en el array "lineasRablaClientes en "datosFila"
                String  fila= lineasTablaClientes[i].toString().trim();
                //Se separan los datos y se guardan en el array "filas"
                String[] datosFila = fila.split(",");
                //Se añade al modelo
                modelo.addRow(datosFila);
                // se le da el modelo a la tabla 
                tablaClientes.setModel(modelo);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error " + e.toString() );
        }
        
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
