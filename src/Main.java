import hamburguesas.HamburguesaDoble;
import hamburguesas.HamburguesaFlex;
import hamburguesas.HamburguesaPlus;
import hamburguesas.HamburguesaSimple;
import ingredientes.Ingrediente;
import ingredientes.Medallon;
public class Main {
    public static void main(String[] args) {

        //Los medallones
        Medallon carne = new Medallon(800);
        Medallon vegetariano = new Medallon(300);
        Medallon pollo = new Medallon(500);

        //Los ingredientes
        Ingrediente lechuga = new Ingrediente(100);
        Ingrediente cebolla = new Ingrediente(70);
        Ingrediente cheddar = new Ingrediente(250);
        Ingrediente tomate = new Ingrediente(175);


        //Hamburguesa simple con limite de un medallon

        HamburguesaSimple unasimple = new HamburguesaSimple(4000);
        unasimple.asignarUnMedallon(carne);
        unasimple.asignarUnIngrediente(tomate);
        System.out.println("Precio total de la simple = " + unasimple.precioTotal());

        //Hamburguesa Doble con limite de dos medallones

        HamburguesaDoble unadoble = new HamburguesaDoble(7000);
        unadoble.asignarUnMedallon(vegetariano);
        unadoble.asignarUnMedallon(pollo);
        unadoble.asignarUnIngrediente(lechuga);
        unadoble.asignarSegundoIngrediente(tomate);
        System.out.println("Precio total de la Hambuerguesa doble = " + unadoble.precioTotal());


        // Hamburguesa Plus con limite de tres medallones

        HamburguesaPlus unatriple = new HamburguesaPlus(11000);
        unatriple.asignarUnMedallon(carne);
        unatriple.asignarUnMedallon(pollo);
        unatriple.asignarUnMedallon(vegetariano);
        unatriple.asignarPrimerIngrediente(tomate);
        unatriple.asignarSegundoIngrediente(tomate);
        unatriple.asignarTercerIngrediente(lechuga);
        System.out.println("Precio total de la hamburguesa Plus = " + unatriple.precioTotal());


        // Hamburguesa Flex sin limites

        HamburguesaFlex unasinlimites = new HamburguesaFlex(14000);
        unasinlimites.asignarMedallon(carne);
        unasinlimites.asignarMedallon(carne);
        unasinlimites.asignarMedallon(carne);
        unasinlimites.asignarMedallon(carne);
        unasinlimites.asignarMedallon(carne);
        unasinlimites.asignarIngrediente(cheddar);
        unasinlimites.asignarIngrediente(cheddar);
        unasinlimites.asignarIngrediente(cheddar);
        unasinlimites.asignarIngrediente(cheddar);
        System.out.println("Precio Total de la Hamburguesa Flex = " + unasinlimites.precioTotal());

    }
}