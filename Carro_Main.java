public class Carro_Main {

	public static void main(String[] args) {
		new Carro(null, null, null, 0, null, 0, false, false);
		
		Carro Golf = new Carro(null, null, null, 0, null, 0, false, false); 
		Golf.setMarca("Marca VW");
		Golf.setCor("Preto");
		Golf.setPlaca("2832");
		
		System.out.println(Golf.toString());
		Golf.acelerar_ate(50);
		System.out.println(Golf.toString());
		Golf.acelerar_ate(188);
		System.out.println(Golf.toString());
		Golf.ligar();
		System.out.println(Golf.toString());

	}
	

}
