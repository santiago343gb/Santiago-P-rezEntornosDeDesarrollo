//Comentario de Autor (Santiago)
//Comentario de Versión (1.0)
//Te hace un circulo
// return "Circulo [radio=" + radio + ", color=" + color + "]";
public class SantiagoPerez_Circulo {

    
    private double radio;
    private String color;

   
    public void InicialesAlumno_Circulo() {
        this.radio = 0.0;
        this.color = "sin color";
    }

   
    public void InicialesAlumno_Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + "]";
    }
}
