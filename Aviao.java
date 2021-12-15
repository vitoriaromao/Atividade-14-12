package fami41;

public class Aviao {
	private String nomeAviao;
	private double numeroAviao;
	private float numPassageiro; 
	private float velocidade; 
	private double valorPassagem; 
	
	
	public Aviao (String nomeAviao,double numeroAviao,
			float numPassageiro, float velocidade, double valorPassagem)
	{
		this.nomeAviao = nomeAviao;
		this.numeroAviao = numeroAviao;
		this.numPassageiro = numPassageiro;
		this.velocidade = velocidade;
		this.valorPassagem = valorPassagem; 
		
	} 
    public void imprimirInfo() 
    {
    	System.out.println("\nO Avião" +nomeAviao+ " com o número" +numeroAviao+"comporta a quantidade de"
    			+numPassageiro+ "passageiros, e voa numa velocidade de"+velocidade+ "Km, custando apenas"
    			+valorPassagem+ "reais a passagem.");
    }
	public String getNomeAviao() {
		return nomeAviao;
	}
	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}
	public double getNumeroAviao() {
		return numeroAviao;
	}
	public void setNumeroAviao(double numeroAviao) {
		this.numeroAviao = numeroAviao;
	}
	public float getNumPassageiro() {
		return numPassageiro;
	}
	public void setNumPassageiro(float numPassageiro) {
		this.numPassageiro = numPassageiro;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
    
    
    
    
    
    
}
