/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Tipo;


public class TipoController {
    
     private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
     public void create(Tipo obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(Tipo obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(Tipo obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<Tipo> findAll() {
        Query qr = this.entityManager().createQuery("SELECT u FROM Tipo u");
        return qr.getResultList();
    }
}

