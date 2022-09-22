package DSC.FigurinhaCopa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FigurinhaModels  {
	private String jogador;
	private String selecao;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long IDUsuario;
	 
	
	public FigurinhaModels() {
		super();
	}

	public FigurinhaModels(String jogador, String selecao, Long id, Long IDUsuario) {
		super();
		this.jogador = jogador;
		this.selecao = selecao;
		this.id = id;
		this.IDUsuario = IDUsuario;
	}

	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	public String getSelecao() {
		return selecao;
	}
	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(Long iDUsuario) {
		IDUsuario = iDUsuario;
	}

	@Override
	public String toString() {
		return "FigurinhaModels [jogador=" + jogador + ", selecao=" + selecao + ", id=" + id + ", IDUsuario="
				+ IDUsuario + "]";
	}

	
	
	
}
