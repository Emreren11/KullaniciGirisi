import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        String userName,password,newPass,validPass="java101";
         while (true) // sonsuz döngü anlamına gelir. Bunu da şifre değiştirildikten sonra veya tekrar giriş yapılması için kullandım
         {
             System.out.print("Kullanıcı Adı: ");
             userName=inp.nextLine();

             System.out.print("Şifre: ");
             password=inp.nextLine();

             if (userName.equals("patika"))
             {
                 if (password.equals(validPass))
                 {
                     System.out.println("Giriş yapıldı!");
                     break; // sonsuz döngüyü durdurmak için kullanılır
                 }
                 else
                 {
                     System.out.print("Şifreniz yanlış. Şifre sıfırlamak ister misiniz? (1-Evet || 2-Hayır) ");
                     int choice= inp.nextInt();

                     switch(choice)
                     {
                         case 1:
                             System.out.print("Yeni şifrenizi giriniz: ");
                             newPass=inp.nextLine();
                             do // önce işlemi yapıp ardından yeni şifre kontrolu yapar. Eğer aynıysa işlemi tekrarlar
                             {
                                 System.out.print("Şifre oluşturulamadı. Lütfen başka şifre giriniz: ");
                                 newPass=inp.nextLine();
                             }while(newPass.equals(validPass));
                             validPass=newPass;
                             System.out.println("Şifre oluşturuldu");
                             break;

                         case 2:
                             break;

                         default:
                             System.out.println("Hatalı giriş yaptınız..!!");
                             break;
                     }
                 }
             }
             else
                 System.out.println("Kullanıcı adı hatalı.!!\n");

             System.out.println("\nTekrar giriş yapınız!");
         }
    }
}