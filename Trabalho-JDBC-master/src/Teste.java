
import dao.ClienteDao;
import dao.DataSource;
import model.Cliente;

public class Teste {

public static void main(String[] args) {
   DataSource dc = new DataSource();
   ClienteDao Banco = new ClienteDao(dc);
   Cliente Ricardo = new Cliente();
   Ricardo.setId(1);
   Ricardo.setNome("Ricardo");
   Ricardo.setEmail("Ricardo.ares@globo.com");
   Ricardo.setTelefone("132456789");
   Banco.inserirCliente(Ricardo);
   dc.closeConnection();
}
    
}
