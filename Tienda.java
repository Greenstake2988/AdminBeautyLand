public class Tienda {
    private String Nombre;
    private double caja;
    private Compra[] compras;
    private Cliente[] clientes; 

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getCaja() {
        return caja;
    }
    public void setCaja(double caja) {
        this.caja = caja;
    }
    public Compra[] getCompras() {
        return compras;
    }
    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

}
