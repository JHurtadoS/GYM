/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.ConectionDB;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Consumidor;


/**
 *
 * @author juane
 */
public class ConsumidorController {

    private EntityManager entityManager() {
        return ConectionDB.getInstance().getFactory().createEntityManager();
    }
    
        public List<Consumidor>  FindConsumidorByid(int id){
        Query qr;
        qr = this.entityManager().createQuery("SELECT u FROM Consumidor u WHERE u.id="+id);
        //qr.setParameter("IdVal", id);
        return qr.getResultList();
    }

}
