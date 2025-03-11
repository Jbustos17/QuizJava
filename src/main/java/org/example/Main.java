package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;
        int opcion;

        do {
            System.out.println("1. Crear un nuevo auto");
            System.out.println("2. Mostrar detalles del auto");
            System.out.println("3. Actualizar kilometraje");
            System.out.println("4. Verificar si el auto es antiguo");
            System.out.println("5. Verificar si necesita mantenimiento");
            System.out.println("6. Calcular consumo de combustible");
            System.out.println("7. Calcular combustible restante");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Ingrese el kilometraje: ");
                    double kilometraje = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    auto = new Auto(marca, modelo, anio, kilometraje, estado, placa);
                    System.out.println("Auto creado exitosamente.");
                    break;
                case 2:
                    if (auto != null) auto.mostrarDetalles();
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 3:
                    if (auto != null) {
                        System.out.print("Ingrese el nuevo kilometraje: ");
                        double nuevoKilometraje = scanner.nextDouble();
                        auto.actualizarKilometraje(nuevoKilometraje);
                    } else System.out.println("Primero debe crear un auto.");
                    break;
                case 4:
                    if (auto != null)
                        System.out.println(auto.esAntiguo() ? "El auto es antiguo." : "El auto no es antiguo.");
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 5:
                    if (auto != null)
                        System.out.println(auto.necesitaMantenimiento() ? "El auto necesita mantenimiento." : "El auto no necesita mantenimiento.");
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 6:
                    if (auto != null) {
                        System.out.print("Ingrese la distancia recorrida (km): ");
                        double distancia = scanner.nextDouble();
                        System.out.println("Consumo de combustible: " + auto.calcularConsumoCombustible(distancia) + " litros");
                    } else System.out.println("Primero debe crear un auto.");
                    break;
                case 7:
                    if (auto != null) {
                        System.out.print("Ingrese la distancia recorrida (km): ");
                        double distanciaRestante = scanner.nextDouble();
                        System.out.println("Combustible restante: " + auto.combustibleRestante(distanciaRestante) + " litros");
                    } else System.out.println("Primero debe crear un auto.");
                    break;

            }
        } while (opcion != 7);

        scanner.close();
    }
}



