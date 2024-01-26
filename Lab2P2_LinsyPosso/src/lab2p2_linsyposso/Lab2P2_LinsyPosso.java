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
                String autor = Leer.next();
                System.out.println("Ingrese el genero");
                

        }
    }

}