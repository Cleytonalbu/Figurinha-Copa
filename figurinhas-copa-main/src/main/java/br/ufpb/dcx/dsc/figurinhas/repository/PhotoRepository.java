package br.ufpb.dcx.dsc.figurinhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpb.dcx.dsc.figurinhas.models.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}