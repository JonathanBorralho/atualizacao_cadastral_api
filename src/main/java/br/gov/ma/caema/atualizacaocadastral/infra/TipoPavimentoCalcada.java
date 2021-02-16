package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pavimento_calcada")
public class TipoPavimentoCalcada implements Serializable {

	private static final long serialVersionUID = -5605547917600514446L;

	@Id
	@Column(name = "pcal_id")
	private Long id;
	
	@Column(name = "pcal_dspavimentocalcada")
	private String descricao;
}
