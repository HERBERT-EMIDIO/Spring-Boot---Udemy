
package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component("repApi")
public class UsuarioRepositoryApi implements InterfaceUsuarioRepository {

    @Override
    public void obterDados(){
        System.out.println("Retornando dados da API...");
    }
    
}
