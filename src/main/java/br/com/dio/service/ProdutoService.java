package br.com.dio.service;

import br.com.dio.exception.ProductNullException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.entity.Produto;
import br.com.dio.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto save(Produto produto) {
            if (produto.getNome() == null) {
                throw new ProductNullException();
                
            }
		return repository.save(produto);
	}

	public Produto findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}
}
