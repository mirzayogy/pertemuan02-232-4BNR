public class OperasiString{
    public static void main(String[] args){
        String kota = "Banjarbaru";
        // charKota[0] = 'B';
        // charKota[1] = 'a';
        // charKota[2] = 'n';
        // charKota[3] = 'j';
        // charKota[4] = 'a';
        // charKota[5] = 'r';
        // charKota[6] = 'b';
        // charKota[7] = 'a';
        // charKota[8] = 'r';
        // charKota[9] = 'u';

        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        System.out.println(uniskaChar);
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.length());
        System.out.println(kota.substring(6));
        System.out.println(kota.substring(4,7));

    }
}