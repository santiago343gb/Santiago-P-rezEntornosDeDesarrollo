//Comentario de Autor (Santiago)
//Comentario de Versión (1.0)
//Te hace un rectangulo
// return "Rectángulo [Lado A = " + ladoA + ", Lado B = " + ladoB + ", Color = " + color + "]"
public class SantiagoPerez_Rectangulo {

    
    private double ladoA;
    private double ladoB;
    private String color;

    
    public SantiagoPerez_Rectangulo() {
        
        this.ladoA = 0.0;
        this.ladoB = 0.0;
        this.color = "Desconocido";
    }

   
    public SantiagoPerez_Rectangulo(double ladoA, double ladoB, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

  

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    @Override
    public String toString() {
        return "Rectángulo [Lado A = " + ladoA + ", Lado B = " + ladoB + ", Color = " + color + "]";
    }

    public static void main(String[] args) {

        SantiagoPerez_Rectangulo rectangulo = new SantiagoPerez_Rectangulo(5.0, 3.0, "Rojo");
        

        System.out.println(rectangulo.toString());
    }
}
