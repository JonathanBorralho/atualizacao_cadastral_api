package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Imovel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Roteirizacao roteirizacao;

	@Embedded
	private Endereco endereco;

	@Embedded
	private Cliente cliente;

	@Embedded
	private Subcategorias subcategorias;

	@Embedded
	private Caracteristicas caracteristicas;

	@Embedded
	private Conclusao conclusao;

	@Embedded
	private Hidrometro hidrometro;

	@Embedded
	private Coordenadas coordenadas;
	
	private String observacao;
}
