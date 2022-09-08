/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import Modelo.PlanNutricion;

public class PlanNutricionController {
    
     private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
     public void create(PlanNutricion obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(PlanNutricion obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(PlanNutricion obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<PlanNutricion> findAll() {
        Query qr = this.entityManager().createQuery("SELECT u FROM PlanNutricion u");
        return qr.getResultList();
    }
}
