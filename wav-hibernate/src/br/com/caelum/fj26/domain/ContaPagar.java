package br.com.caelum.fj26.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="fin_contapagar")
public class ContaPagar {

	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_emissao")
	private Calendar data;

	@ManyToOne(optional=false)
	private Fornecedor fornecedor;

	@Column(nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private Double valor;
	
	private boolean pago;

	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
