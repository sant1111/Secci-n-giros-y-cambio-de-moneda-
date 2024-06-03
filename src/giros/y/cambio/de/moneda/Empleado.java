
package giros.y.cambio.de.moneda;

// abstract porque alguno de sus metodos son abstractos
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
        System.out.println("ingresar sistema ");
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }    
    
}
