public class ObjFactura {
    private int NroFactura;
    private int idRepuesto;
    private int Cantidad;
    private Double TotalFactura;
    private String CedulaCliente;
    private String NombreCliente;

    public ObjFactura() {
    }

    public int getNroFactura() {
        return NroFactura;
    }

    public void setNroFactura(int nroFactura) {
        NroFactura = nroFactura;
    }

    public int getRepuesto() {
        return idRepuesto;
    }

    public void setRepuesto(int repuesto) {
        idRepuesto = repuesto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getTotalFactura() {
        return TotalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        TotalFactura = totalFactura;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        CedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

}
