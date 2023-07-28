package lab2progra2_carlosnoé;

public class Mesas {

    public int NumeroDePlatos;
    public int NumeroDeUtencilios;
    public double PrecioTotal;

    public Mesas() {
    }

    public Mesas(int NumeroDePlatos, int NumeroDeUtencilios, double PrecioTotal) {
        this.NumeroDePlatos = NumeroDePlatos;
        this.NumeroDeUtencilios = NumeroDeUtencilios;
        this.PrecioTotal = PrecioTotal;
    }

    public int getNumeroDePlatos() {
        return NumeroDePlatos;
    }

    public void setNumeroDePlatos(int NumeroDePlatos) {
        this.NumeroDePlatos = NumeroDePlatos;
    }

    public int getNumeroDeUtencilios() {
        return NumeroDeUtencilios;
    }

    public void setNumeroDeUtencilios(int NumeroDeUtencilios) {
        this.NumeroDeUtencilios = NumeroDeUtencilios;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    @Override
    public String toString() {
        return "Mesas{" + "NumeroDePlatos=" + NumeroDePlatos + ", NumeroDeUtencilios=" + NumeroDeUtencilios + ", PrecioTotal=" + PrecioTotal + '}';
    }
    
    
    
}
