/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author FAMILIA TOVAR BUSTOS
 */
@WebServlet ("/UsuarioController")
public class UsuarioController extends HttpServlet {

    @override 
    protected void doPost(HttpServletRequest request, HttpServletReponse reponse ) {
        //System.out.println("Ingreso al Post")
        String doc = request.getParameter("Documento");
        String nom = request.getParameter("Nombre");
        String ape = request.getParameter("Apellido");
        String cel = request.getParameter("Celular");
        String gen = request.getParameter("Genero");
        String rh = request.getParameter("Rh");

        /* Imprimir los datos del formulario USUARIO
        System.out.println("Documento:" + doc);
        System.out.println("Nombre:" + nom);
        System.out.println("Apellido:" + ape);
        System.out.println("Celular:" + cel);
        System.out.println("Genero:" + gen);
        System.out.println("Rh:" + rh); */ 

        try {
            printWriter ou = response.getWriter();
            ou.print("<html>");
            ou.print("<head>");
            ou.print("</head>");
            ou.print("<body>");
            ou.print("<h1>");
            ou.print("DATOS VALLIDOS");
            ou.print("</h1>");
            ou.print("</body>");
            ou.print("</html>");
        }catch (IOExeption ex) {
            System.out.println("Exeption" + ex.getMessage());
        }  
    }
}
