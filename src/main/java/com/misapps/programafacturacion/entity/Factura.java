package com.misapps.programafacturacion.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Factura {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_factura;
	@Column
	private int id_cliente;
	@Column
	private Date fecha;

	public Factura() {

	}

	public Factura(int id_cliente, Date fecha) {
		super();
		this.id_cliente = id_cliente;
		this.fecha = fecha;
	}

	public int getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Factura [num_factura=" + num_factura + ", id_cliente=" + id_cliente + ", fecha=" + fecha + "]";
	}

}
