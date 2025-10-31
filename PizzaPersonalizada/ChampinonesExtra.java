package PizzaPersonalizada;

public class ChampinonesExtra extends IngredienteExtra {

    public ChampinonesExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Champiñones Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 1.5;
    }
}
