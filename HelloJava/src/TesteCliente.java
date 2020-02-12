
public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		
		cliente.setNome("Relton Fidelis");
		cliente.setCpf("135.192.778-15");
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
	}

}
