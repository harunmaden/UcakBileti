import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        int mesafe,mesafed = 0, yas,yasd = 0, gidisDonus, yolculukTipi, yolculukTipid = 0,hataliGirisVar = 0;
        double normalTutar, yasIndirimOrani, yasIndirimi, toplam;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz :");
        mesafe = inp.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz :");
        yolculukTipi = inp.nextInt();

        //Hatalı Giriş Tanımlaması
        if (mesafe >0 && mesafe < 100000) {
                 mesafed = mesafe;


                    }else {
                            hataliGirisVar = 1;
                               }
        if (yas >0 && yas < 150){
                 yasd = yas;
                    } else{
                     hataliGirisVar = 1;
                        }
        if (yolculukTipi == 1 || yolculukTipi == 2){
                     yolculukTipid = yolculukTipi;
                        } else {
                          hataliGirisVar =1;
                                }
             if (hataliGirisVar == 1){
                     System.out.println("hatalı giris yaptınız");
                    } else{

                                // Hatalı giriş yapılmadı ise Kod başlangıcı
                             if (yasd < 12){
                                     yasIndirimOrani = 0.5;
                                } else if (yasd < 25) {
                                    yasIndirimOrani = 0.1;
                                } else if (yasd > 64) {
                                      yasIndirimOrani = 0.2;
                                 } else {
                                          yasIndirimOrani = 0;
                             }

                                 normalTutar = mesafed / 10;

                                yasIndirimi = normalTutar * yasIndirimOrani;
                                toplam = normalTutar - yasIndirimi;


                             if (yolculukTipi == 1){

                                   } else {
                                     toplam = (toplam * 2) * 0.2;
                             }
    System.out.println("Toplam Tutar" + toplam);



}
    }







}
