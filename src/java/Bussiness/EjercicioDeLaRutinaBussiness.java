/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import Modelo.EjerciciosDeLaRutina;
import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


    public class EjercicioDeLaRutinaBussiness {
    
     private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
     public void create(EjerciciosDeLaRutina obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(EjerciciosDeLaRutina obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(EjerciciosDeLaRutina obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<EjerciciosDeLaRutina> findAll() {
        Query qr = this.entityManager().createQuery("SELECT u FROM Alimento u");
        return qr.getResultList();
    }
}