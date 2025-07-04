/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.resource;

import br.com.krossft.scfp.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class ResourceBase<T, K> {
    protected ResourceBase() {}

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<T> obter(@PathVariable("id") K id) throws BusinessException {
        return this.acaObter(id);
    }
    protected abstract ResponseEntity<T> acaObter(K id) throws BusinessException;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<T>> listar() throws BusinessException {
        return this.acaoListar();
    }
    protected abstract ResponseEntity<List<T>> acaoListar() throws BusinessException;

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<T> incluir(@RequestBody T dto) throws BusinessException {
        return this.acaoIncluir(dto);
    }
    protected abstract ResponseEntity<T> acaoIncluir(T dto) throws BusinessException;

    @PutMapping(value = "/{id}")
    public ResponseEntity<T> atualizar(@PathVariable("id") K id, @RequestBody T dto) throws BusinessException {
        return this.acaoAtualizar(id, dto);
    }
    protected abstract ResponseEntity<T> acaoAtualizar(K id, T dto) throws BusinessException;

    @DeleteMapping(value = "/{id}")
    public void remover(@PathVariable("id") K id) throws BusinessException {
        this.acaoRemover(id);
    }
    protected abstract void acaoRemover(K id) throws BusinessException;
}
