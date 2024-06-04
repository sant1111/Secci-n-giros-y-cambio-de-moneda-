
package Logica.mensajeria;
import giros.y.cambio.de.moneda.Cliente;
import java.util.ArrayList;

public class Mensajeria {
   ArrayList<Cliente> clientesDia = new ArrayList<Cliente>() ;// se hace un arrayList clintesDia de tipo cliente y se inicializa
    
    public void alerta(){
        System.out.println("estas en el servicio de mensajeria");
    }
}
