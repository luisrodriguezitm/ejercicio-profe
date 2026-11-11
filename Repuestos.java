public class Repuestos {
    private int Idrepuesto;
    private int Categoria;
    private String Descripcion;
    private Double PrecioUnitario;
    private int Cantidad;
    private int StockMinimo;

    public Repuestos() {
    }

    public int getIdrepuesto() {
        return Idrepuesto;
    }

    public void setIdrepuesto(int idrepuesto) {
        Idrepuesto = idrepuesto;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getStockMinimo() {
        return StockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        StockMinimo = stockMinimo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}
