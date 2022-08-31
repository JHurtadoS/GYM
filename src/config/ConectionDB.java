/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.persistence.EntityManagerFactory;


/**
 *
 * @author juane
 */
public class ConectionDB {
    private static ConectionDB instance = new ConectionDB();
    private EntityManagerFactory factory;
    
    private ConectionDB() {
    factory = persistence.createEntityManagerFactory("GymPU");
}
}
