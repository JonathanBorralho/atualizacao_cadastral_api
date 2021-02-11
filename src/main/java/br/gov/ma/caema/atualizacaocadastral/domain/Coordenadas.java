package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Coordenadas {
	private Double latitude;
	private Double longitude;

}
