package com.udemy.spring;

public class UsuarioRepository implements InterfaceUsuarioRepository{

    @Override
    public void obterDados(){
        System.err.println("Obtendo dados do banco");
    }

}