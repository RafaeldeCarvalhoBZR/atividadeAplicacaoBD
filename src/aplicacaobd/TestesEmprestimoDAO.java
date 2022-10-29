package aplicacaobd;

import aplicacaobd.DAO;
import aplicacaobd.Emprestimo;
import aplicacaobd.EmprestimoDAO;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestesEmprestimoDAO {

	public static void main(String[] args) {
	
            
            DAO dao = new EmprestimoDAO();
		EntityManager em = dao.getEntityManager();

		incluiVariosEmprestios(em);
		// altera(em);
		em.close();
	}

	private static void incluiVariosEmprestios(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Emprestimo p;
            p = new Emprestimo(91, new Date(), new Date());
		em.persist(p);
		p = new Emprestimo(92, new Date(), new Date());
		em.persist(p);
		p = new Emprestimo(93, new Date(), new Date());
		em.persist(p);
		p = new Emprestimo(94, new Date(), new Date());
		em.persist(p);
		p = new Emprestimo(95, new Date(), new Date());
		em.persist(p);
		p = new Emprestimo(96, new Date(), new Date());

		em.persist(p);
		transaction.commit();
	}

}
