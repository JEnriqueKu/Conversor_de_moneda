import java.io.IOException;
import java.util.Scanner;

public class Menu {
    ApiReader apiReader = new ApiReader();
    Conversions conversions = new Conversions();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Currencies currencies = apiReader.readApi();

    public Menu() throws IOException, InterruptedException {
    }

    public void showMenu() throws InterruptedException {
        int opc = 0, dir = 0;
        double money = 0;

        do{
            System.out.println("Hola, este programa permite la conversión de monedas de varios países a dólares estadounidenses, o viceversa. ¿Con qué moneda le gustaría trabajar?");
            System.out.println("1.- Peso argentino");
            System.out.println("2.- Boliviano boliviano");
            System.out.println("3.- Real brasileño");
            System.out.println("4.- Peso colombiano");
            System.out.println("5.- Peso mexicano");
            System.out.println("6.- Salir");

            opc = scanner.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Elija una opción");
                    System.out.println("1.- de Peso a Dolar");
                    System.out.println("2.- de Dolar a Peso");
                    dir = scanner.nextByte();
                    System.out.println("Ingrese el monto");
                    money = scanner.nextDouble();
                    readDir(dir,currencies.getArs(),money);
                    break;
                case 2:
                    System.out.println("Elija una opción");
                    System.out.println("1.- de Boliviano a Dolar");
                    System.out.println("2.- de Dolar a Boliviano");
                    dir = scanner.nextByte();
                    System.out.println("Ingrese el monto");
                    money = scanner.nextDouble();
                    readDir(dir,currencies.getBob(),money);
                    break;
                case 3:
                    System.out.println("Elija una opción");
                    System.out.println("1.- de Real a Dolar");
                    System.out.println("2.- de Dolar a Real");
                    dir = scanner.nextByte();
                    System.out.println("Ingrese el monto");
                    money = scanner.nextDouble();
                    readDir(dir,currencies.getBrl(),money);
                    break;
                case 4:
                    System.out.println("Elija una opción");
                    System.out.println("1.- de Peso a Dolar");
                    System.out.println("2.- de Dolar a Peso");
                    dir = scanner.nextByte();
                    System.out.println("Ingrese el monto");
                    money = scanner.nextDouble();
                    readDir(dir,currencies.getCop(),money);
                    break;
                case 5:
                    System.out.println("Elija una opción");
                    System.out.println("1.- de Peso a Dolar");
                    System.out.println("2.- de Dolar a Peso");
                    dir = scanner.nextByte();
                    System.out.println("Ingrese el monto");
                    money = scanner.nextDouble();
                    readDir(dir,currencies.getMxn(),money);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ingrese un número válido");
                    Thread.sleep(1000);
                    break;
            }
        }while(opc != 6);
    }

    public void readDir(int dir, double currency, double money){
        double result;
        if (dir==1)result = conversions.conversionToDolar(money,currency);
        else result = conversions.conversionfromDolar(money,currency);

        System.out.println(result);
    }
}
