
package LogicaClasesPrincipales;

import Logica.giros.y.cambio.moneda.Transaccion;
import Logica.mensajeria.Envio;

public class Principal {

 
    public static void main(String[] args) {
            Cliente c1 = new Cliente(0, new Envio(), new Transaccion(), "santiago", "fonse", 0, 0, "aa", "rr");

    }
    
}
