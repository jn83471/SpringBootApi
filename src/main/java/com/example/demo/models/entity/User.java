package com.example.demo.models.entity;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Entity

@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	@NotNull
	private String email;
	@NotNull
	private String password;
	private String access_token;
	private Date expires_at;
	
	private Date create_at;
	private Date update_at;

	
	@PrePersist
	public void prePersist() {
		this.create_at=new Date();
		this.update_at=new Date();
		Calendar cal = Calendar.getInstance(); 
		cal.add(Calendar.YEAR, 1);
		this.expires_at=cal.getTime();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public Date getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}


	public Date getUpdate_at() {
		return update_at;
	}


	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}


	public Date getExpires_at() {
		return expires_at;
	}


	public void setExpires_at(Date expires_at) {
		this.expires_at = expires_at;
	}
	
	
	
	
}
