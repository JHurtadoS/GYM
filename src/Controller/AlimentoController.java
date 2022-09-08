/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Modelo.Alimento;
import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


    public class AlimentoController {
    
     private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
     public void create(Alimento obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(Alimento obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(Alimento obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<Alimento> findAll() {
        Query qr = this.entityManager().createQuery("SELECT u FROM Alimento u");
        return qr.getResultList();
    }
}