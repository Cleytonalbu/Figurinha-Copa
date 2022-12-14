package br.ufpb.dcx.dsc.figurinhas.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.ufpb.dcx.dsc.figurinhas.models.Photo;

public class UserDTO {

    private Long id;
    @NotBlank
    private String nome;
    @Email
    private String email;

    private Photo photo;
    
    @NotBlank
    private String username;
    
    @NotBlank
    private String password;

    public UserDTO(){
    	
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", photo=" + photo +
                '}';
    }
}