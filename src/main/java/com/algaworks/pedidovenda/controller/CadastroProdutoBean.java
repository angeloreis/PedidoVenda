package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;
import com.algaworks.pedidovenda.repository.Categorias;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Categorias categorias;

	private Categoria categoriaPai;

	private Produto produto;

	private List<Categoria> categoriaRaizes;

	public CadastroProdutoBean() {
		produto = new Produto();
	}

	public void inicializar() {
		categoriaRaizes = categorias.raizes();
	}

	public List<Categoria> getCategoriaRaizes() {
		return categoriaRaizes;
	}

	public void salvar() {
		System.out.println("Categoria selecionada: " + categoriaPai.getDescricao());
	}

	@NotNull
	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

	public Produto getProduto() {
		return produto;
	}

}