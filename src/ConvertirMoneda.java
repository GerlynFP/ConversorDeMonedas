import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de conversion para hoy\n1 "+ monedaBase+ " = "+ moneda.conversion_rate()+ " " +monedaTarget);
        System.out.println("Ingerese la cantidad de "+ monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " "+ monedaBase+ " = "+ cantidadConvertida+ " " + moneda.target_code());
    }

    public static void ConvertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("ingrese el codido de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
