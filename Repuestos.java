public class Repuestos {
    private int Idrepuesto;
    private String Descripcion;
    private int Cantidad;
    private int StockMinimo;
    private Double Precio;
    private  int Categoria;

    public Repuestos() {
    }

    public Repuestos(int idrepuesto, String descripcion, int cantidad, int stockMinimo, Double precio, int categoria) {
        Idrepuesto = idrepuesto;
        Descripcion = descripcion;
        Cantidad = cantidad;
        StockMinimo = stockMinimo;
        Precio = precio;
        Categoria = categoria;
    }

    public int getIdrepuesto() {
        return Idrepuesto;
    }

    public void setIdrepuesto(int idrepuesto) {
        Idrepuesto = idrepuesto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
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

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

}
