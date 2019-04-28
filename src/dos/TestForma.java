package dos;

public class TestForma {
	public static void main(String args[]){
		Forma f = new Circulo();
		f.identidad();
		Circulo c = new Circulo();
		((Forma)c).identidad();
		((Circulo)f).identidad();
//		Forma f2 = new Forma(); las clase abstractas no se pueden instanciar
		Forma f2 = new Rombo();
		f2.identidad();
//		(Forma)f.identidad(); no le puedes hacer casting al metodo del objeto


//		estos aunque esten bien sintacticamente no hacen ningun funcion:
//		f = c;
//		c = f; No le podemos meter el objeto de tipo forma a circulo tendriamos que hacerle el casting
//		c = (Circulo) f;
	}
}