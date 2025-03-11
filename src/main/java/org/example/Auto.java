package org.example;

class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private String estado;
    private String placa;
    private double capacidadTanque = 50.0;
    private double rendimiento = 12.0;

    public Auto(String marca, String modelo, int anio, double kilometraje, String estado, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.placa = placa;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Estado: " + estado);
        System.out.println("Placa: " + placa);
    }

    public void actualizarKilometraje(double nuevoKilometraje) {
        if (nuevoKilometraje > kilometraje) {
            this.kilometraje = nuevoKilometraje;
        } else {
            System.out.println("El nuevo kilometraje debe ser mayor al actual");
        }
    }

    public boolean esAntiguo() {
        return (2025 - anio) > 15;
    }

    public boolean necesitaMantenimiento() {
        return kilometraje > 100000;
    }

    public double calcularConsumoCombustible(double distancia) {
        return distancia / rendimiento;
    }

    public double combustibleRestante(double distancia) {
        double consumo = calcularConsumoCombustible(distancia);
        return Math.max(capacidadTanque - consumo, 0);
    }
}