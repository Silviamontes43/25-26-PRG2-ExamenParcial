public class Main {
    public static void main(String[] args) {
         Menu menu = new Menu(
                "Ensalada Cesar", 12,
                "Filete de ternera", 25,
                "Paella", 22,
                "Flan de huevo", 6
        );
        menu=(entrante, principal, postre);
        
        Mesas mesa1 = new Mesas("Mesa1", 2);
        Mesas mesa2 = new Mesas("Mesa2", 4);
        Mesas mesa3 = new Mesas("Mesa3", 6);
        mesas=(mesa1,mesa2,mesa3);
        
        Cliente pedro = new Cliente("Pedro Garcia");
        Cliente maria = new Cliente("Maria Lopez");

       
        restaurante.agregarReserva(
                new Reservas(pedro.getNombre(), mesa2, "01/04/2025", "20:00", 4)
        );

        restaurante.agregarReserva(
                new Reservas(maria.getNombre(), mesa1, "02/04/2025", "21:00", 2)
        );

        reservas= (pedroGarcia,mariaLopez);

        
        for (Reservas  : restaurante.getReservas()) {
            System.out.println(getCliente() + " - " +
                    getMesa().getNombre() +
                    " - Personas: " + r.getPersonas());
        }
    }
}