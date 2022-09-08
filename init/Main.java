/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Usuario;
import Modelo.Actividad;
import Modelo.Consumidor;
import Modelo.Funcional;
import Modelo.HistorialActividades;
import Modelo.PlanNutricion;
import Controller.ConsumidorController;
import Modelo.Alimento;
import Modelo.Ejercicio;
import Modelo.Tipo;
import controller.ActividadController;
import controller.AlimentoController;
import controller.EjercicioController;
import controller.FuncionalController;
import controller.HistorialActividadesController;
import controller.PlanNutricionController;
import controller.TipoController;
import controller.UsuarioController;



public class Main {

    static UsuarioController uControll = new UsuarioController();
    static FuncionalController FunControll = new FuncionalController();
    static HistorialActividadesController HistoActcontroll = new HistorialActividadesController();
    static ConsumidorController Consucontroll = new ConsumidorController();
    static ActividadController Acticontroll = new ActividadController();
    static PlanNutricionController planControll = new PlanNutricionController();
    static AlimentoController aliControll = new AlimentoController();
    static TipoController tControll = new TipoController();
    static EjercicioController ejerControll = new EjercicioController();
    


    public static void main(String[] args) {
        //USUARIO
        
        Usuario u = new Usuario(null, 125678, "karen", "tovar", "1222567890", "F", "O-");
        Usuario u2 = new Usuario(2, 125678, "Tatiana", "Bustos", "1222567002", "F", "O-");
        Usuario u3 = new Usuario(11);
        /*
        uControll.create(u);
        uControll.update(u2);
        uControll.delete(u3);
        List<Usuario> listaUsuario = uControll.findAll();
        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.println(listaUsuario.get(i));
        }*/
        

        //FUNCIONAL
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
        
        /*ACTIVIDAD
        Actividad actividad =  new Actividad(null,"ejemplo","ejemplo2");
        Acticontroll.create(actividad);
       
        //Historial de Actividades
        
        
        
        
        /*
        Consumidor con =  Consucontroll.FindConsumidorByid(1).get(0);
        HistorialActividades histAct1 = new HistorialActividades(null,con);
        HistoActcontroll.create(histAct1);*/
        
        
        //PLAN NUTRICION 
      /*PlanNutricion plan = new PlanNutricion (null, "Carbohidratos");
        PlanNutricion plan2 = new PlanNutricion (6, "Frutas");
        PlanNutricion plan3 = new PlanNutricion(4);
      
        planControll.create(plan);
        planControll.update(plan2);
        planControll.delete(plan3);
        
        List<PlanNutricion> listaPlanNutricion = planControll.findAll();
        for (int i = 0; i < listaPlanNutricion.size(); i++) {
            System.out.println(listaPlanNutricion.get(i));
            }
        */
        
        //ALIMENTO
       /*Alimento ali = new Alimento(null, "Manzana", "fruta", "/imagenes/frutas"); 
        Alimento ali2 = new Alimento(4, "Brocoli", "verdura", "/imagenes/verduras"); 
        Alimento ali3 = new Alimento (2);
        aliControll.create(ali);
        aliControll.update(ali2);
        aliControll.delete(ali2);
        
        List<Alimento> listaAlimento = aliControll.findAll();
         for (int i = 0; i < listaAlimento.size(); i++) {
            System.out.println(listaAlimento.get(i));
            }
        */
       
       
        //TIPO
      /*Tipo t = new Tipo (null, "Estudiante");
        Tipo t2 = new Tipo (2, "Administrativo");
        Tipo t3 = new Tipo (3);
        
        tControll.create(t);
        tControll.update(t2);
        tControll.delete(t3);
        
        List<Tipo> listaTipo = tControll.findAll();
         for (int i = 0; i < listaTipo.size(); i++) {
            System.out.println(listaTipo.get(i));
            }
       */
        
      
        //EJERCICIO
      /*Ejercicio ejer = new Ejercicio (null, "/videos/ejercio/brazo", "estiramiento de tricep", "brazo'", 100.4f);
        Ejercicio ejer2 = new Ejercicio (2, "/videos/ejercios/espalda", "espalda", "espalda", 90.05f);
        Ejercicio ejer3 = new Ejercicio (4);

        ejerControll.create(ejer);
        ejerControll.update(ejer2);
        ejerControll.delete(ejer3);
        
        List<Ejercicio> listaEjercicio= ejerControll.findAll();
         for (int i = 0; i < listaEjercicio.size(); i++) {
            System.out.println(listaEjercicio.get(i));
            }
         */
    }
}
