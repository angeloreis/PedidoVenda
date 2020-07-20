package com.algaworks.pedidovenda.controller;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Cliente;

import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class CadastroEnderecoClienteBean {
	
	private List<Integer> endereco;
	private Cliente cliente;
	
	//@SuppressWarnings("unchecked")
	public CadastroEnderecoClienteBean() {
		endereco = new ArrayList<>();
		cliente = new Cliente();
		endereco.add(1);
		
	}
	
	public List<Integer> getEndereco() {
		return endereco;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void salvar() {}

}
