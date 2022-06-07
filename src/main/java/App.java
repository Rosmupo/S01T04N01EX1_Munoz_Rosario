public class App {

    public static void main(String [] args){
        //Se instancia un objeto de tipo Ordenador para acceder
        //a la lista de los meses e imprimirlo por pantalla
        Ordenador ordenador = new Ordenador();
        for (Month month: ordenador.getMonthsList()) {
            System.out.println(month.getName());
        }
    }
}
