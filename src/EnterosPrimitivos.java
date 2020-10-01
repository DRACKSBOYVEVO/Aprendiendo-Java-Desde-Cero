public class EnterosPrimitivos {
    public static void main(String[] args) {
        // Entre -128 a 127
        byte enteroByte = 127;

        /*PRIORIDAD ENTRE LAS OPERACIONES*/

        /*
        * [1] Los ()
        * [2] La potencia ^
        * [3] La Multiplicacion y la division * y /
        * [4] Por ultimo, la suma y la Resta + y -
        * */

        System.out.println("enteroByte = " + enteroByte);
        System.out.println("Tipo de dato byte: " + Byte.BYTES);
        System.out.println("Tipo Byte En bits es: " + Byte.SIZE);
        System.out.println("Valor máximo de un Byte: " + Byte.MAX_VALUE);
        System.out.println("El Valor mínimo en un Byte es: " + Byte.MIN_VALUE);

        // entre -32767 a 37767
        short enteroShort = 32767;

        System.out.println("enteroByte = " + enteroShort);
        System.out.println("Tipo de dato short: " + Short.BYTES);
        System.out.println("Tipo Byte En short es: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("El Valor mínimo en un short es: " + Short.MIN_VALUE);

        // Entre -2147483648 Hasta 2147483647
        int enteroInt = 1234567891;

        System.out.println("enteroInt = " + enteroInt);
        System.out.println("Tipo de dato Int: " + Integer.BYTES);
        System.out.println("Tipo Int En Int es: " + Integer.SIZE);
        System.out.println("Valor máximo de un Int: " + Integer.MAX_VALUE);
        System.out.println("El Valor mínimo en un Int es: " + Integer.MIN_VALUE);

        // Entre -9223372036854775808 Hasta 9223372036854775807
        long enteroLog = 5645654654654L;

        System.out.println("enteroLong = " + enteroByte);
        System.out.println("Tipo de dato Long: " + Long.BYTES);
        System.out.println("Tipo Long En bits es: " + Long.SIZE);
        System.out.println("Valor máximo de un Long: " + Long.MAX_VALUE);
        System.out.println("El Valor mínimo en un Long es: " + Long.MIN_VALUE);

    }
}
