package com.itb.inf2dm.pizzariad.controller;


import com.itb.inf2dm.pizzariad.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {
    List<Categoria> Categoria = new ArrayList<Categoria>();

    @GetMapping
    public List<Categoria> findAll() {
        Categoria c1 = new Categoria();
        c1.setDescricao("serve ate 8 pessoas");
        c1.setNome("Tamanho");


        Categoria c2 = new Categoria();
        c2.setDescricao(" ");
        c2.setNome("S");



        Categoria.add(c1);
        Categoria.add(c2);
        return Categoria;
    }

}
