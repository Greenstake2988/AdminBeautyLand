import java.util.ArrayList;

public class TiendaTestDrive {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Tienda tienda = new Tienda();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Movimiento> abonos = new ArrayList<Movimiento>();
        
        tienda.setCaja(1000.00);
        tienda.setNombre(helper.getUserInput("Dame el nombre de la tienda"));

        int numClientes = Integer.parseInt(helper.getUserInput("Cuantos clientes tiene tu tienda"));

        for (int i = 1; i <= numClientes; i++) {
            Cliente cliente = new Cliente();
            cliente.setId(i);
            cliente.setNombre(helper.getUserInput("Nombre del cliente " + i));
            clientes.add(cliente);
        }
        
        tienda.setClientes(clientes);
        Cliente cliente1 = tienda.getClienteId(1);
        cliente1.setDeuda(1000.0);
        System.out.println(cliente1.getDeuda());
        Movimiento abono = new Movimiento();
        abono.setMonto(200.0);
        abono.setMetodoPago(Movimiento.MetodoPago.EFECTIVO);
        abonos.add(abono);
        cliente1.setAbonos(abonos);
        System.out.println(cliente1.getAbonos().get(0).getMetodoPago());
        
    }
}
