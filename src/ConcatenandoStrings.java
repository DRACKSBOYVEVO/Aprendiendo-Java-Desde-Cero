public class ConcatenandoStrings {
    public static void main(String[] args) {
        //Un Ejemplo Simple.
        String Nombre = "Juan José ";
        String Apellidos = "Henao Gutiérrez ";

        String Nombre_Completo = Nombre + " " + Apellidos;
        System.out.println(Nombre_Completo);

        /*Concatenando Strings con Numeros*/

        int Edad = 21;
        System.out.println(Nombre + Edad);

        /*En el siguiente ejemplo, daria un error,
        por que no se sumarian los numeros,
        si no que se juntarian uno al lado del otro.
        */

        int Numero_1 = 10;
        int Numero_2 = 11;
        //Aqui java, interpreta como si fuera Toodo un string y no suma nada.
        System.out.println(Nombre + Numero_1 + Numero_2);
        //para resolver este problema de presedencia, le tenemos que decir que haga primero lo del
        //parentesis y luego imprima lo demas.
        System.out.println(Nombre + (Numero_1+Numero_2));
        //Ahora, sumara los dos primeros numeros, pero luego se dara cuenta
        //de que sigue un string, no lo suma, pero si concatena su contenido.
        System.out.println(Numero_1 + Numero_2 + Nombre);


        //Ahora concatenare utilizando un metodo y no un +
        String Fruta_2 = "Manzana ";
        String Fruta_1 = "Mango ";

        String Mercado = Fruta_1.concat(Fruta_2);
        System.out.println(Mercado);

    }
}
