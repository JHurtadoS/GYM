/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;

import Modelo.Usuario;
import controller.UsuarioController;

/**
 *
 * @author juane
 */
public class Main {

    static UsuarioController uControll = new UsuarioController();
    
    public static void main(String[] args) {
        Usuario usuari = new Usuario (01, 12345678, "karen", "tovar", 1234567890, "femenino", "o+");
        
    }
    
}
