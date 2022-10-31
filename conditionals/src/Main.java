public class Main {
    public static void main(String[] args) {

        int sayi = 20;

        if(sayi<20)
        { //eğer bu koşul dopruysa süslü parantezin içini çalıştır anlamına geliyor süslü parantezler

            System.out.println("Sayı 20 den küçüktür.");
        } else if(sayi==20){ //sadece else olunca if yada else birinden biri çalışmak zorunda ama else if dersek çalışmayadabilir.
            System.out.println("Sayı 20ye eşittir");

        }else {
            System.out.println("Sayı 20 den küçük değil");
        }


    }
}