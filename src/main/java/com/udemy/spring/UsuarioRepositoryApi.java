package com.udemy.spring;

public class UsuarioRepositoryApi implements InterfaceUsuarioRepository {

    @Override
    public void obterDados(){
        System.out.println("Retornando dados da API...");
    }
    
}
