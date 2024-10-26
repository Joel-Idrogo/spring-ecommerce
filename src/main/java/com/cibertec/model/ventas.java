package com.cibertec.model;
import java.util.Date;

public class ventas {
	private Integer id_venta;
	private Date fecha_venta;
	private String producto;
	private int cantidad;
	private double precio;
	
	public ventas() {
	}

	public ventas(Integer id_venta, Date fecha_venta, String producto, int cantidad, double precio) {
		super();
		this.id_venta = id_venta;
		this.fecha_venta = fecha_venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Integer getId_venta() {
		return id_venta;
	}

	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ventas [id_venta=" + id_venta + ", fecha_venta=" + fecha_venta + ", producto=" + producto
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
}
