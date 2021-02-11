package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Subcategorias {

	@JsonProperty("cat_1")
	@Column(name = "cat_1")
	private String cat1;

	@JsonProperty("subcat_1")
	@Column(name = "subcat_1")
	private String subcat1;

	@JsonProperty("cat_2")
	@Column(name = "cat_2")
	private String cat2;

	private Integer economias;

}
