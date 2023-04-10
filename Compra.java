import java.util.Date;
import java.text.SimpleDateFormat;

public class Compra {
    String fecha;
    Producto[] productos;


    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {

        this.fecha = fecha;
    }
    public void setFecha() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
        String fechaActualFormateada = formatoFecha.format(fechaActual);

        this.setFecha(fechaActualFormateada);;
    }

    public Producto[] getProductos() {
        return productos;
    }
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }    
}
