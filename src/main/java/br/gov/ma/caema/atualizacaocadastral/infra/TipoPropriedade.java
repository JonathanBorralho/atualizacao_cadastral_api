package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "imovel_tipo_propriedade")
public class TipoPropriedade implements Serializable {
	
	private static final long serialVersionUID = 212775144074037228L;

	@Id
	@Column(name = "impr_id")
	private Long id;
	
	@Column(name = "impr_dstipopropriedade")
	private String descricao;
}
