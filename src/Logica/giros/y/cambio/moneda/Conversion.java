
package Logica.giros.y.cambio.moneda;

public class Conversion {
    private double cantidad;
    private double resultado;

    public Conversion(double cantidad, double resultado) {
        this.cantidad = cantidad;
        this.resultado = resultado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
