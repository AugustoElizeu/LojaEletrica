package com.LojaEletrica.LEBE.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Servico")
public class Servico implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="ID_Serviço")
	private UUID servicoId;
	
	private String nomeServico;
	private Double valorServico;
	private String Descricao;
	
	public Servico() {
		
	}

	public Servico(UUID servicoId, String nomeServico, Double valorServico, String descricao) {
		super();
		this.servicoId = servicoId;
		this.nomeServico = nomeServico;
		this.valorServico = valorServico;
		Descricao = descricao;
	}

	public UUID getservicoId() {
		return servicoId;
	}

	public void setservicoId(UUID servicoId) {
		this.servicoId = servicoId;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeServico, servicoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(nomeServico, other.nomeServico) && Objects.equals(servicoId, other.servicoId);
	}
	
	
	
}
