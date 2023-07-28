package lab2progra2_carlosnoé;

public class Meseros {

    public String nombre;
    public int edad;
    public boolean Turno;
    //True Matutino/ False Despertino
    public double Sueldo;
    public double Propina;

    public Meseros() {
    }

    public Meseros(String nombre, int edad, boolean Turno, double Sueldo, double Propina) {
        this.nombre = nombre;
        this.edad = edad;
        this.Turno = Turno;
        this.Sueldo = Sueldo;
        this.Propina = Propina;
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

    public double getPropina() {
        return Propina;
    }

    public void setPropina(double Propina) {
        this.Propina = Propina;
    }

    @Override
    public String toString() {
        return "Meseros{" + "nombre=" + nombre + ", edad=" + edad + ", Turno=" + Turno + ", Sueldo=" + Sueldo + ", Propina=" + Propina + '}';
    }
    
    
}
