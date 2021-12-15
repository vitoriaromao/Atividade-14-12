package fami41;

public class Cliente {
	private String nome;
	private String sobrenome; 
	private String endere�o;
	private double altura; 
	private float cpf; 
	private int idade; 
	
	
	public Cliente (String nome, String sobrenome, String endere�o, double altura, float cpf, int idade)
	{
		this.nome = nome;
		this.sobrenome = sobrenome; 
		this.endere�o = endere�o; 
		this.altura = altura; 
		this.cpf = cpf;
		this.idade = idade; 
	}
	
	public void imprimirInfo()
	  {
        System.out.println("\nU cliente � "+nome+" "+sobrenome+" com o CPF "+cpf+" de idade "+idade+". Sua altura �: "+altura+" "
        		+ "e com o endere�o "+endere�o);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
