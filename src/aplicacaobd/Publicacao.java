package aplicacaobd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
public class Publicacao implements Serializable {
	@Id	private Integer codigoPub;
	private String titulo;
        private int ano;
        private String autor;
        private String tipo;
	

	

	public Publicacao() {}

	// metodo para adicionar um novo produto à lista de pedidos

    public Integer getCodigoPub() {
        return codigoPub;
    }

    public void setCodigoPub(Integer codigoPub) {
        this.codigoPub = codigoPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
	

}
