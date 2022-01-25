package com.example.demo.models.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Index;
@Entity
@Table(name = "prospects")
public class Prospect {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String calle;
	
	private String numero;
	private String colonia;
	private String cp;
	private String email;
	private String phone;
	
	private String rfc;
	private Integer Estatus;
	private String Motive;
	private Date created_at;
	private Date updated_at;
	
	

	private Date create_At;
	
	@PrePersist
	public void prePersist() {
		this.create_At=new Date();
		this.updated_at=new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Integer getEstatus() {
		return Estatus;
	}

	public void setEstatus(Integer estatus) {
		Estatus = estatus;
	}

	public String getMotive() {
		return Motive;
	}

	public void setMotive(String motive) {
		Motive = motive;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreate_At() {
		return create_At;
	}

	public void setCreate_At(Date create_At) {
		this.create_At = create_At;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "puestos",referencedColumnName = "id")
	private Puestos has_puesto;

	public Puestos getHas_puesto() {
		return has_puesto;
	}

	public void setHas_puesto(Puestos has_puesto) {
		this.has_puesto = has_puesto;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_prospect")
	private List<FilesOfProspects> hasfiles;

	public List<FilesOfProspects> gethasfiles() {
		return hasfiles;
	}

	public void sethas_hiles(List<FilesOfProspects> hasfiles) {
		this.hasfiles = hasfiles;
	}

	
	

	
}
