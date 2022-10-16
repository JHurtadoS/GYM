/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet{
    @override 
    protected void doPost(HttpServletRequest request, HttpServletReponse reponse ) {
        System.out.println("Ingreso al Post");
    }
}