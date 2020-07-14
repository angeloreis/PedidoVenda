package com.algaworks.pedidovenda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroEnderecoClienteBean {
	
	private List<Integer> enderecos;
	
	public CadastroEnderecoClienteBean() {
		enderecos = new ArrayList<>();
		enderecos.add(5);
		
	}
	
	public List<Integer> getEnderecos() {
		return enderecos;
	}

}
