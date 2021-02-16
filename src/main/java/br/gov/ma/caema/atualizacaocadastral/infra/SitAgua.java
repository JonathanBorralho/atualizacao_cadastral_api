package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ligacao_agua_situacao")
public class SitAgua implements Serializable {
	
	private static final long serialVersionUID = -3729483973023733245L;

	@Id
	@Column(name = "last_id")
	private Long id;
	
	@Column(name = "last_dsligacaoaguasituacao")
	private String descricao;
}
