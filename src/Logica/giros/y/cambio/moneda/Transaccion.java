

package Logica.giros.y.cambio.moneda;

public class Transaccion {
    private int idTransaccion;
    private Conversion conversionMoneda;
    private Entrega detallesEntrega;

    public Transaccion(int idTransaccion, Conversion conversionMoneda, Entrega detallesEntrega) {
        this.idTransaccion = idTransaccion;
        this.conversionMoneda = conversionMoneda;
        this.detallesEntrega = detallesEntrega;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Conversion getConversionMoneda() {
        return conversionMoneda;
    }

    public void setConversionMoneda(Conversion conversionMoneda) {
        this.conversionMoneda = conversionMoneda;
    }

    public Entrega getDetallesEntrega() {
        return detallesEntrega;
    }

    public void setDetallesEntrega(Entrega detallesEntrega) {
        this.detallesEntrega = detallesEntrega;
    }
    
    
}
