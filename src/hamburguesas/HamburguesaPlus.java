package hamburguesas;

import ingredientes.Ingrediente;
import ingredientes.Medallon;

public class HamburguesaPlus extends Hamburguesa{

    private Medallon primerMedallon;

    private Medallon segundoMedallon;

    private Medallon tercerMedallon;

    private Ingrediente primerIngrediente;

    private Ingrediente segundoIngrediente;

    private Ingrediente tercerIngrediente;



    public void asignarPrimerIngrediente(Ingrediente primerIngrediente) {
        this.primerIngrediente = primerIngrediente;
    }

    public void asignarSegundoIngrediente(Ingrediente segundoIngrediente) {
        this.segundoIngrediente = segundoIngrediente;
    }

    public void asignarTercerIngrediente(Ingrediente tercerIngrediente) {
        this.tercerIngrediente = tercerIngrediente;
    }

    public void asignarUnMedallon(Medallon unMedallon){
        if (this.primerMedallon == null){
            this.primerMedallon = unMedallon;
        }else if (this.segundoMedallon == null){
            this.segundoMedallon = unMedallon;
        }else if (this.tercerMedallon == null){
            this.tercerMedallon = unMedallon;
        }else{
            throw new IllegalStateException("Una Hamburguesa Plus No Puede Tener Mas De Tres Medallones");
        }
    }



    public HamburguesaPlus(int precioBase) {
        super(precioBase);
    }
    @Override
    public int precioTotal() {
        return precioBase + primerMedallon.quePrecioTenes()
                + segundoMedallon.quePrecioTenes()
                + primerIngrediente.quePrecioTenes()
                + segundoIngrediente.quePrecioTenes()
                + tercerIngrediente.quePrecioTenes();
    }
}
