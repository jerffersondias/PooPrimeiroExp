public class Carro {
	String marca;
	String cor;
	String placa;
	int velocidade_atual;
	char marcha_atual;
	boolean freio_de_mao_puxado;
	boolean chave_virada;
	int novaVelocidade;
	
	public Carro(String marca, String cor, String placa, int Velocidade, String
			machaAtual, int novaVelocidade,
			boolean freioAcionado, boolean chaveAcionada) {
			this.marca = marca;
			this.cor = cor;
			this.placa = placa;
			this.velocidade_atual = velocidade_atual;
			this.marcha_atual = marcha_atual;
			this.novaVelocidade = novaVelocidade;
			this.freio_de_mao_puxado = freio_de_mao_puxado;
			this.chave_virada = chave_virada;
			}
	
	public String toString() {
		return "Marca: " + marca + ", Cor: " + cor + ", Placa: "+placa+ ", Velocidade: " + velocidade_atual +
		", Marcha Atual: " + marcha_atual + "\n, Nova velocidade: "+novaVelocidade
		+ ", Freio acionado: " + freio_de_mao_puxado + ", Chave acionada: "+ chave_virada;
		}
	
	
	
	public void ligar (){
		chave_virada = true;
	}
	
	public void acelerar_ate (int velocidadeN ){
		velocidade_atual = velocidadeN;
		novaVelocidade = novaVelocidade + velocidadeN;
	}
	
	public void mudar_marcha(int marcha){
		
	}
	
	public void parar(){
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getVelocidade_atual() {
		return velocidade_atual;
	}

	public void setVelocidade_atual(int velocidade_atual) {
		this.velocidade_atual = velocidade_atual;
	}

	public char getMarcha_atual() {
		return marcha_atual;
	}

	public void setMarcha_atual(char marcha_atual) {
		this.marcha_atual = marcha_atual;
	}

	public boolean isFreio_de_mao_puxado() {
		return freio_de_mao_puxado;
	}

	public void setFreio_de_mao_puxado(boolean freio_de_mao_puxado) {
		this.freio_de_mao_puxado = freio_de_mao_puxado;
	}

	public boolean isChave_virada() {
		return chave_virada;
	}

	public void setChave_virada(boolean chave_virada) {
		this.chave_virada = chave_virada;
	}
	
}
