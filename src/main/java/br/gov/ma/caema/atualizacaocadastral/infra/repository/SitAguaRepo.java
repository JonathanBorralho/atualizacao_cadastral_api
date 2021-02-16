package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.SitAgua;

public interface SitAguaRepo extends JpaRepository<SitAgua, Long> {

}
