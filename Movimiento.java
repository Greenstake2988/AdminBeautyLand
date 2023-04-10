import java.util.Date;

public class Movimiento {
    private Date fecha;
    private Double monto;
    private MetodoPago metodoPago;

    public enum MetodoPago {
        EFECTIVO,
        TRANSFERENCIA
    }
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
