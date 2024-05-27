package com.generation.lojadegames.model;


import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	    
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "O atributo titulo é obrigatório!") 
		@Size(min = 3, max = 100, message = "O atributo título deve conter no mínimo 03 e no máximo 100 caracteres")
		private String titulo;
		
		@NotBlank(message = "O atributo descrição é obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		private int estoque; 
		
		@UpdateTimestamp
		private LocalDateTime data;

	    @ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

	    public Long getId() {
	        return this.id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return this.titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getDescricao() {
	        return this.descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public LocalDateTime getData() {
	        return this.data;
	    }

	    public void setData(LocalDateTime data) {
	        this.data = data;
	    }
	  
	    public Categoria getCategoria() {
	        return this.categoria;
	    }

	    public void setCategoria(Categoria categoria) {
	        this.categoria = categoria;
	    }

		public int getEstoque() {
			return estoque;
		}

		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}

	}

