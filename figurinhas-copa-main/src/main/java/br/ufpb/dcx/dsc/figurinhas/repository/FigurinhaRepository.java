package br.ufpb.dcx.dsc.figurinhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpb.dcx.dsc.figurinhas.models.Figurinha;

public interface FigurinhaRepository extends JpaRepository<Figurinha, Long> {
}
