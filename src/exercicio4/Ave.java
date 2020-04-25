package exercicio4;

public abstract class Ave {
	
	//Mudei para protected para que suas classe filhas consigam ter acesso ao atributo e aos m�todos para sobrescrever 
	//porque o private s� fica vis�vel apenas para a classe em que estamos
	protected String especie;
	
	protected void emitirSom() {};
	protected void voar() {};

}
