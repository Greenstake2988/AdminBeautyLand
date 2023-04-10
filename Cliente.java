import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private Double deuda;
    private Compra[] compras;
    private ArrayList<Movimiento> abonos;
    
    public Cliente(){
        this.setDeuda(null);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getDeuda() {
        if (!(this.abonos == null)) {
            Double sumaAbonos = 0.0;
            for (Movimiento abono : abonos) {
                sumaAbonos =+ abono.getMonto();
            }
            return this.deuda - sumaAbonos;
        }
        return this.deuda;
        
    }
    public void setDeuda(Double deuda) {
        this.deuda = deuda != null ? deuda : 0.0;
    }
  
    public Compra[] getCompras() {
        return compras;
    }
    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }
    public ArrayList<Movimiento> getAbonos() {
        return abonos;
    }
    public void setAbonos(ArrayList<Movimiento> abonos) {
        this.abonos = abonos;
    }

}
