
package LogicaClasesPrincipales;

import Logica.giros.y.cambio.moneda.Transaccion;
import Logica.mensajeria.Envio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.StringJoiner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cliente extends Persona{
    private int idCliente ;
    private Envio detallesEnvio;
    private Transaccion detallesTransaccion;
    private double saldoCOP;
    private double saldoUSD;
    private double saldoEUR;

    public Cliente(int idCliente, Envio detallesEnvio, Transaccion detallesTransaccion, double saldoCOP, double saldoUSD, double saldoEUR) {
        this.idCliente = idCliente;
        this.detallesEnvio = detallesEnvio;
        this.detallesTransaccion = detallesTransaccion;
        this.saldoCOP = saldoCOP;
        this.saldoUSD = saldoUSD;
        this.saldoEUR = saldoEUR;
    }

    public Cliente(){
        
    }
  
    public Cliente(int idCliente, Envio detallesEnvio, Transaccion detallesTransaccion, String nombre, String apellido, int numeroIdentificacion, int numeroTelefono, String correoElectronico, String direccionResidencia) {
        super(nombre, apellido, numeroIdentificacion, numeroTelefono, correoElectronico, direccionResidencia);
        this.idCliente = idCliente;
        this.detallesEnvio = detallesEnvio;
        this.detallesTransaccion = detallesTransaccion;
    }

    public void editarClientes(JTable tablaClientes){
         // se limpia el archivo txt
        try{
            PrintWriter writer = new PrintWriter("Clientes.txt");
            writer.print("");
            writer.close();
        }catch(Exception e ) {
            JOptionPane.showMessageDialog(null, "ocurrio un problema" + e.toString());
        }
        // se crea los nuevos registros luedo de la eliminacion 
        try(BufferedWriter bw  = new BufferedWriter(new FileWriter(new File ("Clientes.txt")))) {// se usa el buffered writer
            StringJoiner joiner = new StringJoiner(",");// separa los string por ","
            for (int col = 0; col < tablaClientes.getColumnCount(); col++) {
                joiner.add(tablaClientes.getColumnName(col));
            }
           
            bw.write(joiner.toString());
            bw.newLine();
            
            for (int row = 0; row < tablaClientes.getRowCount(); row++) {
               joiner = new StringJoiner(",");// separa los string por ","
                for (int col = 0; col < tablaClientes.getColumnCount(); col++) {
                    Object objeto = tablaClientes.getValueAt(row, col);//se crea un objeto con el valor de la fila y la columna 
                    String valor = objeto== null ? "null" :objeto.toString();
                    joiner.add(valor);
               }
              
                bw.write(joiner.toString());
                bw.newLine();
                 
            }
            JOptionPane.showMessageDialog(null, "Se ha editado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error");
        }
    }
    // para borrar se compara el nombre del cliente 
    public void eliminarCliente(JTable tablaClientes, JTextField idCliente ){
        DefaultTableModel modelo = (DefaultTableModel)tablaClientes.getModel();//obtenemos el modelo de la tabla 
        for (int i = 0; i < modelo.getRowCount(); i++) {//for para iterar cada fila 
            if (((String)modelo.getValueAt(i, 0)).equals(idCliente.getText()));// se compara si el modelo de cada fila es igual al parametro idCliente
            modelo.removeRow(i);
            break;
        }
         // se limpia el archivo txt
        try{
            PrintWriter writer = new PrintWriter("Clientes.txt");
            writer.print("");
            writer.close();
        }catch(Exception e ) {
            JOptionPane.showMessageDialog(null, "ocurrio un problema" + toString());
        }
        // se crea los nuevos registros luedo de la eliminacion 
        try(BufferedWriter bw  = new BufferedWriter(new FileWriter(new File ("Clientes.txt")))) {// se usa el buffered writer
            for (int row = 0; row < tablaClientes.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner(",");// separa los string por ","
                for (int col = 0; col < tablaClientes.getColumnCount(); col++) {
                    Object objeto = tablaClientes.getValueAt(row, col);//se crea un objeto con el valor de la fila y la columna 
                    String valor = objeto== null ? "null" :objeto.toString();
                    joiner.add(valor);
               }
                
                bw.write(joiner.toString());
                bw.newLine();
               
            }
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error");
        }
    }
   
    //  NUEVO METODO 
    public void seleccionarCliente(JTable tablaClientes){
        try {
            int fila = tablaClientes.getSelectedRow();// se selecciona el numero de fila 
            if (fila >=0){
                setIdCliente(Integer.parseInt(tablaClientes.getValueAt(fila, 0).toString()));
                setNombre(tablaClientes.getValueAt(fila, 1).toString());
                setApellido(tablaClientes.getValueAt(fila, 2).toString());
                setNumeroIdentificacion(Integer.parseInt(tablaClientes.getValueAt(fila, 3).toString()));
                setNumeroTelefono(Integer.parseInt(tablaClientes.getValueAt(fila, 4).toString()));
                setCorreoElectronico(tablaClientes.getValueAt(fila, 5).toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error");
        }
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
            JOptionPane.showMessageDialog(null, "Se ha creado el archivo");
        }catch ( Exception evt) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }
    
    //NUEVO metodo  (agregar los clientes al archivo txt
    public void agregarRegistroCliente(){
        //System.out.println(idCliente);
        try {
            FileWriter fileWriter = new FileWriter("Clientes.txt",Charset.forName("utf-8"), true);
            //BufferedWriter bw = new BufferedWriter( new FileWriter("Clientes.txt", true));
            fileWriter.write("\n");
            fileWriter.write(String.valueOf(getIdCliente())+","+getNombre()+","+getApellido()+","+String.valueOf(getNumeroIdentificacion())+","+//con String.valueOf()  se convierte a cadena el entero
                    String.valueOf(getNumeroTelefono())+","+getCorreoElectronico()+","+getDireccionResidencia());
            fileWriter.write("\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Se ha agregado el registro");
        }catch(Exception evt){
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente " + evt.toString());
        }
    }
    //Nuevo metodo mostrar los clientes en la tabla 
    public void mostrarClientesTblRegistro(JTable tablaClientes){
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
    
    public void mostrarClientesTblAnadirSaldo(JTable tablaClientes){
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
            modelo.addColumn("Saldo COP");
            modelo.addColumn("Saldo USD");
            modelo.addColumn("Saldo EUR");
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
