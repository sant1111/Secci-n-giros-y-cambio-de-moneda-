
package giros.y.cambio.de.moneda;
import java.util.Scanner;

public  class Empleado extends Persona{
    private int idEmpleado;
    
    public Empleado (String nombre, String apellido, int numeroIdentificacion, int numeroTelefono, String correoElectronico,  String direccionResidencia,int idEmpleado){
        super(nombre,apellido,numeroIdentificacion,numeroTelefono,correoElectronico,direccionResidencia);
        this.idEmpleado = idEmpleado;
    }

    public void  ingresarSistema(){
        System.out.println("ingresar sistema ");
    }
    public void seleccionarServicio(){
        
        System.out.println("Seleccione un servicio \n 1 para mensajeria , 2 para giros y cambio de moneda");
        Scanner entrada = new Scanner(System.in);
        int servicio;
        servicio = entrada.nextInt();       
        if (servicio == 1) {
            System.out.println("Bienvenido al servicio de mensajeria");
        }else {
            System.out.println("Bienvenido al servicio de giros y cambio de moneda");
        }
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }    
    
    
}
