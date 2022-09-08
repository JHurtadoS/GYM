/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Modelo.Usuario;
import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioController {

    private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }

    public void create(Usuario user) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(Usuario user) {
        EntityManager em = this.entityManager();
        try {
            
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(Usuario obj) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(obj));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }
    
    //

    public List<Usuario> findAll() {
        Query qr = this.entityManager().createQuery("SELECT t FROM Usuario t");
        return qr.getResultList();
    }
}