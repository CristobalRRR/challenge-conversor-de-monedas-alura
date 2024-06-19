import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("*********************************************\n" +
                "Usted a ejecutado el conversor de monedas, Seleccione una opcion por favor:\n" +
                        "1) Dolar a Peso Argentino\n" +
                        "2) Peso argentino a Dolar\n" +
                        "3) Dolar a Peso Chileno\n" +
                        "4) Peso Chileno a Dolar\n" +
                        "5) Dolar a Real Brasileño\n" +
                        "6) Real Brasileño a dolar\n" +
                        "7) Salir\n");
        LlamarConversor llamada = new LlamarConversor();
        var opcionConversor = Integer.valueOf(lectura.nextLine());
        while (opcionConversor < 1 || opcionConversor > 7){
            System.out.println("Opcion no valida, ingrese otra por favor:\n" +
                    "1) Dolar a Peso Argentino\n" +
                    "2) Peso argentino a Dolar\n" +
                    "3) Dolar a Peso Chileno\n" +
                    "4) Peso Chileno a Dolar\n" +
                    "5) Dolar a Real Brasileño\n" +
                    "6) Real Brasileño a dolar\n" +
                    "7) Salir\n");
            opcionConversor = Integer.valueOf(lectura.nextLine());
        }
        if (opcionConversor == 7) {
            System.out.println("Gracias por usar el conversor.\n");
            System.exit(0);
        }
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea convertir: ");
        var cantidad = Integer.valueOf(valor.nextLine());


            while (true) {
                if(opcionConversor == 0){
                    System.out.println("Seleccione otra opcion que desee:\n" +
                            "1) Dolar a Peso Argentino\n" +
                            "2) Peso argentino a Dolar\n" +
                            "3) Dolar a Peso Chileno\n" +
                            "4) Peso Chileno a Dolar\n" +
                            "5) Dolar a Real Brasileño\n" +
                            "6) Real Brasileño a dolar\n" +
                            "7) Salir\n");
                    opcionConversor = Integer.valueOf(lectura.nextLine());
                    if (opcionConversor == 7) {
                        System.out.println("Gracias por usar el conversor.\n");
                        System.exit(0);
                    }
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    cantidad = Integer.valueOf(valor.nextLine());
                }
                if (opcionConversor == 1) {
                    Moneda moneda = llamada.buscarMoneda("USD");
                    System.out.println(cantidad +" Dolares equivalen a: "+moneda.conversion_rates().get("ARS")*cantidad+" Pesos Argentinos \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 2) {
                    Moneda moneda = llamada.buscarMoneda("ARS");
                    System.out.println(cantidad +" Pesos Argentinos equivalen a: "+moneda.conversion_rates().get("USD")*cantidad+" Dolares \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 3) {
                    Moneda moneda = llamada.buscarMoneda("USD");
                    System.out.println(cantidad +" Dolares equivalen a: "+moneda.conversion_rates().get("CLP")*cantidad+" Pesos Chilenos \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 4) {
                    Moneda moneda = llamada.buscarMoneda("CLP");
                    System.out.println(cantidad +" Pesos Chilenos equivalen a: "+moneda.conversion_rates().get("USD")*cantidad+" Dolares \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 5) {
                    Moneda moneda = llamada.buscarMoneda("USD");
                    System.out.println(cantidad +" Dolares equivalen a: "+moneda.conversion_rates().get("BRL")*cantidad+" Reales Brazileños \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 6) {
                    Moneda moneda = llamada.buscarMoneda("BRL");
                    System.out.println(cantidad +" Reales Brazileños equivalen a: "+moneda.conversion_rates().get("USD")*cantidad+" Dolares \n");
                    System.out.println("*********************************************\n");
                    opcionConversor = 0;
                }
                if (opcionConversor == 7) {
                    break;
                } else {
                    opcionConversor = 0;
                }
            }
    }
}