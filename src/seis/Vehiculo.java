package seis;

public abstract class Vehiculo{
	private int peso;
	public final void setPeso(int p){ // Este metodo no se podra sobreescribir ya que es constante
		peso=p;
	}
	public abstract int getVelocidadActual();
}