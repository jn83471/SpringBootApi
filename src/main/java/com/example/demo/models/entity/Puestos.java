package com.example.demo.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "puestos")
public class Puestos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String display_name;
	private Integer Estatus;
	
	private Date create_At;
	private Date updated_at;
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
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public Integer getEstatus() {
		return Estatus;
	}
	public void setEstatus(Integer estatus) {
		Estatus = estatus;
	}
	public Date getCreate_At() {
		return create_At;
	}
	public void setCreate_At(Date create_At) {
		this.create_At = create_At;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
