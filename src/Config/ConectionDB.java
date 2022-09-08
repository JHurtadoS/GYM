/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConectionDB{
	
	private static ConectionDB instance = new ConectionDB();
	private EntityManagerFactory factory;
	
	private ConectionDB(){
		factory = Persistence.createEntityManagerFactory("GymPU");
	}
	
	public static ConectionDB getInstance(){
		return instance;
	}
	
	public EntityManagerFactory getFactory(){
		return factory;
	}
	
}
