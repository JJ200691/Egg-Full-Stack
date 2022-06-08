package Extra05;

public class Mes {

    private final String mes[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
        "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = mes[5];

    public Mes() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
