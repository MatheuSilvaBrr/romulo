package exercicio4;

public class Canario extends Ave{
	//reescrevendo métodos da classe mãe @Override
	@Override
	public void emitirSom() {
		System.out.println("Emitindo som parecido cirene");
	}
	
	@Override
	public void voar() {
		System.out.println("Pula ");
	}
	
}
