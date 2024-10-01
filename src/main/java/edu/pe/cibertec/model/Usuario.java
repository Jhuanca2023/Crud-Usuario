package edu.pe.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tbl_Usario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coUsuario;
	
	@Column(name ="name_usua")
	private String nomUsuario;
	
	@Column(name ="surname_usua")
	private String apeUsuario;
	
	@Column(name ="email_usua")
	private String emaUsuario;
	
	public Usuario() {
		super();
	}

	public Usuario(int coUsuario, String nomUsuario, String apeUsuario, String emaUsuario) {
		super();
		this.coUsuario = coUsuario;
		this.nomUsuario = nomUsuario;
		this.apeUsuario = apeUsuario;
		this.emaUsuario = emaUsuario;
	}

	public Usuario(String nomUsuario, String apeUsuario, String emaUsuario) {
		super();
		this.nomUsuario = nomUsuario;
		this.apeUsuario = apeUsuario;
		this.emaUsuario = emaUsuario;
	}

	public int getCoUsuario() {
		return coUsuario;
	}

	public void setCoUsuario(int coUsuario) {
		this.coUsuario = coUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getApeUsuario() {
		return apeUsuario;
	}

	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}

	public String getEmaUsuario() {
		return emaUsuario;
	}

	public void setEmaUsuario(String emaUsuario) {
		this.emaUsuario = emaUsuario;
	}
	
	
	
	
}
