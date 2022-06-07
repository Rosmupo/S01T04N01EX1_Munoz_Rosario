import java.util.ArrayList;

// Se crea una clase que inserte en una lista ordenada
// los nombres de los meses del año

public class Ordenador {

    ArrayList<Month> monthlist;

    public Ordenador() {
        monthlist = new ArrayList<>();
    }
    public ArrayList<Month> getMonthsList(){

        Month month0 = new Month("Enero");
        Month month1 = new Month("Febrero");
        Month month2 = new Month("Marzo");
        Month month3 = new Month("Abril");
        Month month4 = new Month("Mayo");
        Month month5 = new Month("Junio");
        Month month6 = new Month("Julio");
        Month month7 = new Month("Agosto");
        Month month8 = new Month("Septiembre");
        Month month9 = new Month("Octubre");
        Month month10 = new Month("Noviembre");
        Month month11 = new Month("Diciembre");

        monthlist.add(month0);
        monthlist.add(month1);
        monthlist.add(month2);
        monthlist.add(month3);
        monthlist.add(month4);
        monthlist.add(month5);
        monthlist.add(month6);
        monthlist.add(month7);
        monthlist.add(month8);
        monthlist.add(month9);
        monthlist.add(month10);
        monthlist.add(month11);

        return monthlist;
    }

}

