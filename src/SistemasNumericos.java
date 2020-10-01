public class SistemasNumericos {
    public static void main(String[] args) {
        //del 0 al 9
        //Voy a convetir este numero a otro tipos de datos numericos

        //Sistema Decimal
        int NumeroDecimal = 800;
        System.out.println("NumeroDecimal = " + NumeroDecimal);
        System.out.println("---------------------------------------");
        System.out.println("El NumeroDecimal " + NumeroDecimal + " En Binario es: " + Integer.toBinaryString(NumeroDecimal));
        //Aqui java lo reconoce como un entero deciaml.
        //para que lo reconozca como un binario, le agrego al comienzo 0b o 0B
        System.out.println("---------------------------------------");

        //Sistema Binario
        int NumeroBinario = 0B1100100000;
        System.out.println("NumeroBinario = " + NumeroBinario);
        System.out.println("---------------------------------------");

        //Ahora convertire el 800 a octal
        System.out.println("El NumeroBinario " + NumeroDecimal + " En Octal es: " + Integer.toHexString(NumeroDecimal));
        System.out.println("---------------------------------------");

        //Sistema Octal
        //Le agregamos un 0 al inicio para decirle que es un numero octal
        int NumeroOctal = 0320;
        System.out.println("El NumeroOctal " + NumeroOctal);
        System.out.println("---------------------------------------");

        //Sistema hexadecimal
        int NumeroHexadecimal = 0X1F4;
        System.out.println("NumeroHexadecimal = " + NumeroHexadecimal);
        System.out.println("---------------------------------------");
        System.out.println("El NumeroDecimal " + NumeroDecimal + " En Hexadecimal Es: " + Integer.toHexString(NumeroDecimal));
    }
    //EN RESUMEN
    /*
    * CUANDO ES UN NUMERO BINARIO SE PONE PRIMERO 0B Y LUEGO EL NUMERO
    * CUANDO ES UN NUMERO OCTAL PRIMERO EL 0 Y LUEGO EL NUMERO
    * Y CUANDO ES UN NUMERO HEXADECIMAL SE PONE PRIMERO EL 0X Y LUEGO EL NUMERO EN HEXADECIMAL
    *
    * */
}
