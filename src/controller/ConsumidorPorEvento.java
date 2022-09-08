/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//este controlador contiene el CRUD  y Query necesario para hacer que el modelo Consumidor  obtenga la informacion y 
// se puede por ende adjuntar a la base de datos.
package controller;

import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Consumidor;

public class ConsumidorPorEvento {

    private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }

    public void create(Consumidor user) {
        EntityManager em = this.entityManager();
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update(Consumidor user) {
        EntityManager em = this.entityManager();
        try {

            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete(Consumidor obj) {
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
    public List<Consumidor> findAll() {
        Query qr = this.entityManager().createQuery("SELECT t FROM Usuario t");
        return qr.getResultList();
        
        //pendiente definir el query para esta consulta 

    }
}