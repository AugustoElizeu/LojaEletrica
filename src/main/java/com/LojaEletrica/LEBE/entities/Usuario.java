package com.LojaEletrica.LEBE.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Usuario")
	private Long usuarioId;
	private Long apelido;
	private Long senha;
	
	
	public Usuario() {
		
	}
	public Usuario(Long usuarioId, Long apelido, Long senha) {
		super();
		this.usuarioId = usuarioId;
		this.apelido = apelido;
		this.senha = senha;
	}
	public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Long getApelido() {
		return apelido;
	}
	public void setApelido(Long apelido) {
		this.apelido = apelido;
	}
	public Long getSenha() {
		return senha;
	}
	public void setSenha(Long senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apelido, senha);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apelido, other.apelido) && Objects.equals(senha, other.senha);
	}
	
	
	
	
	
}
