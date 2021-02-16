package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ligacao_esgoto_situacao")
public class SitEsgoto implements Serializable {
	
	private static final long serialVersionUID = -2020929146285623836L;

	@Id
	@Column(name = "lest_id")
	private Long id;
	
	@Column(name = "lest_dsligacaoesgotosituacao")
	private String descricao;
}
