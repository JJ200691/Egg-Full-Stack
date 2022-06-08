package Extra03;

public class Cliente {

    private String nombreYapellido;
    private int dni;
    private String mail;
    private String domicilio;
    private int nroTel;

    public Cliente(String nombreYapellido, int dni, String domicilio, int nroTel) {
    }

    public Cliente() {
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreYapellido=" + nombreYapellido + ", dni=" + dni + ", mail=" + mail + ", domicilio=" + domicilio + ", nroTel=" + nroTel + '}';
    }

}
