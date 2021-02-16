package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "imovel_tipo_habitacao")
public class TipoHabitacao implements Serializable {

	private static final long serialVersionUID = -1529245672634204612L;

	@Id
	@Column(name = "imha_id")
	private Long id;
	
	@Column(name = "imha_dstipohabitacao")
	private String descricao;
}
