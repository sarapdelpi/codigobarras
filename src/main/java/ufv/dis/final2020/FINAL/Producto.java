package ufv.dis.final2020.FINAL;

public class Producto {

	private String nombre; 
	private String categoria; 
	private String EAN13;
	private float precio;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEAN13() {
		return EAN13;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public Producto(String nombre, String categoria, String eAN13, float precio) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		EAN13 = eAN13;
		this.precio = precio;
	}
	
	
	
}
