
public class Cliente {
    private int id;
    private String nombre;
    private Double deuda;
    private Compra[] compras;
    private Abono[] abonos;
    
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
        return deuda;
    }
    public void setDeuda(Double deuda) {
        this.deuda = deuda != null ? deuda : 0.0;
    }
    public void setDeuda() {
        this.setDeuda(null);
    }
    public Compra[] getCompras() {
        return compras;
    }
    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }
    public Abono[] getAbonos() {
        return abonos;
    }
    public void setAbonos(Abono[] abonos) {
        this.abonos = abonos;
    }



}
