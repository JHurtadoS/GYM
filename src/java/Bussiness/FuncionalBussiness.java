/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import Modelo.Funcional;

/**
 *
 * @author juane
 */
public class FuncionalBussiness {
    private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
     public void create(Funcional obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(Funcional obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(Funcional obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<Funcional> findAll() {
        Query qr = this.entityManager().createQuery("SELECT u FROM Funcional u");
        return qr.getResultList();
    }
    
    public List<Funcional>  FindFuncionalByid(int id){
        Query qr;
        qr = this.entityManager().createQuery("SELECT u FROM Funcional u WHERE u.id="+id);
        //qr.setParameter("IdVal", id);
        return qr.getResultList();
    }
}
