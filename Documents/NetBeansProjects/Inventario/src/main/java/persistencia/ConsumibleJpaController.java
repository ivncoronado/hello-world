/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Consumible;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author FMS
 */
public class ConsumibleJpaController implements Serializable {

    public ConsumibleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ConsumibleJpaController() {
        emf=Persistence.createEntityManagerFactory("InventarioPU");
    }

    public void create(Consumible consumible) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(consumible);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Consumible consumible) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            consumible = em.merge(consumible);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = consumible.getId_consumible();
                if (findConsumible(id) == null) {
                    throw new NonexistentEntityException("The consumible with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consumible consumible;
            try {
                consumible = em.getReference(Consumible.class, id);
                consumible.getId_consumible();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The consumible with id " + id + " no longer exists.", enfe);
            }
            em.remove(consumible);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Consumible> findConsumibleEntities() {
        return findConsumibleEntities(true, -1, -1);
    }

    public List<Consumible> findConsumibleEntities(int maxResults, int firstResult) {
        return findConsumibleEntities(false, maxResults, firstResult);
    }

    private List<Consumible> findConsumibleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Consumible.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Consumible findConsumible(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Consumible.class, id);
        } finally {
            em.close();
        }
    }

    public int getConsumibleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Consumible> rt = cq.from(Consumible.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
