
package com.mycompany.registro.persistencia;

import com.mycompany.registro.logica.Uusario;
import com.mycompany.registro.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UusarioJpaController implements Serializable {

    public UusarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    //aqui
    public UusarioJpaController() {
        emf = Persistence.createEntityManagerFactory("RegistroPilaresPU");
    }   
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Uusario uusario) {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(uusario);
            em.getTransaction().commit();
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void edit(Uusario uusario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            uusario = em.merge(uusario);
            em.getTransaction().commit();
        } catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                int id = uusario.getFolio();
                if (findUusario(id) == null)
                {
                    throw new NonexistentEntityException("The uusario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Uusario uusario;
            try
            {
                uusario = em.getReference(Uusario.class, id);
                uusario.getFolio();
            } catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The uusario with id " + id + " no longer exists.", enfe);
            }
            em.remove(uusario);
            em.getTransaction().commit();
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public List<Uusario> findUusarioEntities() {
        return findUusarioEntities(true, -1, -1);
    }

    public List<Uusario> findUusarioEntities(int maxResults, int firstResult) {
        return findUusarioEntities(false, maxResults, firstResult);
    }

    private List<Uusario> findUusarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Uusario.class));
            Query q = em.createQuery(cq);
            if (!all)
            {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally
        {
            em.close();
        }
    }

    public Uusario findUusario(int id) {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Uusario.class, id);
        } finally
        {
            em.close();
        }
    }

    public int getUusarioCount() {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Uusario> rt = cq.from(Uusario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally
        {
            em.close();
        }
    }
    
}
