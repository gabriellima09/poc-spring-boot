package com.aula1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor 

@Entity
public class Produto{

    @Id
    @GeneratedValue
    private Long Id;
    private String Nome;
    private String Descricao;
    private Double Preco;
}