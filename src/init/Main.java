/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package init;

import Controller.CitaController;
import controller.ActividadControlller;
import controller.AlimentoController;
import controller.ConsumidorController;
import controller.CredencialesController;
import controller.EjercicioController;
import controller.EventoController;
import controller.FuncionalController;
import controller.HerramientaController;
import controller.HistorialActividadesController;
import controller.InstructorController;
import controller.PeticionesController;
import controller.PlanNutricionController;
import controller.RutinaController;
import controller.TipoController;
import modelo.Usuario;
import controller.UsuarioController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Actividad;
import modelo.Consumidor;
import modelo.Instructor;
import modelo.Funcional;
import modelo.HistorialActividades;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import modelo.Alimento;
import modelo.Cita;
import modelo.Credenciales;
import modelo.Ejercicio;
import modelo.Evento;
import modelo.Herramienta;
import modelo.Peticiones;
import modelo.PlanNutricion;
import modelo.Rutina;
import modelo.Tipo;

;

public class Main {

    static UsuarioController uControll = new UsuarioController();
    static FuncionalController FunControll = new FuncionalController();
    static HistorialActividadesController HistoActcontroll = new HistorialActividadesController();
    static ConsumidorController Consucontroll = new ConsumidorController();
    static ActividadControlller Acticontroll = new ActividadControlller();
    static EventoController EventoCon = new EventoController();
    static InstructorController InstructorCon = new InstructorController();
    static PlanNutricionController planControll = new PlanNutricionController();
    static AlimentoController aliControll = new AlimentoController();
    static TipoController tControll = new TipoController();
    static EjercicioController ejerControll = new EjercicioController();
    static RutinaController rutcon = new RutinaController();
    static CredencialesController CredeController = new CredencialesController();
    static HerramientaController hController = new HerramientaController();
    static PeticionesController petController = new PeticionesController();
    static RutinaController runController = new RutinaController();
    static CitaController citControll = new CitaController();

    public static Date time_to_date(LocalTime time, LocalDate fecha) {
        LocalDateTime localDateTime = time.atDate(fecha);
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        return date;
    }

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateSalStringFun1 = "31-08-1982 10:20:56";
        String dateEntraStringFun1 = "31-08-1982 15:20:56";
        String dateSalStringFun2 = "31-08-2002 10:20:56";
        String dateEntraStringFun2 = "31-08-2001 15:20:56";

        LocalDate prueba = LocalDate.of(2004, 1, 1);
        LocalDate prueba1 = LocalDate.of(2002, 2, 2);
        LocalDate prueba2 = LocalDate.of(2003, 1, 1);

        Date dateSalFun1 = new Date();
        Date dateEntFun1 = new Date();
        Date dateSalFun2 = new Date();
        Date dateEntFun2 = new Date();

        //Usuario
        LocalTime hora1 = LocalTime.of(20, 20, 20, 0);
        LocalTime hora2 = LocalTime.of(10, 20, 20, 0);
        LocalTime hora3 = LocalTime.of(2, 10, 20, 0);

        Date dateHora1 = time_to_date(hora1, prueba);
        Date dateHora2 = time_to_date(hora2, prueba1);
        Date dateHora3 = time_to_date(hora3, prueba2);

        Usuario u = new Usuario(null, 125678, "karen", "tovar", "1222567890", "F", "O-");
        Usuario u2 = new Usuario(3, 125678, "karen2", "tovar2", "1222567892", "F", "O-");

        Usuario u3 = new Usuario(2);

        //uControll.create(u);
        //uControll.update(u2);
        /*
        uControll.delete(u3);

        List<Usuario> listaUsuario = uControll.findAll();
        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.println(listaUsuario.get(i));
        }*/
        //
        //Funcional 
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
        Funcional fn3 = FunControll.FindFuncionalByid(2).get(0);
        Funcional fn4 = FunControll.FindFuncionalByid(6).get(0);
        //FunControll.create(fn);
        /*
        //FunControll.update(fn2);
       
        //FunControll.delete(fn3);
        
         */
        //actividad

