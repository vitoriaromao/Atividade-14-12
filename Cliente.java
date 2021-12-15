package fami41;

public class Cliente {
	private String nome;
	private String sobrenome; 
	private String endereço;
	private double altura; 
	private float cpf; 
	private int idade; 
	
	
	public Cliente (String nome, String sobrenome, String endereço, double altura, float cpf, int idade)
	{
		this.nome = nome;
		this.sobrenome = sobrenome; 
		this.endereço = endereço; 
		this.altura = altura; 
		this.cpf = cpf;
		this.idade = idade; 
	}
	
	public void imprimirInfo()
	  {
        System.out.println("\nU cliente é "+nome+" "+sobrenome+" com o CPF "+cpf+" de idade "+idade+". Sua altura é: "+altura+" "
        		+ "e com o endereço "+endereço);
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
