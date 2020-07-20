import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.TipoPessoa;

public class TesteClienteEndereco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Angelo Reis");
		cliente.setEmail("angelo.desenvolvedor@gmail.com");
		cliente.setDocumentoReceitaFederal("975.559.322-53");
		cliente.setTipo(TipoPessoa.FISICA);
		
		manager.persist(cliente);
		
		trx.commit();

	}

}
