package conversordemonedas.main;

import conversordemonedas.modelos.Moneda;
import conversordemonedas.modelos.TasaDeCambio;
import conversordemonedas.servicios.ConsultaIntercambioDeMoneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("Bienvenido/a al Conversor de Moneda");

        Scanner scanner = new Scanner(System.in);
        List<String> historial = new ArrayList<>();
        ConsultaIntercambioDeMoneda consulta = new ConsultaIntercambioDeMoneda();

        int opcion = 0;
        while (opcion != 14) {
            mostrarMenu();
            opcion = scanner.nextInt();

            if (opcion > 0 && opcion < 13 ) {
                System.out.println("Ingrese la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();
                String base = "";
                String target = "";

                switch (opcion) {
                    case 1 -> { base = "ARS"; target = "BRL"; }
                    case 2 -> { base = "ARS"; target = "COP"; }
                    case 3 -> { base = "ARS"; target = "MXN"; }
                    case 4 -> { base = "BRL"; target = "ARS"; }
                    case 5 -> { base = "BRL"; target = "COP"; }
                    case 6 -> { base = "BRL"; target = "MXN"; }
                    case 7 -> { base = "COP"; target = "ARS"; }
                    case 8 -> { base = "COP"; target = "BRL"; }
                    case 9 -> { base = "COP"; target = "MXN"; }
                    case 10 -> { base = "MXN"; target = "ARS"; }
                    case 11 -> { base = "MXN"; target = "BRL"; }
                    case 12 -> { base = "MXN"; target = "COP"; }
                }

                TasaDeCambio tasa = consulta.consultaTasa(base, target);
                if (tasa != null) {
                    Moneda moneda = new Moneda(tasa, cantidad);
                    String resultado = cantidad + " " + base + " equivale a " + String.format("%.2f", moneda.getCantidadConvertida()) + " " + target;
                    historial.add(resultado);

                    System.out.println(resultado);
                }
            } else if (opcion == 13) {
                System.out.println("**********************************************");
                System.out.println("Historial de conversiones:");
                for (String conversion: historial) {
                    System.out.println(conversion);
                }
                System.out.println("**********************************************");
            } else if (opcion != 14) {
                System.out.println("Opción no valida. Intente denuevo.");
            }
        }
        System.out.println("Gracias por su preferencia, ¡vuelva pronto!");
    }

    private static void mostrarMenu() {
        System.out.println("""
            *** Conversiones Disponibles ***
            
            1) ARS (Peso Argentino) a BRL (Real Brasileño)
            2) ARS (Peso Argentino) a COP (Peso Colombiano)
            3) ARS (Peso Argentino) a MXN (Peso Mexicano)
            4) BRL (Real Brasileño) a ARS (Peso Argentino)
            5) BRL (Real Brasileño) a COP (Peso Colombiano)
            6) BRL (Real Brasileño) a MXN (Peso Mexicano)
            7) COP (Peso Colombiano) a ARS (Peso Argentino)
            8) COP (Peso Colombiano) a BRL (Real Brasileño)
            9) COP (Peso Colombiano) a MXN (Peso Mexicano)
            10) MXN (Peso Mexicano) a ARS (Peso Argentino)
            11) MXN (Peso Mexicano) a BRL (Real Brasileño)
            12) MXN (Peso Mexicano) a COP (Peso Colombiano)
            13) Ver historial de conversiones
            14) Salir
            
            Ingrese el número de la conversión que desea hacer:
            """
        );
    }
}
