
public class Carro {

	private String cor;
	private String modelo;
	private int veloAtual;
	private int VeloMaxima;
	private String ligar;
	private String acelerar;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVeloAtual() {
		return veloAtual;
	}
	public void setVeloAtual(int veloAtual) {
		this.veloAtual = veloAtual;
		
		
	}
	public int getVeloMaxima() {
		return VeloMaxima;
		
		
	}
	public void setVeloMaxima(int veloMaxima) {
		VeloMaxima = veloMaxima;
		
if (VeloMaxima == 0 || veloMaxima == 1){
			
			System.out.println("carro desligado");
			
		}else{
			
			System.out.println("carro ligado");
		}
	}
	public String getLigar() {
		return ligar;
	}
	public void setLigar(String ligar) {
		this.ligar = ligar;
	}
	public String getAcelerar() {
		return acelerar;
	}
	public void setAcelerar(String acelerar) {
		this.acelerar = acelerar;
	}

	
	
	

}
