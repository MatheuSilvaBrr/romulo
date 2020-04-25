package exercicio5;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		// Validando nome se é vazio ou tamanho maior que 50
		if(nome.isEmpty() || nome.length() > 50) {
			throw new IllegalArgumentException("Nome não deve ser maior que 50 caracteres");
		}
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		//idade não pode ser menor que 18 ou maior que 99
		if(idade < 18 || idade > 99) {
			throw new IllegalArgumentException("Idade não pode ser menor que 18 e nem maior que 99");
		}
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//verificando se email é maior que 60 ou menor que 10
		if(email.length() > 60 || email.length() < 10) {
			throw new IllegalArgumentException("Email não pode ser menor que 10 e nem maior que 60 caracteres");
		}
		
		//verificando se email tem @ e um . se sim pode alterar o email 
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		}
		throw new IllegalArgumentException("Email deve conter pelo menos um '.' e um '@' ");
	}
	
}
