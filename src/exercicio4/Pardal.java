package exercicio4;

public class Pardal extends Ave{
	
	//reescrevendo m�todos da classe m�e @Override
	@Override
	public void emitirSom() {
		System.out.println("Piu Piu Piu");
	}
	
	@Override
	public void voar() {
		System.out.println("Batendo asas e voando");
	}
	
}
