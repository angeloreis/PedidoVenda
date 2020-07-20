package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CadastroEnderecoClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Integer> endereco;

	public CadastroEnderecoClienteBean() {
		endereco = new ArrayList<>();
		endereco.add(1);

	}

	public List<Integer> getEndereco() {
		return endereco;
	}

	public void salvar() {
	}

}
