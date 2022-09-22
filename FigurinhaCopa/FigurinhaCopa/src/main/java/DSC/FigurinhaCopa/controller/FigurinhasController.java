package DSC.FigurinhaCopa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import DSC.FigurinhaCopa.models.FigurinhaModels;
import DSC.FigurinhaCopa.service.FigurinhaService;




@RestController
@RequestMapping(path = "/figurinhas")
public class FigurinhasController {
private FigurinhaService figurinhaService;
	
	@Autowired
	public void FigurinhaController(FigurinhaService figurinhaService) {
		this.figurinhaService = figurinhaService;
	}

	// Busca todas figurinhas
	@GetMapping()
	public List<FigurinhaModels> getAllFigurinhaList() {
		return figurinhaService.figurinhaList();
	}

	// Busca Figurinha pelo ID
	@GetMapping("/{id}")
	public List<FigurinhaModels> getFigurinhaModels(@PathVariable Long id) {
		return figurinhaService.listFigurinha(id);
	}

	// Buscar figurinha pelo ID do usuario
	@GetMapping("/usuario/{IDUsuario}")
	public List<FigurinhaModels> getFigurinhaModels(@PathVariable long IDUsuario) {
		return figurinhaService.figurinhaUsuario(IDUsuario);
	}

	// Cria Figurinha
	@PostMapping()
	public FigurinhaModels createFigurinha(@RequestBody FigurinhaModels f) {
		figurinhaService.saveFigurinha(f);
		System.out.println(f);
		return f;
		
	}

	// Deleta figurinhas
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("{id}")
	public void deleteTask(@PathVariable Long id) {
		figurinhaService.deleteFigurinha(id);
	}
	
	//UPDATE
	@PutMapping("{id}")
	public FigurinhaModels updateTask(@PathVariable Long id) {
		return figurinhaService.updateFigurinha(id);
		
	}

}


