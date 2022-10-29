package aplicacaobd;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable {
	@Id	private Integer id;
	private Date dataDevolucao;
        private Date dataEmprestimo;
	


	public Emprestimo() {}

    public Emprestimo(Integer id, Date dataDevolucao, Date dataEmprestimo) {
        this.id = id;
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
    }

        
        
        
	// metodo para adicionar um novo produto à lista de pedidos

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

 
}
