package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "imovel_tipo_cobertura")
public class TipoCobertura implements Serializable {

	private static final long serialVersionUID = -1529245672634204612L;

	@Id
	@Column(name = "imcb_id")
	private Long id;
	
	@Column(name = "imcb_dstipocobertura")
	private String descricao;
}
