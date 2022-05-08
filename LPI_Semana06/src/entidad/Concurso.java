package entidad;

public class Concurso {
	private int idConcurso;
	private String Nombre;
	private double Premio;
	private double Precio;
	
	public int getIdConcurso() {
		return idConcurso;
	}
	public void setIdConcurso(int idConcurso) {
		this.idConcurso = idConcurso;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPremio() {
		return Premio;
	}
	public void setPremio(double premio) {
		Premio = premio;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
}
