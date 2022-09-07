/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;

import controller.ActividadControlller;
import controller.ConsumidorController;
import controller.FuncionalController;
import controller.HistorialActividadesController;
import modelo.Usuario;
import controller.UsuarioController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Actividad;
import modelo.Consumidor;
import modelo.Funcional;
import modelo.HistorialActividades;


public class Main {

    static UsuarioController uControll = new UsuarioController();
    static FuncionalController FunControll = new FuncionalController();
    static HistorialActividadesController HistoActcontroll = new HistorialActividadesController();
   static ConsumidorController Consucontroll = new ConsumidorController();
      static ActividadControlller Acticontroll = new ActividadControlller();


    public static void main(String[] args) {
        //Usuario
        
        Usuario u = new Usuario(null, 125678, "karen", "tovar", "1222567890", "F", "O-");
        Usuario u2 = new Usuario(10, 125678, "karen2", "tovar2", "1222567892", "F", "O-");

        Usuario u3 = new Usuario(11);
/*
        uControll.create(u);
        uControll.update(u2);
        uControll.delete(u3);

        List<Usuario> listaUsuario = uControll.findAll();
        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.println(listaUsuario.get(i));
        }*/
        //

        //Funcional 
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateSalStringFun1 = "31-08-1982 10:20:56";
        String dateEntraStringFun1 = "31-08-1982 15:20:56";
        String dateSalStringFun2 = "31-08-2002 10:20:56";
        String dateEntraStringFun2 = "31-08-2001 15:20:56";
        Date dateSalFun1 = new Date();
        Date dateEntFun1 =  new Date();
        Date dateSalFun2 = new Date();
        Date dateEntFun2 =  new Date();
                
        try {
            dateSalFun1 = sdf.parse(dateSalStringFun1);
            dateEntFun1 = sdf.parse(dateEntraStringFun1);
            dateSalFun2 = sdf.parse(dateSalStringFun2);
            dateEntFun2 = sdf.parse(dateEntraStringFun2);
        } catch (ParseException ex) {
            System.out.println(ex);
        }

        Funcional fn = new Funcional(null, dateSalFun1, dateEntFun1, u2);
        Funcional fn2 = new Funcional(1, dateSalFun2, dateEntFun2, u);
        Funcional fn3 =  FunControll.FindFuncionalByid(1).get(0);
        FunControll.create(fn);
        FunControll.update(fn2);
        System.out.println(fn3);
        FunControll.delete(fn3);
        */
        
        //actividad
        Actividad actividad =  new Actividad(null,"ejemplo","ejemplo2");
        Acticontroll.create(actividad);
        //Historial de Actividades
        
        
        
        
        /*
        Consumidor con =  Consucontroll.FindConsumidorByid(1).get(0);
        HistorialActividades histAct1 = new HistorialActividades(null,con);
        HistoActcontroll.create(histAct1);*/

    }

}
