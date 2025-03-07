package br.com.dio.controller;

import br.com.dio.entity.Produto;
import br.com.dio.service.ProdutoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carol
 */
@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    /*Auto construtor*/
    private ProdutoService serviceProduto;

    @GetMapping(value = "/consulta/{id}")
    public ResponseEntity<Produto> consultaProduto(@PathVariable Long id) {
        Produto produto = serviceProduto.findById(id);
        /*response enviando que deu tudo certo no ato de salvar no banco de dados, coloca o produto criado no corpo do response*/
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/consulta")
    public ResponseEntity<List<Produto>> buscaTodos() {
        List<Produto> produtos = serviceProduto.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) {
        produto = serviceProduto.save(produto);
        /*response enviando que deu tudo certo no ato de salvar no banco de dados, coloca o produto criado no corpo do response*/
        return ResponseEntity.ok().body(produto);
    }

}
