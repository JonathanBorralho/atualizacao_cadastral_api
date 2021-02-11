package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Conclusao {

	@JsonProperty("pt_agua")
	@Column(name = "pt_agua")
	private Long ptAgua;

	private Long moradores;

}
