package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Roteirizacao {
	private Integer matricula;
	private Integer visita;
	private Integer localidade;
	private Integer setor;
	private Integer quadra;
	private Integer rota;
	private Integer sequencia;
	private Integer sublote;
	private Integer testada;
}
