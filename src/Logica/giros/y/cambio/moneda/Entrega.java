
package Logica.giros.y.cambio.moneda;

public class Entrega {
    private String nombreDestinatario;
    private String apellidoDestinatario;
    private int numeroIdentificacionDestinatario;
    private int numeroTelefonoDestinatario;
    private boolean estadoEntrega;

    public Entrega(String nombreDestinatario, String apellidoDestinatario, int numeroIdentificacionDestinatario, int numeroTelefonoDestinatario, boolean estadoEntrega) {
        this.nombreDestinatario = nombreDestinatario;
        this.apellidoDestinatario = apellidoDestinatario;
        this.numeroIdentificacionDestinatario = numeroIdentificacionDestinatario;
        this.numeroTelefonoDestinatario = numeroTelefonoDestinatario;
        this.estadoEntrega = estadoEntrega;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getApellidoDestinatario() {
        return apellidoDestinatario;
    }

    public void setApellidoDestinatario(String apellidoDestinatario) {
        this.apellidoDestinatario = apellidoDestinatario;
    }

    public int getNumeroIdentificacionDestinatario() {
        return numeroIdentificacionDestinatario;
    }

    public void setNumeroIdentificacionDestinatario(int numeroIdentificacionDestinatario) {
        this.numeroIdentificacionDestinatario = numeroIdentificacionDestinatario;
    }

    public int getNumeroTelefonoDestinatario() {
        return numeroTelefonoDestinatario;
    }

    public void setNumeroTelefonoDestinatario(int numeroTelefonoDestinatario) {
        this.numeroTelefonoDestinatario = numeroTelefonoDestinatario;
    }

    public boolean isEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(boolean estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
    
    
}
