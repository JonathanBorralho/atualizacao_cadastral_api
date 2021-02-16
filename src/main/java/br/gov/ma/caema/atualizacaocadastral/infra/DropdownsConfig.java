package br.gov.ma.caema.atualizacaocadastral.infra;

import java.util.List;

import lombok.Data;

@Data
public class DropdownsConfig {
	private List<FonteAbastecimento> tipoAbastecimento;
	private List<SitAgua> tipoSitAgua;
	private List<SitEsgoto> tipoSitEsgoto;
	private List<TipoCliente> tipoCliente;
	private List<TipoCobertura> tipoCobertura;
	private List<TipoConstrucao> tipoConstrucao;
	private List<TipoHabitacao> tipoHabitacao;
	private List<TipoPavimentoCalcada> tipoCalcada;
	private List<TipoPavimentoRua> tipoRua;
	private List<TipoPropriedade> tipoPropriedade;
	private List<UnidadeFederacao> estados;
}
