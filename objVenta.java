public class objVenta {
    private int Numerofactura; // esta es la factura
    private String Cliente;
    private String Vendedor;
    private Double Venta;
    private int Cantida;
    private String Motivo;
    private int Estadoventa;

    public objVenta(int numerofactura, String cliente, String vendedor, Double venta, int cantida, String motivo,
            int estadoventa) {
        Numerofactura = numerofactura;
        Cliente = cliente;
        Vendedor = vendedor;
        Venta = venta;
        Cantida = cantida;
        Motivo = motivo;
        Estadoventa = estadoventa;
    }

    public objVenta() {
    }

    public int getNumerofactura() {
        return Numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        Numerofactura = numerofactura;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String vendedor) {
        Vendedor = vendedor;
    }

    public Double getVenta() {
        return Venta;
    }

    public void setVenta(Double venta) {
        Venta = venta;
    }

    public int getCantida() {
        return Cantida;
    }

    public void setCantida(int cantida) {
        Cantida = cantida;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public int getEstadoventa() {
        return Estadoventa;
    }

    public void setEstadoventa(int estadoventa) {
        Estadoventa = estadoventa;
    }

}
