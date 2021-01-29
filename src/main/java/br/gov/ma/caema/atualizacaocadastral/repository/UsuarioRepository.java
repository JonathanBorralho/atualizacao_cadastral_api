package br.gov.ma.caema.atualizacaocadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
