/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;

import modelo.Usuario;
import controller.UsuarioController;

/**
 *
 * @author juane
 */

/*

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    @Column(name = "documento")
    private Integer documento;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "apellidos", length = 45)
    private String apellidos;
    @Column(name = "celular", length = 255)
    private String celular;
    @Column(name = "genero", length = 9)
    private String genero;
    @Column(name = "rh", length = 5)
    private String rh;


*/
public class Main {

    static UsuarioController uControll = new UsuarioController();
    
    public static void main(String[] args) {
        Usuario u = new Usuario(null, 125678, "karen", "tovar", "1234567890", "femenino", "o+");
        uControll.create(u);
    }
    
}

