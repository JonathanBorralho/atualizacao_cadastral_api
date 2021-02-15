package br.gov.ma.caema.atualizacaocadastral.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Cliente {
	
	@Column(name = "codigo_cliente")
	private Long codigo;
	private String nome;
	private String cpf;
	private String rg;
	private String uf;
	private String email;
	private String sexo;

	@Column(name = "org_exp")
	@JsonProperty(value = "org_exp")
	private String orgExp;

	@Column(name = "data_emissao")
	@JsonProperty(value = "data_emissao")
	private LocalDate dataEmissao;
	
	@Column(name = "tipo_cliente")
	@JsonProperty(value = "tipo_cliente")
	private String tipoCliente;
	
	@Column(name = "tipo_pessoa")
	@JsonProperty(value = "tipo_pessoa")
	private String tipoPessoa;
	
	@Column(name = "data_nascimento")
	@JsonProperty(value = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "nome_mae")
	@JsonProperty(value = "nome_mae")
	private String nomeMae;
	
	@Column(name = "tel_ddd")
	@JsonProperty("tel_ddd")
	private String telDdd;
	
	@Column(name = "tel_num")
	@JsonProperty("tel_num")
	private String telNum;
}
