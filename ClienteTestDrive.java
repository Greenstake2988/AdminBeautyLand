import java.util.ArrayList;

public class ClienteTestDrive {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Tienda tienda = new Tienda();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        tienda.setNombre(helper.getUserInput("Dame el nombre de la tienda"));

        int numClientes = Integer.parseInt(helper.getUserInput("Cuantos clientes tiene tu tienda"));

        for (int i = 1; i <= numClientes; i++) {
            Cliente cliente = new Cliente();
            cliente.setId(i);
            cliente.setNombre(helper.getUserInput("Nombre del cliente " + i));
            clientes.add(cliente);
        }
        
    }
}
