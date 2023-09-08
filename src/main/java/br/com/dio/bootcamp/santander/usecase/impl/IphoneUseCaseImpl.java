package br.com.dio.bootcamp.santander.usecase.impl;

import br.com.dio.bootcamp.santander.usecase.interfaces.AparelhoUseCase;
import br.com.dio.bootcamp.santander.usecase.interfaces.NavegadorUseCase;
import br.com.dio.bootcamp.santander.usecase.interfaces.ReprodutorUseCase;

public class IphoneUseCaseImpl implements AparelhoUseCase, NavegadorUseCase, ReprodutorUseCase {
    @Override
    public void ligar() {
        System.out.println("APARELHO LIGADO");
    }

    @Override
    public void atender() {
        System.out.println("LIGACAO ATENDIDA");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }

    @Override
    public void exibirPagina() {
        System.out.println("PAGINA EXIBIDA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("REPRODUCAO PAUSADA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MUSICA SELECIONADA");
    }

}
