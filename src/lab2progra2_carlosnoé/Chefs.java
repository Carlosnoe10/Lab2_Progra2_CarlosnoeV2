package lab2progra2_carlosnoé;

public class Chefs {
    public String nombre;
    public int edad;
    public int EstrellasMiche;
    public boolean Turno;
    //True Matutino/ False Despertino
    public double Sueldo;

    public Chefs() {
    }

    public Chefs(String nombre, int edad, int EstrellasMiche, boolean Turno, double Sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.EstrellasMiche = EstrellasMiche;
        this.Turno = Turno;
        this.Sueldo = Sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstrellasMiche() {
        return EstrellasMiche;
    }

    public void setEstrellasMiche(int EstrellasMiche) {
        this.EstrellasMiche = EstrellasMiche;
    }

    public boolean isTurno() {
        return Turno;
    }

    public void setTurno(boolean Turno) {
        this.Turno = Turno;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Chefs{" + "nombre=" + nombre + ", edad=" + edad + ", EstrellasMiche=" + EstrellasMiche + ", Turno=" + Turno + ", Sueldo=" + Sueldo + '}';
    }
    
    
}
