import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaApi consulta = new ConsultaApi();
        var salir = false;

        try {

            while (!salir) {

                System.out.println("Sea bienvenido/a al Conversor de Moneda =]");

                System.out.println("""
                    ****************************************
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir
                    ****************************************
                    Elija una opción válida: 
                    """);
                int opcion = Integer.parseInt(new Scanner(System.in).nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "ARS";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);
                    }
                    case 2 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "ARS";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 3 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "BRL";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 4 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "BRL";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 5 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "COP";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 6 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "COP";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 7 -> {
                        System.out.print("Finalizando el Conversor  de Monedas. " +
                                "Muchas gracias por usar nuestros servicios");
                        salir = true; //salimos del ciclo while
                    }
                    default -> System.out.println("Opcion invalida: " + opcion);
                }


                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando el programa");
        }
    }
}
