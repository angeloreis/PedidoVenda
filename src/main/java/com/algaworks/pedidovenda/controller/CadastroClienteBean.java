package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private List<Endereco> endereco;

	public CadastroClienteBean() {
		cliente = new Cliente();
		endereco = new ArrayList<>();
		cliente.setEndereco(endereco);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Endereco getEndereco() {
		return (Endereco) endereco;
	}

	public void salvar() {

	}

}
