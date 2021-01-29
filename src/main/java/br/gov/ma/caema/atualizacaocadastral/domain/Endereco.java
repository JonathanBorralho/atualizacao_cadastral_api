package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Endereco {
	private String logradouro;
	private String cep;
	private String bairro;
	private String numero;
	private String complemento;
}
