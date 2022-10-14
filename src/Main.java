public class Main {
    public static void main(String[] args) {
        int NumeroIf = 0;


        if (NumeroIf > 0) {

            System.out.println("el variable If: " + NumeroIf + " es positivo");


        } else if (NumeroIf < 0) {
            System.out.println("la variable If: " + NumeroIf + " es negativo");
        } else {
            System.out.println("la variable es 0");
        }
        int NumeroWhile = 0;
        while (NumeroWhile < 3) {
            System.out.println("la variable de numero while es: " + NumeroWhile);
            NumeroWhile++;
        }
        int NumeroDoW = 5;

        do {
            NumeroDoW++;
            System.out.println("la variable Do while es: " + NumeroDoW);
        } while (NumeroDoW < 5);


        for (int NumeroF = 7; NumeroF <= 10; NumeroF++) {
            System.out.println("la variable for es: " + NumeroF);
        }
        var estacion = "Primavera";
        switch(estacion) {
        case "Primavera":
        System.out.println("Es Primavera!");
        break;
            case "Verano":
                System.out.println("es Verano!");
                break;
            case "Invierno":
                System.out.println("es invierno!");
                        break;
            case "Otoño":
                System.out.println("es otoño!");
                break;
            default:
                System.out.println("no es una estacion");
    }}
}