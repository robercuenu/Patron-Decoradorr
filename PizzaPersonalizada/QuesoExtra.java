package PizzaPersonalizada;

public class QuesoExtra extends IngredienteExtra {

    public QuesoExtra(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Queso Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 2.0; // Precio adicional del queso
    }
}
