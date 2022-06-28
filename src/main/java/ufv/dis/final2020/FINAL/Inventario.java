package ufv.dis.final2020.FINAL;

import java.util.ArrayList;

public class Inventario {
	
	ArrayList <Producto> productos;
	
	public Inventario() {
		
		productos = new ArrayList <Producto>();
	}
	
	public void addproducto(Producto p) {
		productos.add(p);
	}
	
	public void removeproducto(Producto p) {
		productos.remove(p);
	}
	
	public int listsize() {
		return productos.size();
	}
	
	//Para el grid:
	
	public ArrayList<Producto> getProductos(){
		return productos;
	}
}
