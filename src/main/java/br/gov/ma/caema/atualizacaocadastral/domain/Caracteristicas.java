package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Caracteristicas {
	private Integer area;
	private String calcada;
	private String rua;
	private String abastecimento;
	private String agua;
	private String esgoto;
	private String habitacao;
	private String propriedade;
	private String construcao;
	private String cobertura;

}
