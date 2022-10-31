public class Main {
    public static void main(String[] args) { //Switch blokları if bloklarına göre daha az kullanılıyor.

        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Harika, geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel, geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi, geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena değil, geçtiniz.");
                break;
            case 'F':
                System.out.println("Bütünleme sınavına girmeye hak kazandınız.");
                break;
            default: //switch-case sisteminde default şu işe yarar: tanımlanmış notlar harici bir not girildiğinde sistem geçersiz not girişi yazacak demektir.
                System.out.println("Geçersiz not girişi");
        }


    }
}