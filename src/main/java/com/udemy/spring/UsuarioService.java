package com.udemy.spring;

public class UsuarioService{
    //public UsuarioRepository rep = new UsuarioRepository();//1:53 aula 7

    InterfaceUsuarioRepository rep;

    public UsuarioService(InterfaceUsuarioRepository rep) {
        this.rep = rep;
    }

    public void obterUsuario() {
        rep.obterDados();
    }
    
}
