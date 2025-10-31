package PizzaPersonalizada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("👤 Ingrese el nombre del cliente:");
        String cliente = sc.nextLine();

        Pizza pedido = new PizzaBase("Pizza Clásica", 8.0);
        pedido = new QuesoExtra(pedido);
        pedido = new PepperoniExtra(pedido);
        pedido = new ChampinonesExtra(pedido);

        System.out.println("\n🧾 Pedido para: " + cliente);
        System.out.println("🍕 Descripción: " + pedido.getDescripcion());
        System.out.println("💰 Total a pagar: $" + pedido.getCosto());
        System.out.println("🏪 ¡Gracias por tu compra en Pizzas El Programador!");

        sc.close();
    }
}
