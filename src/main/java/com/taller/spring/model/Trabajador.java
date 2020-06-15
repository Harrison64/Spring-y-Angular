package com.taller.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Trabajador")
public class Trabajador {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private int codigo;
   private String nombre;
   private String apellido;
   private int telefono;
   private String cargo;
   private int salario;
   
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
}