        Actividad actividad1 = new Actividad(null, "ejemplo", "ejemplo3");
        Actividad actividad2 = new Actividad(3, "ejemplo2", "ejemplo2");
        Actividad actividad3 = new Actividad(1);

        //Acticontroll.create(actividad2);
        //Acticontroll.update(actividad2);
        //Acticontroll.delete(actividad3);                
        //TIPO
        Tipo t = new Tipo(null, "Estudiante");
        Tipo t2 = new Tipo(2, "Administrativo");
        Tipo t3 = new Tipo(3);

        tControll.create(t);
        tControll.update(t2);
        tControll.delete(t3);

        List<Tipo> listaTipo = tControll.findAll();
        for (int i = 0; i < listaTipo.size(); i++) {
            System.out.println(listaTipo.get(i));
        }

        //PLAN NUTRICION 
        PlanNutricion plan = new PlanNutricion(null, "Carbohidratos");
        PlanNutricion plan2 = new PlanNutricion(6, "Frutas");
        PlanNutricion plan3 = new PlanNutricion(4);

        planControll.create(plan);
        planControll.update(plan2);
        planControll.delete(plan3);

        List<PlanNutricion> listaPlanNutricion = planControll.findAll();
        for (int i = 0; i < listaPlanNutricion.size(); i++) {
            System.out.println(listaPlanNutricion.get(i));
        }

        //Consumidor
        Consumidor con1 = Consucontroll.FindConsumidorByid(1).get(0);
        Consumidor c2 = new Consumidor(null, plan2, u2, t2);
        Consumidor c3 = new Consumidor(5);

        // Consucontroll.create(c2);
        // Consucontroll.update(c2);
        // Consucontroll.delete(c2);
        /* 
    List<Consumidor> listaConsumidor = Consucontroll.findAll();
        for (int i = 0; i < listaConsumidor.size(); i++) {
            System.out.println(listaConsumidor.get(i));
        }
         */
        
        //CITA
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateSalStringCit1 = "31-08-2022 10:30:59";
        String dateEntraStringCit1 = "08-08-2022 18:20:23";
        String dateSalStringCit2 = "31-08-2022 10:20:00";
        String dateEntraStringCit2 = "31-08-2022 18:20:50";
        Date dateSalCit1 = new Date();
        Date dateEntCit1 = new Date();
        Date dateSalCit2 = new Date();
        Date dateEntCit2 = new Date();

        try {
            dateSalCit1 = sdf.parse(dateSalStringCit1);
            dateEntCit1 = sdf.parse(dateEntraStringCit1);
            dateSalCit2 = sdf.parse(dateSalStringCit2);
            dateEntCit2 = sdf.parse(dateEntraStringCit2);
        } catch (ParseException ex) {
            System.out.println(ex);
        }

        Cita cit = new Cita(null, dateHora1, dateSalCit1, dateEntCit1, con1);
        Cita cit2 = new Cita(1, dateHora1, dateSalCit2, dateEntCit2, con1);
        Cita cit3 = new Cita(3);

        //citControll.create(cit);
        //citControll.update(cit);
        //citControll.delete(cit);
        /*List<Cita> listaCita = citControll.findAll();
        for (int i = 0; i < listaCita.size(); i++) {
            System.out.println(listaCita.get(i));
        }*/

        //Historial actividades
        HistorialActividades histAct1 = new HistorialActividades(null, con1, actividad2);
        HistorialActividades histAct2 = new HistorialActividades(3, con1, actividad3);
        HistorialActividades histAct3 = new HistorialActividades(4);

