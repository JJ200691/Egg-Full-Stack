package Extra06;

public class Ahorcado {

    private String palabra[];
    private String letra;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String letra, int cantJugadas) {
        this.palabra = palabra;
        this.letra = letra;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

}
