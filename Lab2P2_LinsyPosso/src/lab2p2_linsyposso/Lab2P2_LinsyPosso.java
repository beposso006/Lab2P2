/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_linsyposso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class Lab2P2_LinsyPosso {

    public static Scanner Leer = new Scanner(System.in);
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList biblioteca = new ArrayList<>();
    private static Usuario Usertemp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuarios.add(new Usuario("estudiantito", "1234L", "Estudiante"));
        usuarios.add(new Usuario("profesor", "222nM", "Profesor"));
        usuarios.add(new Usuario("bibliotecario", "Lmn56", "Bibliotecario"));
        inicioSesion();
        boolean running = true;
        while (running) {
            if (Usertemp.getTipo().equals("Estudiante")) {
                System.out.println("--Menu--");
                System.out.println("1. Listar Recursos");
                System.out.println("2. Salir");
                System.out.print("Ingrese una opcion: ");
                int opcionE = Leer.nextInt();
                switch (opcionE) {
                    case 1:
                        listarRecursos();
                        break;
                    case 2:
                    default:
                        running = false;
                        System.out.println("Byee");
                        break;
                }
            }
            if (Usertemp.getTipo().equals("Profesor")) {
                System.out.println("--Menu--");
                System.out.println("1. Listar Recursos");
                System.out.println("2. Crear Recurso");
                System.out.println("3. Salir");
                System.out.print("Ingrese una opcion: ");
                int opcionP = Leer.nextInt();
                switch (opcionP) {
                    case 1:
                        listarRecursos();
                        break;

                    case 2:
                        crearRecusos();
                        break;

                    case 3:
                    default:
                        running = false;
                        System.out.println("Byee");
                        break;
                }
            }
            if (Usertemp.getTipo().equals("Bibliotecario")) {
                System.out.println("--Menu--");
                System.out.println("1. Listar Recursos");
                System.out.println("2. Crear Recurso");
                System.out.println("3. Eliminar Recurso");
                System.out.println("4. Modificar");
                System.out.println("5. Salir");
                System.out.print("Ingrese una opcion: ");
                int opcionB = Leer.nextInt();
                switch (opcionB) {
                    case 1:
                        listarRecursos();
                        break;

                    case 2:
                        crearRecusos();
                        break;
                }
            }

        }

    }

    public static void inicioSesion() {
        System.out.println("---Bienvenido---");
        System.out.print("Ingrese su nombre usuario: ");
        String usuario = Leer.next();
        System.out.print("Ingrese su contraseña: ");
        String pass = Leer.next();

        for (Usuario user : usuarios) {
            if (user.getNombreU().equals(usuario) && user.getContra().equals(pass)) {
                Usertemp = user;
                System.out.println("Inicio de sesion exitoso.");
                return;
            }
        }
        System.out.println("No se ha encontrado el usurio");

    }

    public static void crearRecusos() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Que recurso le gustaria crear: ");
            System.out.println("1. Libro");
            System.out.println("2. Articulos");
            System.out.println("3. Cursos en linea");
            System.out.println("4. Conferencias Virtuales");
            System.out.print("Ingrese una opcion: ");
            int op = Leer.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el titulo de el libro: ");
                    String titulo = Leer.next();
                    System.out.print("Ingrese el autor: ");
                    Leer.nextLine();
                    String autor = Leer.next();
                    System.out.print("Ingrese el genero: ");
                    Leer.nextLine();
                    String genero = Leer.next();
                    System.out.print("Ingrese fecha de publicacion (MM/dd/yyyy): ");
                    Leer.nextLine();
                    String fechaP = Leer.nextLine();
                    System.out.print("Ingrese disponibilidad: ");
                    String disp = Leer.next();
                    boolean existe = false;
                    if (disp == "si") {
                        existe = true;
                    } else {
                        existe = false;
                    }
                    Libros libro = new Libros(titulo, autor, genero, fechaP, existe);
                    biblioteca.add(libro);
                    seguir = false;
                    break;
                //Libros

                case 2:
                    System.out.print("Ingrese el titulo de el articulo: ");
                    String tituloAr = Leer.next();
                    System.out.print("Ingrese el autor: ");
                    Leer.nextLine();
                    String autorAr = Leer.next();
                    System.out.print("Ingrese el tema: ");
                    Leer.nextLine();
                    String tema = Leer.next();
                    System.out.print("Ingrese fecha de publicacion (MM/dd/yyyy): ");
                    Leer.nextLine();
                    String fechaPAr = Leer.nextLine();
                    System.out.print("Ingrese disponibilidad: ");
                    String acess = Leer.next();
                    boolean hayacs = false;
                    if (acess == "si") {
                        hayacs = true;
                    } else {
                        hayacs = false;
                    }
                    Articulos arct = new Articulos(tituloAr, autorAr, tema, fechaPAr, hayacs);
                    biblioteca.add(arct);
                    seguir = false;
                    break;

                case 3:
                    System.out.print("Ingrese el titulo de el curso: ");
                    String tituloCurs = Leer.next();
                    System.out.print("Ingrese el instructor: ");
                    Leer.nextLine();
                    String instru = Leer.next();
                    System.out.print("Ingrese la duracion en semanas: ");
                    Leer.nextLine();
                    int duracion = Leer.nextInt();
                    System.out.print("Ingrese la plataforma: ");
                    Leer.nextLine();
                    String plataforma = Leer.nextLine();
                    Cursos_en_Linea cursos = new Cursos_en_Linea(tituloCurs, instru, duracion, plataforma);
                    biblioteca.add(cursos);
                    seguir = false;
                    break;

                case 4:
                    System.out.print("Ingrese el titulo de la conferencia: ");
                    String tituloConf = Leer.next();
                    System.out.print("Ingrese el conferencista: ");
                    Leer.nextLine();
                    String confe = Leer.next();
                    System.out.print("Ingrese la fecha de conferencia (MM/dd/yyyy): ");
                    Leer.nextLine();
                    String fechaConf = Leer.nextLine();
                    System.out.print("Ingrese la duracion: ");
                    Leer.nextLine();
                    int duracionConf = Leer.nextInt();
                    System.out.print("Ingrese el enlace: ");
                    Leer.nextLine();
                    String enlace = Leer.nextLine();
                    ConferenciasVirtuales confV = new ConferenciasVirtuales(tituloConf, confe, fechaConf, duracionConf, enlace);
                    biblioteca.add(confV);
                    seguir = false;
                    break;
            }
        }

    }

    public static void listarRecursos() {
        System.out.println("Lista de Recursos:");
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(i + ". " + biblioteca.get(i).toString());
        }
    }

    public static void eliminarRecursos() {
        System.out.println("Lista de Recursos:");
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(i + ". " + biblioteca.get(i).toString());
        }
        System.out.println("Seleccione el índice del recurso a eliminar:");
        int indiceRecurso = Leer.nextInt();
        if (indiceRecurso >= 0 && indiceRecurso <= biblioteca.size()) {
            biblioteca.remove(indiceRecurso);

        }
    }

    public static void modificarRecursos() {
        System.out.println("Lista de Recursos:");
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(i + ". " + biblioteca.get(i).toString());
        }
        System.out.println("Seleccione el índice del recurso a eliminar:");
        int indiceRecurso = Leer.nextInt();
        if (indiceRecurso >= 0 && indiceRecurso <= biblioteca.size()) {
            if (biblioteca.get(indiceRecurso) instanceof Libros) {
                System.out.print("Ingrese el nuevo titulo de el libro: ");
                String titulo = Leer.next();
                ((Libros)biblioteca.get(indiceRecurso)).setTitulo(titulo);
                System.out.print("Ingrese el nuevo autor: ");
                Leer.nextLine();
                String autor = Leer.next();
                ((Libros)biblioteca.get(indiceRecurso)).setAutor(autor);
                System.out.print("Ingrese el genero: ");
                Leer.nextLine();
                String genero = Leer.next();
                ((Libros)biblioteca.get(indiceRecurso)).setGenero(genero);
                System.out.print("Ingrese fecha de publicacion (MM/dd/yyyy): ");
                Leer.nextLine();
                String fechaP = Leer.nextLine();
                ((Libros)biblioteca.get(indiceRecurso)).setAñoPublicacion(fechaP);
                System.out.print("Ingrese disponibilidad: ");
                String disp = Leer.next();              
                    boolean existe = false;
                    if (disp == "si") {
                        existe = true;
                    } else {
                        existe = false;
                    }
                    ((Libros)biblioteca.get(indiceRecurso)).setDisponibilidad(existe);
            }
            if (biblioteca.get(indiceRecurso) instanceof Articulos) {
                
            }
        }
    }
}
