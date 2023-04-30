import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja <String> micaja = new Caja<>(new String [10]);

        micaja.add(0, "HI");
        micaja.add(1, "HELLO");
        micaja.add(2, "HOLA");
        System.out.println(micaja);

        String temp = micaja.get(0);


        System.out.println("-----------");
        CajaSinGenericos cajasin = new CajaSinGenericos(new Object[10]);
        cajasin.add(0, "Hola");
        cajasin.add(1, "adios");
        cajasin.add(2, "HI");
        System.out.println(cajasin);

        String temp2 = (String) cajasin.get(0);


        System.out.println("----------COMIDA---------");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("yogurth",true));
        System.out.println(cajaComida.get(0));

        System.out.println("-------------");

        ArrayList<Comida> comidas = new ArrayList<>();

        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Manzana", true));
        comidas.add(new Comida("Mango", true));


        System.out.println(comidas.size());
        System.out.println(comidas.get(29));


        ArrayList<Comida>comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Mango",true));
        comidas2.add(new Comida("Yogurth",false));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bistek",false));

        comidas2.add(3,new Comida("Naranja", false));
        

        System.out.println(comidas2.get(3));


        comidas2.set(3, new Comida("fresa", false));

        System.out.println("----------FINAL-----------");

        for (Comida comida: comidas2) {
            System.out.println(comida);

        }














    }


}