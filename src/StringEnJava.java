public class StringEnJava {
    public static void main(String[] args) {
        //Los Strings son objetos de java, Del tipo de Referencia.
        //Opción 1
        String Nombre = new String("Juan José");
        System.out.println("Nombre = " + Nombre);

        //Forma Literal y recomendada.
        String Genero = "Masculino";
        System.out.println("Genero = " + Genero);

        //Opción 3
        String Apellidos = new String("Henao\"Gutiérrez\"");
        System.out.println("Apellidos = " + Apellidos);

        /*Aun que tambien los Strings se pueden representar
        con una sintaxis especialmenten comoda*/

        /*Sobre las cadenas se define la operacion
        de concatenar con el operador de suma*/

        String Nombre_Completo = Nombre + " " + Apellidos;
        System.out.println(Nombre_Completo);

        //Comparacion

        /*Algo importante que hay que recalcar es
        que los strings no se pueden igualar

        Con el operador de igualdad == Compara por referencia.

        En este caso, se compara utilizando el
        metodo equals() para comprar un valor.
        */

        //Ejemplo

        String Saludo_1 = "Hola Juan";
        String Saludo_2 = new String("Hola, ¿Como estas?");

        //Mira si son el mismo Objeto //Mala Opcion.
        System.out.println("¿Son el mismo Objeto?" +(Saludo_1 == Saludo_2));

        //Mira si tienen el mismo valor //Buena opcion
        System.out.println("¿Tienen el mismo valor?" + Saludo_1.equals(Saludo_2));


        //METODOS  DE LA CLASES O LOS QUE SE PUEDEN APLICAR A LOS STRINGS

        /*
        * int length(): Para mirar la logitud de caracteres del String.
        * boolean equals(String 2): Compara si las dos cadenas tienen el mismo valor.
        * boolean equalsIgnoreCase(String 2): Mira si las dos cadenas son iguales sin importar mayusculas o minusculas.
        * int compareTo(String 2): Compara contra la cadena del argumento, devolviendo:
        *   - Un valor negativ, si la cadena es anterior a String_2
        *   - cero (0) si la cadena es igual a String_1
        *   - un valor positivo si la cadena es posterior a String_2
        * String trim() crea un nuevo objeto eliminando el espacio en blancoque pudiera haber al principio o al final.
        * char charAt(int posicion): Extrae un caracter en la posicion indicada.
        *
        *
        *
        * //ARRAYS
        *
        * char[] toCharArray(): Convierte la cadena en un arreglo de caracteres.
        * String substring(int a, int b): Extrae la sub-cadena entre la posicion String_1 y String_2
        * String substring(int desde): Extrae la sub-cadena desde la posicion indicada.
        * int indexOf(String cadena) indica en que posicion se encuentra un caracter(o cadena de texto) indicando por primera vez, buscando desde el principio.
        * int lastIndexOf(String cadena) indica en que posicion se encuentra el caracter( o cadena) indicando por primera vez, buscando desde el final.
        * boolean starsWith(String profijo) Dice si la cadena comienza con el prefijo indicado.
        * boolean endsWith(String sufijo) Dice si la cadena termina con el prefijo indicado.
        *String[] split(String patron) divide la cadena en varias subcadenas utilizando el patron indicado como separador.
        * */
    }
}
