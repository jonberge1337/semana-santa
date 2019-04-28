package cinco;

public class Dado extends Sorteo {
	Dado(){
		posibilidades = 6;
	}
	public int lanzar() {
		int max = 6;
		int min = 1;
		return (int) (Math.random()*((max - min) + 1) + min);
	}
}
