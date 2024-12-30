import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double valor = 0;
        Scanner teclado = new Scanner(System.in);
        String menu = """
                *********************************************
                Sea bienvenido/a al Conversor de Moneda =)
                
                1) Dólar  =>>  Euro
                2) Euro  =>>  Dólar
                3) Dólar  =>>  Peso Mexicano
                4) Peso Mexicano  =>>  Dólar
                5) Euro  =>>  Peso Mexicano
                6) Peso Mexicano  =>>  Euro
                
                9) Salir
                
                *********************************************
                Digite una opción: 
                """;
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            if (opcion !=9) {
                System.out.println("Digite la cantidad a transformar: ");
                valor = teclado.nextDouble();
            }
            switch (opcion){
                case 1:
                    ConversionMoneda consulta1 = new ConversionMoneda();
                    consulta1.conversion("USD", "EUR", valor);
                    break;
                case 2:
                    ConversionMoneda consulta2 = new ConversionMoneda();
                    consulta2.conversion("EUR", "USD", valor);
                    break;
                case 3:
                    ConversionMoneda consulta3 = new ConversionMoneda();
                    consulta3.conversion("USD", "MXN", valor);
                    break;
                case 4:
                    ConversionMoneda consulta4 = new ConversionMoneda();
                    consulta4.conversion("MXN", "USD", valor);
                    break;
                case 5:
                    ConversionMoneda consulta5 = new ConversionMoneda();
                    consulta5.conversion("EUR", "MXN", valor);
                    break;
                case 6:
                    ConversionMoneda consulta6 = new ConversionMoneda();
                    consulta6.conversion("MXN", "EUR", valor);
                    break;
                case 9:
                    System.out.println("Muchas gracias por preferirnos.");
                    break;
                default:
                    System.out.println("Escoja una opción válida");
                    break;
            }

        }

    }
}
