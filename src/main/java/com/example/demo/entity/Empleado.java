package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "empleado")
public class Empleado {

	@Id
	@Column(name="id")
	private long id;
	@Column(name="dni")
	private int dni;
	@Column(name="nombres")
	private String nombres;

@Column(name="direccion")
private String direccion;

@Column(name="cargo")
private String cargo;

@Column(name="edad")
private int edad;

@Column(name="sexo")
private String sexo;

@Column(name="telefono")
private int telefono;

@Column(name="correo")
private String correo;

@Column(name="salario")
private String salario;

public Empleado() {
	
}
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getSalario() {
	return salario;
}

public void setSalario(String salario) {
	this.salario = salario;
}

}
