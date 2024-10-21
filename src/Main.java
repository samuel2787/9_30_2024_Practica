//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Automovil auto = new Automovil();
        auto.marca = "BMW";
        auto.modelo = "i320";
        auto.color = "Blanco";
        auto.cilindraje = 3.2;
        System.out.println("la marca de el auto es:"+auto.marca); // sirve para imprimir cosas
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);

        Celular celu = new Celular(); // cuando instancio  un objeto es con minuscula mientras que la clase se mantiene en mayuscula

        celu.precio= 1000;
        celu.año = 2024;
        celu.marca = "Apple";
        celu.tamaño_de_pantalla = 6.3f;
        System.out.println("celu.marca = " + celu.marca);
        System.out.println("celu.año = " + celu.año);
        System.out.println("celu.precio = " + celu.precio);
        System.out.println("celu.tamaño_de_pantalla = " + celu.tamaño_de_pantalla);*/

        Automovil bmw = new Automovil();
        bmw.marca = "BMW";
        bmw.modelo = "i320";
        bmw.color = "Blanco";
        bmw.cilindraje = 3.2;
        //bmw.detalleauto(); //siempre hay instanciar el metodo
        System.out.println(bmw.detalleauto());


        Automovil mb = new Automovil();
        mb.marca = "BMW";
        mb.modelo = "i320";
        mb.color = "Blanco";
        mb.cilindraje = 3.2;
        //mb.detalleauto();
        System.out.println(mb.detalleauto());
        Celular celu = new Celular(); // cuando instancio  un objeto es con minuscula mientras que la clase se mantiene en mayuscula
        celu.precio= 1000;
        celu.modelo = 15;
        celu.marca = "Apple";
        celu.tamaño_de_pantalla = 6.3f;
        //celu.detallecel();
    }
    /* sout y soutv sirven para poder imprimir como atajos */

}