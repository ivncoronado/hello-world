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
import logica.entradasSalidas;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author FMS
 */
public class entradasSalidasJpaController implements Serializable {

    public entradasSalidasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public entradasSalidasJpaController() {
        emf=Persistence.createEntityManagerFactory("InventarioPU");
                }
    
    public void create(entradasSalidas entradasSalidas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entradasSalidas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(entradasSalidas entradasSalidas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entradasSalidas = em.merge(entradasSalidas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = entradasSalidas.getId_es();
                if (findentradasSalidas(id) == null) {
                    throw new NonexistentEntityException("The entradasSalidas with id " + id + " no longer exists.");
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
            entradasSalidas entradasSalidas;
            try {
                entradasSalidas = em.getReference(entradasSalidas.class, id);
                entradasSalidas.getId_es();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entradasSalidas with id " + id + " no longer exists.", enfe);
            }
            em.remove(entradasSalidas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<entradasSalidas> findentradasSalidasEntities() {
        return findentradasSalidasEntities(true, -1, -1);
    }

    public List<entradasSalidas> findentradasSalidasEntities(int maxResults, int firstResult) {
        return findentradasSalidasEntities(false, maxResults, firstResult);
    }

    private List<entradasSalidas> findentradasSalidasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(entradasSalidas.class));
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

    public entradasSalidas findentradasSalidas(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(entradasSalidas.class, id);
        } finally {
            em.close();
        }
    }

    public int getentradasSalidasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<entradasSalidas> rt = cq.from(entradasSalidas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
