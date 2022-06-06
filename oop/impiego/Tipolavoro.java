package oop.impiego;

public class Tipolavoro {
    private String nomeImpiego;
    private int oreLavoro;
    private double stipendio;

    Tipolavoro() {

    }

    Tipolavoro(String nomeImpiego, int oreLavoro, double stipendio) {
        setNome(nomeImpiego);
        setOre(oreLavoro);
        setStipendio(stipendio);

    }

    public void setNome(String a) {
        this.nomeImpiego = a;
    }

    public void setOre(int b) {
        this.oreLavoro = b;
    }

    public void setStipendio(double c) {
        this.stipendio = c;
    }

    public String getNome() {
        return nomeImpiego;
    }

    public int getOre() {
        return oreLavoro;
    }

    public double getStipendio() {
        return stipendio;
    }
}
