package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "Estudante")
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado
	
	@Id
	@SequenceGenerator(name = "id_gen", sequenceName = "id_gen")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_gen")
	private long id;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Email é obrigatório")
	private String email;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Matrícula é obrigatória")
	private String matricula;
	
	@Column(nullable = true, length = 15)
	private String telefone;
	
	
	
	@Column(nullable = true, length = 70)
	private String curso;
	
	//Setters and Getters
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
