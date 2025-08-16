package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component("repBanco")
public class UsuarioRepository implements InterfaceUsuarioRepository{

    @Override
    public void obterDados(){
        System.err.println("Obtendo dados do banco");
    }

}