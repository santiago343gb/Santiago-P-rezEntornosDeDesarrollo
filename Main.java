// Clase Main.java
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Cuadrado y Circulo
        Cuadrado cuadrado = new Cuadrado(5); // Lado del cuadrado
        Circulo circulo = new Circulo(3);    // Radio del círculo

        // Calcular las áreas
        double areaCuadrado = cuadrado.calcularArea();
        double areaCirculo = circulo.calcularArea();

        // Calcular la diferencia de áreas
        double diferencia = Math.abs(areaCuadrado - areaCirculo);

        // Imprimir los resultados
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Diferencia entre áreas: " + diferencia);
    }
}
