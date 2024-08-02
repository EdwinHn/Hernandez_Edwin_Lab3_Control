/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_lab3_control;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Lab3_Control {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        Random random = new Random();

        int menu = 1;
        int opcion = 0;

        do {
            System.out.println("--- MENÚ ---\n");
            System.out.println("1- Piedra, Papel y Tijera");
            System.out.println("2- Suma");
            System.out.println("3- Patrón numérico");
            System.out.println("4- Salir\n");

            //Ingreso de opción
            System.out.print("Ingrese su opción: ");
            opcion = scan.nextInt();
            System.out.println("");

            //Ingreso de opción inválida
            if (opcion < 1 || opcion > 4) {
                System.out.println("Ingrese una opción válida\n");

                //Opción 1 - Piedra, Papel y Tijera
            } else if (opcion == 1) {
                System.out.println("** Piedra, Papel y Tijera **");

                String eleccionUsuario;
                String eleccionComputadora;
                int randomGenerado;

                int repetir = 1;
                String respuestaRepetir;

                do {

                    do {
                        System.out.print("\nIngrese su elección: ");
                        eleccionUsuario = scan.next().toLowerCase();

                    } while (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera"));

                    randomGenerado = random.nextInt(1, 4);

                    //La computadora elije piedra
                    if (randomGenerado == 1) {
                        eleccionComputadora = "piedra";

                        if (eleccionUsuario.equals("piedra")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Resultado: empate");

                        } else if (eleccionUsuario.equals("papel")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: usuario");

                        }
                        if (eleccionUsuario.equals("tijera")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: computadora");
                        }

                        //La computadora elije papel
                    } else if (randomGenerado == 2) {
                        eleccionComputadora = "Papel";
                        if (eleccionUsuario.equals("piedra")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: computadora");

                        } else if (eleccionUsuario.equals("papel")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Resultado: empate");

                        }
                        if (eleccionUsuario.equals("tijera")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: usuario");
                        }

                        //La computadora elije tijera
                    } else if (randomGenerado == 3) {
                        eleccionComputadora = "Tijera";
                        if (eleccionUsuario.equals("piedra")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: usuario");

                        } else if (eleccionUsuario.equals("papel")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Ganador: computadora");

                        }
                        if (eleccionUsuario.equals("tijera")) {
                            System.out.println("\nResultado");
                            System.out.println("Usuario: " + eleccionUsuario);
                            System.out.println("Computadora: " + eleccionComputadora);
                            System.out.println("Resultado: empate");
                        }

                    }
                    do {
                        System.out.print("¿Desea volver a jugar: ");
                        respuestaRepetir = scan.next().toLowerCase();

                        if (!respuestaRepetir.equals("si") && !respuestaRepetir.equals("no")) {
                            System.out.print("Ingrese una opción válida");
                        } else if (respuestaRepetir.equals("si")) {
                            repetir = 1;

                        } else if (respuestaRepetir.equals("no")) {
                            System.out.println("");
                            repetir = 0;
                        }

                    } while (!respuestaRepetir.equals("si") && !respuestaRepetir.equals("no"));

                } while (repetir > 0);

                //Opción 2 - Suma   
            } else if (opcion == 2) {
                System.out.println("** Suma **\n");

                int numero;
                String numeroString;
                int numeroSumado = 0;
                int suma = 0;
                int contador = 0;

                do {

                    System.out.print("Ingrese un número: ");
                    numero = scan.nextInt();
                } while (numero < 0);

                numeroString = String.valueOf(numero);
                int cicloSuma = numeroString.length();

                while (cicloSuma > 0) {

                    char digito = numeroString.charAt(contador);
                    numeroSumado = Character.getNumericValue(digito);
                    suma += numeroSumado;
                    cicloSuma--;
                    contador++;

                    System.out.print(digito);

                    if (cicloSuma != 0) {
                        System.out.print(" + ");

                    }
                }

                System.out.print(" = " + suma + "\n"+"\n");

                //Opción 3 - Patrón numérico 
            } else if (opcion == 3) {
                System.out.println("** Patrón numérico **\n");
               
                int filas;
                int contador;
                int numero;
                
                String espacio=" ";
                int contadorEspacio=0;
                int cicloEspacio=0;
                
                do {
                    System.out.print("Ingrese el número de filas: : ");
                    filas = scan.nextInt();
                    
                } while (filas < 0);

                contador=filas;
                numero=contador;
                
                while (contador>0){
                    
                    while (cicloEspacio>0){
                        
                        System.out.print(espacio + " ");
                        cicloEspacio--;
                    }
                    
                    while(numero>0){
                        System.out.print(numero + " ");
                        numero--;
                    }
                    System.out.print("\n");
                    contador--;
                    numero=contador;
                    contadorEspacio++;
                    cicloEspacio=contadorEspacio;
                }
                
                System.out.println("");
                
                
                //Opción 4 - Salir
            } else if (opcion == 4) {
                System.out.println("Adios");
                menu = 0;
            }

        } while (menu > 0);

    }
}
