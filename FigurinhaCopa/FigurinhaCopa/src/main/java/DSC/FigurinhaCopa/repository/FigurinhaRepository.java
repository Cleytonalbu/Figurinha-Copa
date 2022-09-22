package DSC.FigurinhaCopa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import DSC.FigurinhaCopa.models.FigurinhaModels;



public interface FigurinhaRepository extends JpaRepository<FigurinhaModels, Long>{
	List<FigurinhaModels> findAllByIDUsuario(long IDUsuario);
	
}