package br.ufpb.dcx.dsc.figurinhas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpb.dcx.dsc.figurinhas.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}