//1. ¿Compilará el siguiente código:
// Da error porque tienen que devolver el mismo tipo

class Prueba{
	protected String nombre;
	protected int id;

	public String getIdent(){
		return nombre;
	}
	public int getIdent2(){
		return id;
	}
}