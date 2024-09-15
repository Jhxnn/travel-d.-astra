package com.example.astra.astraEntity;

import com.example.astra.responses.AstraRecordDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "astra")
@Entity(name = "astra")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Astra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String combustivel;
	private String partida;
	private String chegada;
	private double km;
	private double valorTotal;

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double d) {
		this.valorTotal = d;
	}

	public String getNome() {
		return nome;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getPartida() {
		return partida;
	}

	public String getChegada() {
		return chegada;
	}

	public double getKm() {
		return km;
	}

	public Long getId() {
		return id;
	}
	
	public Astra(AstraRecordDto dto) {
		this.nome = dto.nome();
		this.combustivel = dto.combustivel();
		this.partida = dto.partida();
		this.chegada = dto.chegada();
		this.km = dto.km();
				
	}



}
