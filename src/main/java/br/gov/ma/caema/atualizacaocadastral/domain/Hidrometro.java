package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Hidrometro {
	private String hidrometro;
	private Long leitura;

	@JsonProperty("data_leitura")
	@Column(name = "data_leitura")
	private String dataLeitura;

}
