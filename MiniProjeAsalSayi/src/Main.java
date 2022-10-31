public class Main {
    public static void main(String[] args) {

        int number = 5;
        int remaninder = number % 2;   //remainder operatörü number'ın 2 ye bölümünden kalan kaçtırın cevabını verir.
        System.out.println(remaninder);


        //Asal sayı mı Değil mi?
        boolean isPrime = true;
        if(number==1){
            System.out.println("1 asal sayı değildir.");
            return;
        }

        for(int i=2; i<number; i++){
            if(number % i == 0){
                isPrime=false;
            }
        } if(isPrime){
            System.out.println("Sayı asaldır");
        } else{
            System.out.println("Sayı Asal Değildir");
        }



    }
}