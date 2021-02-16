package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "imovel_tipo_construcao")
public class TipoConstrucao implements Serializable {
	
	private static final long serialVersionUID = 228761902304891257L;

	@Id
	@Column(name = "imco_id")
	private Long id;
	
	@Column(name = "imco_dstipoconstrucao")
	private String descricao;
}
