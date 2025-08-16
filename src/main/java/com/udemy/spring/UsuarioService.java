package com.udemy.spring;

import org.springframework.beans.factory.annotation.Qualifier;

public class UsuarioService{
    //public UsuarioRepository rep = new UsuarioRepository();//1:53 aula 7

    InterfaceUsuarioRepository rep;
//aula 7 11:19
    public UsuarioService(@Qualifier("repBanco")InterfaceUsuarioRepository rep) {
        this.rep = rep;
    }

    public void obterUsuario() {
        rep.obterDados();
    }
    
}
