import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private double caja;
    private Compra[] compras;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
    private ArrayList<Movimiento> retiros = new ArrayList<Movimiento>();

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getCaja() {
        Double sumaRetiros = 0.0;
        for (Movimiento retiro : retiros) {
            sumaRetiros =+ retiro.getMonto();
        }
        return caja - sumaRetiros;
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

    public  ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


    public ArrayList<Movimiento> getRetiros() {
        return retiros;
    }

    public void setRetiros(ArrayList<Movimiento> retiros) {
        this.retiros = retiros;
    }

    public Cliente getClienteId(int id){
        return clientes.get(id - 1);
    }
}
