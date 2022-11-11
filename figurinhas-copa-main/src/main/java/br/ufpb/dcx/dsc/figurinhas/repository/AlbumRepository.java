package br.ufpb.dcx.dsc.figurinhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpb.dcx.dsc.figurinhas.models.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
