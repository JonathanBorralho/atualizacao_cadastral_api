package br.gov.ma.caema.atualizacaocadastral.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.gov.ma.caema.atualizacaocadastral.infra.DropdownsConfig;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.FonteAbastecimentoRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.SitAguaRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.SitEsgotoRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoClienteRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoCoberturaRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoConstrucaoRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoHabitacaoRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoPavimentoCalcadaRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoPavimentoRuaRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.TipoPropriedadeRepo;
import br.gov.ma.caema.atualizacaocadastral.infra.repository.UnidadeFederacaoRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DropdownsConfigService {

	private final FonteAbastecimentoRepo abastecimentoRepo;
	private final SitAguaRepo sitAguaRepo;
	private final SitEsgotoRepo sitEsgotoRepo;
	private final TipoClienteRepo tipoClienteRepo;
	private final TipoCoberturaRepo tipoCoberturaRepo;
	private final TipoConstrucaoRepo tipoConstrucaoRepo;
	private final TipoHabitacaoRepo tipoHabitacaoRepo;
	private final TipoPavimentoCalcadaRepo tipoPavimentoCalcadaRepo;
	private final TipoPavimentoRuaRepo tipoPavimentoRuaRepo;
	private final TipoPropriedadeRepo tipoPropriedadeRepo;
	private final UnidadeFederacaoRepo unidadeFederacaoRepo;
	
	public DropdownsConfig getConfig() {
		final DropdownsConfig config = new DropdownsConfig();
		config.setTipoAbastecimento(abastecimentoRepo.findAll());
		config.setTipoSitAgua(sitAguaRepo.findAll());
		config.setTipoSitEsgoto(sitEsgotoRepo.findAll());
		config.setTipoCliente(tipoClienteRepo.findAll(Sort.by("id")));
		config.setTipoCobertura(tipoCoberturaRepo.findAll());
		config.setTipoConstrucao(tipoConstrucaoRepo.findAll());
		config.setTipoHabitacao(tipoHabitacaoRepo.findAll());
		config.setTipoCalcada(tipoPavimentoCalcadaRepo.findAll());
		config.setTipoRua(tipoPavimentoRuaRepo.findAll());
		config.setTipoPropriedade(tipoPropriedadeRepo.findAll());
		config.setEstados(unidadeFederacaoRepo.findAll());

		return config;
	}

}
