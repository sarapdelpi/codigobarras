package ufv.dis.final2020.FINAL;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventarioTEST {

	@Test
	public void createProduct() {
		Producto p = new Producto("leche", "lacteo", "6143987609188", 1.5f);
		assertEquals("leche",p.getNombre());
	}

	@Test
	public void addProduct() {
		Producto p = new Producto("camiseta","ropa", "8402384813825", 2.5f);
		Inventario inv = new Inventario();
		inv.addproducto(p);
		
		assertEquals(1, inv.listsize());
	}


	@Test
	public void removeProduct() {
		Producto p1 = new Producto("camiseta","ropa", "8402384813825", 2.5f);
		Inventario inv1 = new Inventario();
		inv1.addproducto(p1);
		inv1.removeproducto(p1);
		
		assertEquals(0, inv1.listsize());
	}

}
