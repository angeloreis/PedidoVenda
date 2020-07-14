package com.algaworks.pedidovenda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroGrupoUsuarioBean {
	
	private List<Integer> grupos;
	
	public CadastroGrupoUsuarioBean() {
		grupos = new ArrayList<>();
		grupos.add(5);
		
	}
	
	public List<Integer> getGrupos() {
		return grupos;
	}

}
