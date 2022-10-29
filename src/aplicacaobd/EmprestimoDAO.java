package aplicacaobd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class EmprestimoDAO implements DAO<Emprestimo> {
	EntityManager em = getEntityManager();

	@Override
	public Emprestimo findById(long id) {
		return em.find(Emprestimo.class, id);
	}

	@Override
	public List<Emprestimo> findAll() {
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(Emprestimo.class));
		return getEntityManager().createQuery(cq).getResultList();
	}

	@Override
	public void insert(Emprestimo p) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(p);
		transaction.commit();
	}

	@Override
	public void update(Emprestimo p) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.merge(p);
		transaction.commit();
	}

	@Override
	public void delete(Emprestimo p) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Emprestimo emprestimo = em.find(Emprestimo.class, p.getId());
		em.remove(emprestimo);
		transaction.commit();
	}

}
