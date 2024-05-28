
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        String menu = """
                *****************************************************
                Sea bienvenido/a al conversor de monedas\n
                    1- Dolar =>> Peso dominicano
                    2- Peso dominicano =>> Dolar
                    3- Dolar =>> Euro
                    4- Euro =>> Dolar
                    5- Euro =>> Peso dominicano
                    6- Peso dominicano =>> Euro
                    7- Convertir otra moneda
                    8- Salir\n
                Eliga una opcion valida:
                *****************************************************""";


        while (opcion != 8){
            System.out.println(menu);
            opcion = lectura.nextInt();
            lectura.nextLine();

                switch (opcion) {
                    case 1:
                        ConvertirMoneda.convertir("USD", "DOP", consulta, lectura);
                        break;
                    case 2:
                        ConvertirMoneda.convertir("DOP", "USD", consulta, lectura);
                        break;
                    case 3:
                        ConvertirMoneda.convertir("USD", "EUR", consulta, lectura);
                        break;
                    case 4:
                        ConvertirMoneda.convertir("EUR", "USD", consulta, lectura);
                        break;
                    case 5:
                        ConvertirMoneda.convertir("EUR", "DOP", consulta, lectura);
                        break;
                    case 6:
                        ConvertirMoneda.convertir("DOP", "EUR", consulta, lectura);
                        break;
                    case 7:
                        ConvertirMoneda.ConvertirOtraMoneda(consulta, lectura);
                        break;
                    case 8:
                        System.out.println("Saliendo....");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;

                }

            }
        }


}
