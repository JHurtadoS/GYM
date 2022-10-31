package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import Bussiness.UsuarioBussiness;
import Modelo.Usuario;

import java.util.stream.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {

    UsuarioBussiness conUsuario = new UsuarioBussiness();

    public String GenerateJsonUser(List<Usuario> usuarios, HttpServletResponse reponse) throws IOException {
        String json = "";

        if (usuarios.isEmpty()) {
            return "{[]}";
        } else {

            String objects = "";
            for (int i = 0; i < usuarios.size(); i++) {

                if (i == 0) {
                    json = "{\"usuarios\":[";
                }

                objects = objects
                        + "{\"Id\":" + usuarios.get(i).getIdUsuario().toString() + ","
                        + "\"documento\":" + usuarios.get(i).getDocumento().toString() + ","
                        + "\"nombre\":" + "\"" + usuarios.get(i).getNombre() + "\","
                        + "\"Apellidos\":" + "\"" + usuarios.get(i).getApellidos() + "\"" + ","
                        + "\"Celular\":" + usuarios.get(i).getCelular() + ","
                        + "\"Genero\":" + "\"" + usuarios.get(i).getGenero() + "\"" + ","
                        + "\"rh\":" + "\"" + usuarios.get(i).getRh() + "\"" + "}";

                if (i + 1 != usuarios.size()) {
                    objects = objects + ",";
                } else {
                    json = json + objects + "]}";
                }
            }

            return json;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) {
        //System.out.println("Ingreso al Post")
        String doc = request.getParameter("Documento");
        String nom = request.getParameter("Nombre");
        String ape = request.getParameter("Apellido");
        String cel = request.getParameter("Celular");
        String gen = request.getParameter("Genero");
        String rh = request.getParameter("Rh");

        try {
            PrintWriter ou = reponse.getWriter();
            ou.print("<html>");
            ou.print("<head>");
            ou.print("</head>");
            ou.print("<body>");
            ou.print("<h1>");
            ou.print("DATOS Insertados");
            ou.print("</h1>");
            ou.print("</body>");
            ou.print("</html>");
        } catch (IOException ex) {
            System.out.println("Exeption" + ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        
        String id = request.getParameter("Id");
        Gson gson = new Gson();
        List<Usuario> usuarios;
        System.out.println(id != "" || id != null);
        if (id == "" || id == null) {            
            usuarios = conUsuario.findAll();
        } else {
            Integer idUser = null;
            try {
                
                idUser = Integer.parseInt(id);
                
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            //reponse.getWriter().println(idUser);
            System.out.println("Hey"+id);
            usuarios = conUsuario.finUserById(idUser);
        }
        String json = this.GenerateJsonUser(usuarios, reponse);
        reponse.getWriter().println(json);
    }

//Insertar Datos Usuario 
public boolean insertar(Usuario usuario) throws SQLException {
		String sql = "INSERT INTO usuarios (id, Documento, Nombre, Apellido, Celular, Genero, Rh) VALUES (?,?,?, ?,?,?,?)";
		System.out.println(usuario.getDescripcion());
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, null);
		statement.setDouble(2, usuario.getDocumento());
		statement.setString(3, usuario.getNombre());
		statement.setString(4, usuario.getApellido());
		statement.setDouble(5, usuario.getCelular());
		statement.setString(6, usuario.getGenero());
        statement.setString(7, usuario.getRh());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}
    
private void insertar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/AdminPage.jsp");
		dispatcher.forward(request, response);
	}


    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String doc = request.getParameter("Documento");
        String nom = request.getParameter("Nombre");
        String ape = request.getParameter("Apellido");
        String cel = request.getParameter("Celular");
        String gen = request.getParameter("Genero");
        String rh = request.getParameter("Rh");
        try {
            PrintWriter ou = resp.getWriter();
            ou.print("<html>");
            ou.print("<head>");
            ou.print("</head>");
            ou.print("<body>");
            ou.print("<h1>");
            ou.print("DATOS Eliminados");
            ou.print("</h1>");
            ou.print("</body>");
            ou.print("</html>");
        } catch (IOException ex) {
            System.out.println("Exeption" + ex.getMessage());
        }

    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doc = req.getParameter("Documento");
        String nom = req.getParameter("Nombre");
        String ape = req.getParameter("Apellido");
        String cel = req.getParameter("Celular");
        String gen = req.getParameter("Genero");
        String rh = req.getParameter("Rh");

        try {
            PrintWriter ou = resp.getWriter();
            ou.print("<html>");
            ou.print("<head>");
            ou.print("</head>");
            ou.print("<body>");
            ou.print("<h1>");
            ou.print("DATOS Actualizados");
            ou.print("</h1>");
            ou.print("</body>");
            ou.print("</html>");
        } catch (IOException ex) {
            System.out.println("Exeption" + ex.getMessage());
        }

    }

}
