
package giros.y.cambio.de.moneda;

// abstract porque alguno de sus metodos son abstractos
public abstract class Empleado extends Persona{
    private int idEmpleado;
    
    //puse abstractas porque todavia no se que va 
    public abstract int ingresarSistema();
    public abstract int seleccionarServicio();
    
    
}