        //System.out.println(histAct1);
        //HistoActcontroll.create(histAct1);
        //HistoActcontroll.update(histAct2);
        //HistoActcontroll.delete(histAct2);
        //Instructor
        Instructor instructor1 = new Instructor(null, fn3);
        Instructor instructor2 = new Instructor(9, fn4);
        //InstructorCon.create(instructor2);
        //InstructorCon.update(instructor2);
        //InstructorCon.delete(instructor2);

        Evento evento1 = new Evento(null, "PIlates extremo", dateSalFun1, dateHora1, dateHora2, instructor2, actividad2);
        Evento evento2 = new Evento(5, "PIlates no tan extremo", dateSalFun1, dateHora1, dateHora2, instructor2, actividad2);
        //System.out.println(evento1);
        //EventoCon.create(evento1);
        //EventoCon.update(evento2);
        //EventoCon.delete(evento2);

        Alimento ali = new Alimento(null, "Manzana", "fruta", "/imagenes/frutas");
        Alimento ali2 = new Alimento(4, "Brocoli", "verdura", "/imagenes/verduras");
        Alimento ali3 = new Alimento(2);
        aliControll.create(ali);
        aliControll.update(ali2);
        aliControll.delete(ali2);

        List<Alimento> listaAlimento = aliControll.findAll();
        for (int i = 0; i < listaAlimento.size(); i++) {
            System.out.println(listaAlimento.get(i));
        }

        //EJERCICIO
        Ejercicio ejer = new Ejercicio(null, "/videos/ejercio/brazo", "estiramiento de tricep", "brazo'", 100.4f);
        Ejercicio ejer2 = new Ejercicio(2, "/videos/ejercios/espalda", "espalda", "espalda", 90.05f);
        Ejercicio ejer3 = new Ejercicio(4);

        ejerControll.create(ejer);
        ejerControll.update(ejer2);
        ejerControll.delete(ejer3);

        List<Ejercicio> listaEjercicio = ejerControll.findAll();
        for (int i = 0; i < listaEjercicio.size(); i++) {
            System.out.println(listaEjercicio.get(i));
        }




        Credenciales cr = new Credenciales(null, "aksolanog@itc.edu.co", "perrito", u2);
        Credenciales cr2 = new Credenciales(5);
        Credenciales cr3 = new Credenciales(11);

        //CredeController.create(cr);
        //CredeController.update(cr2);
        //CredeController.delete(cr3);

        /*   List<Credenciales> listaCredenciales = CredeController.findAll();
        for (int i = 0; i < listaCredenciales.size(); i++) {
            System.out.println(listaCredenciales.get(i));
        }*/
        Herramienta h = new Herramienta(null, "Katherine Solano", "mancuerna5k.jpg");
        Herramienta h2 = new Herramienta(5);
        Herramienta h3 = new Herramienta(11);

        //hController.create(h);
        //hController.update(h2);
        //hController.delete(h3);

        /*
        List<Herramienta> listaHerramienta = hController.findAll();
        for (int i = 0; i < listaHerramienta.size(); i++) {
            System.out.println(listaHerramienta.get(i));
        }*/
        //Peticiones
        Peticiones p = new Peticiones(null, con1);
        Peticiones p2 = new Peticiones(5);
        Peticiones p3 = new Peticiones(11);
/*
        petController.create(p);
        petController.update(p2);
        petController.delete(p3);

        List<Peticiones> listaPeticiones = petController.findAll();
        for (int i = 0; i < listaPeticiones.size(); i++) {
            System.out.println(listaPeticiones.get(i));
        }*/

        //Rutina
        Rutina run = new Rutina(null, "tonificar", 1.500f, cit2, actividad2);
        Rutina run2 = new Rutina(5);
        Rutina run3 = new Rutina(11);

       // runController.create(run);
       // runController.update(run2);
       // runController.delete(run3);

        /*List<Rutina> listaRutina = runController.findAll();
        for (int i = 0; i < listaRutina.size(); i++) {
            System.out.println(listaRutina.get(i));
        }*/

    }

}
