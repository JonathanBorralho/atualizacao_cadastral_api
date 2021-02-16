package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pavimento_rua")
public class TipoPavimentoRua implements Serializable {

	private static final long serialVersionUID = 6345831947125697597L;

	@Id
	@Column(name = "prua_id")
	private Long id;

	@Column(name = "prua_dspavimentorua")
	private String descricao;
}
