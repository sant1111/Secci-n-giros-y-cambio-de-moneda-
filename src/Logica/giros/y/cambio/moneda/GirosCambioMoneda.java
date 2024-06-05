package Logica.giros.y.cambio.moneda;
import Logica.mensajeria.Envio;
import giros.y.cambio.de.moneda.Cliente;// se importa la clase cliente
import java.util.ArrayList; // se importa la ArrayLIsta 
import java.util.Scanner;

public class GirosCambioMoneda {
    ArrayList<Cliente> clientesDia = new ArrayList<Cliente>() ;// se hace un arrayList clintesDia de tipo cliente y se inicializa
    
    public void alerta(){
        System.out.println("estas en servicio de giros y cambio de moneda");
    }
    
    // se cambio el metodo registrar cliente de la clase cliente a esta clase
    public void registrarCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nombre = entrada.next();
        System.out.println("ingrese el apellido");
        String apellido = entrada.next();
        System.out.println("ingrese la direccion de residencia");
        String direccionResidencia = entrada.next();
        System.out.println("ingrese el numero de identificacion ");
        int numeroIdentificacion = entrada.nextInt();
        System.out.println("ingrese el numero de telefono");
        int numeroTelefono = entrada.nextInt();
        System.out.println("ingrese el correo electronico");
        String correoElectronico = entrada.next();
        Envio detallesEnvio = new Envio();
        Transaccion detallesTransaccion = new Transaccion();
      // se añade el objeto de tipo cliente al arrayList Clientes dia
        clientesDia.add(new Cliente(12, detallesEnvio, detallesTransaccion, nombre, apellido, numeroIdentificacion, numeroTelefono, correoElectronico, direccionResidencia));
        
    }
    public void info(){
        System.out.println("tamaño del ArrayList");
        System.out.println(clientesDia.size());
        System.out.println(clientesDia);//la clase ArrayList ya tinee sobreescrito el metodo toString
    }
}
