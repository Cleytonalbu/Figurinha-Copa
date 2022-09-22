package DSC.FigurinhaCopa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import DSC.FigurinhaCopa.models.FigurinhaModels;
import DSC.FigurinhaCopa.repository.FigurinhaRepository;

@Service
public class FigurinhaService {

	// Cria Lista de Figurinha
	private final ArrayList<FigurinhaModels> figurinhaList = new ArrayList<>();

	private FigurinhaRepository figurinhaRepository;

	FigurinhaService(FigurinhaRepository figurinhaRepository) {
		this.figurinhaRepository = figurinhaRepository;

	}

	// Serviço retorna lista de figurinha
	public List<FigurinhaModels> figurinhaList() {
		return figurinhaRepository.findAll();
	}

	// Serviço retorna lista de figurinha pelo ID
	public List<FigurinhaModels> listFigurinha(long id) {
		return figurinhaRepository.findAllByIDUsuario(id);
	}

	// Retorna lista de figurinha pelo IDUSUARIO
	public List<FigurinhaModels> figurinhaUsuario(long IDUsuario) {
		return figurinhaRepository.findAllByIDUsuario(IDUsuario);
	}

	// Adiciona figurinha na lista
	public FigurinhaModels saveFigurinha(FigurinhaModels f) {
		return figurinhaRepository.save(f);
	}

	// Apaga figurinha
	public void deleteFigurinha(Long id) {
		figurinhaRepository.deleteById(id);
	}

	// Update figurinha. altera o dono da figurinha
	public FigurinhaModels updateFigurinha(Long id) {
		Optional<FigurinhaModels> taskData = figurinhaRepository.findById(id);
		if (taskData.isPresent()) {
			FigurinhaModels toUpdate = taskData.get();
			toUpdate.setIDUsuario(id);
			figurinhaRepository.save(toUpdate);
			return toUpdate;
		}
		return null;
	} 

	
}
