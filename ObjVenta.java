public class ObjVenta {
    private int NumFactura;
    private String NombreCliente;
    private String Nombrevendedor;
    private Double TotalVenta;
    private int CantidadArticulos;
    private String Motivo; // solo para los eliminados
    private int EstadoVenta;

    public ObjVenta(int numFactura, String nombreCliente, String nombrevendedor, Double totalVenta,
            int cantidadArticulos, String motivo, int estadoVenta) {
        NumFactura = numFactura;
        NombreCliente = nombreCliente;
        Nombrevendedor = nombrevendedor;
        TotalVenta = totalVenta;
        CantidadArticulos = cantidadArticulos;
        Motivo = motivo;
        EstadoVenta = estadoVenta;
    }

    public int getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(int numFactura) {
        NumFactura = numFactura;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getNombrevendedor() {
        return Nombrevendedor;
    }

    public void setNombrevendedor(String nombrevendedor) {
        Nombrevendedor = nombrevendedor;
    }

    public Double getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        TotalVenta = totalVenta;
    }

    public int getCantidadArticulos() {
        return CantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        CantidadArticulos = cantidadArticulos;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public int getEstadoVenta() {
        return EstadoVenta;
    }

    public void setEstadoVenta(int estadoVenta) {
        EstadoVenta = estadoVenta;
    }

}
