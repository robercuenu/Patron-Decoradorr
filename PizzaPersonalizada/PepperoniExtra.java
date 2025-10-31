package PizzaPersonalizada;

public class PepperoniExtra extends IngredienteExtra {

    public PepperoniExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Pepperoni Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 3.0;
    }
}