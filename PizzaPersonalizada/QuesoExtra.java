package PizzaPersonalizada;

public class QuesoExtra extends IngredienteExtra {

    public QuesoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Queso Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 2.0;
    }
}
