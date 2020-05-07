package com.aula1.aula1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "produtos", path = "produtos")
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
    
}