/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;

import modelo.Usuario;
import controller.UsuarioController;
import java.util.List;

public class Main {

    static UsuarioController uControll = new UsuarioController();

    public static void main(String[] args) {
        //Usuario
        Usuario u = new Usuario(3, 125678, "juan", "tovar", "1234567890", "F", "T+");
        Usuario u2 = new Usuario(5);

        //uControll.create(u);
        //uControll.update(u);
        //uControll.delete(u2);
        
        List<Usuario> listaUsuario = uControll.findAll();
        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.println(listaUsuario.get(i));
        }
        
        //
    }

}
