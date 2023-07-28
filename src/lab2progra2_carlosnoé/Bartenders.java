package lab2progra2_carlosnoé;

public class Bartenders {

    public String nombre;
    public int edad;
    public boolean Turno;
    //True Matutino/ False Despertino
    public double Sueldo;
    public int NumeroLico;

    public Bartenders() {
    }

    public Bartenders(String nombre, int edad, boolean Turno, double Sueldo, int NumeroLico) {
        this.nombre = nombre;
        this.edad = edad;
        this.Turno = Turno;
        this.Sueldo = Sueldo;
        this.NumeroLico = NumeroLico;
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

    public int getNumeroLico() {
        return NumeroLico;
    }

    public void setNumeroLico(int NumeroLico) {
        this.NumeroLico = NumeroLico;
    }

    @Override
    public String toString() {
        return "Bartenders{" + "nombre=" + nombre + ", edad=" + edad + ", Turno=" + Turno + ", Sueldo=" + Sueldo + ", NumeroLico=" + NumeroLico + '}';
    }
    
    
    

}
