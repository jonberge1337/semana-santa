package cinco;

public class Moneda extends Sorteo {
	Moneda(){
		posibilidades = 2;
	}
	public int lanzar() {
		int max = 2;
		int min = 1;
		return (int) (Math.random()*((max - min) + 1) + min);
	}
}
