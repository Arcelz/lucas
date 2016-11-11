package com.ifgoiano.supermecado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="fechamentos")

public class Fechamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_fechamento")
	private long id;
	
	private int fk_abertura;
	
	private DateTimeFormat data_fechamento;
	private double saldo_final;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public int getFk_abertura() {
		return fk_abertura;
	}
	
	public void setFk_abertura(int fk_abertura) {
		this.fk_abertura = fk_abertura;
	}
	
	public DateTimeFormat getData_fechamento() {
		return data_fechamento;
	}
	
	public void setData_fechamento(DateTimeFormat data_fechamento) {
		this.data_fechamento = data_fechamento;
	}
	
	public double getSaldo_final() {
		return saldo_final;
	}
	
	public void setSaldo_final(double saldo_final) {
		this.saldo_final = saldo_final;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fechamentos other = (Fechamentos) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
