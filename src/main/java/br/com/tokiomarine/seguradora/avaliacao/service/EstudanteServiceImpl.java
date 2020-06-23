package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudandeService {

	@Autowired
	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		
		repository.saveAndFlush(estudante);
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		
		
		repository.save(estudante);
		
	}
	
	@Override
	public void deletarEstudante(long id) {
		
		repository.deleteById(id);
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return repository.findAll();
	}

	@Override
	public Estudante buscarEstudante(long id) {
		
		return repository.getOne(id);
		//throw new IllegalArgumentException("Identificador inválido:" + id);
	}

}
