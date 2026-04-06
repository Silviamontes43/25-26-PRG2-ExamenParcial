class Reservas {
 
    private String mariaLopez;
    private String pedroGarcia; 
    private int personas;


    public Reservas(String pedroGarcia,  String mariaLopez,  int personas) {
        this.pedroGarcia = pedroGarcia;
        this.mariaLopez = mariaLopez;
        this.personas = personas;
    }

    public String pedroGarcia() {
        return pedroGarcia;
    }

    public String mariaLopez() {
        return mariaLopez;
    }

    public int getPersonas() {
        return personas;
    }
}