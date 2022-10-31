public class Main {
    public static void main(String[] args) {

        //Bilinen en küçük iki arkadaş sayı 220 ve 294 dür. Kendileri hariç pozitif tam bölenlerin toplamı diğerine eşit olan sayılara arkadaş sasyılar denir.

        int number1 = 220;
        int number2 = 285;
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 = total2 + j;
            }
        }
        if (total1 == number2) {                                   //Burada iç içe if yerine if(total1==number2 && total2==number1) da yapabiliriz.
            if (total2 == number1) {                               // && bir And operatörü ve şartların ikiside sağlanmalı
                System.out.println("Sayılar arkadaş sayılardır");  // || bir Or operatörü şartlardan biri bile sağlansa olur.
            }
        }
        else{
            System.out.println("Sayılar arkadaş değiller");

    }

    }

}



