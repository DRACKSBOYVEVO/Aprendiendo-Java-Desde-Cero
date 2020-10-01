public class ConversionDeTiposDeDatos {
    public static void main(String[] args) {
        //Convertir un numero de tipo String a entero

        //Una nota es que puedo utilizar var en vez de String,
        //ya que es una variable flexible con los tipos de datos.
        String NumeroStr = "21";

        int NumeroInt = Integer.parseInt(NumeroStr);
        System.out.println("NumeroInt = " + NumeroInt);

        //Ejemplo De enteros y decimales
        String NumeroRealStr = "54654.87"; //tambien se puede "54654.87e-9"
        double NumeroRealDouble = Double.parseDouble(NumeroRealStr);
        System.out.println("NumeroRealDouble = " + NumeroRealDouble);

        //Ejemplo de datos boleeanos o logicos
        String DatoLogico = "true";
        boolean datoBooleanStr = Boolean.parseBoolean(DatoLogico);
        System.out.println("datoBooleanStr = " + datoBooleanStr);

        /*ahora hare lo contrario, convertir un tipo de dato numerico
        * a string*/

        int numeroInt = 100;
        System.out.println("Numero_1 = " + numeroInt);

        //primera forma de hacerlo
        String numeroStr = Integer.toString(numeroInt);
        System.out.println("numeroStr = " + numeroStr);
        //segunda forma de hacerlo
        numeroStr = String.valueOf(numeroInt+21); //le supo 21 a 100
        System.out.println("numeroStr = " + numeroStr);
            

    }
}
