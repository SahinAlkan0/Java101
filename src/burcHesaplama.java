import java.util.Scanner;
//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart
public class burcHesaplama {
    public static void main(String[]args){
        int month,day;
        String burc = "";
        boolean isEror = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }

                } else {
                    isEror = true;
                }
                break;

            case 2:
                if ((day >= 1) && (day <= 28)) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isEror = true;
                }
                break;

            case 3:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 21) {
                        burc = "Balık";

                    } else {
                        burc = "Koç";
                    }

                } else {
                    isEror = true;
                }
                break;

            case 4:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 5:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 6:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yenceç";
                    }

                } else {
                    isEror = true;
                }
                break;
            case 7:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 8:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 9:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 10:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 11:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 12:
                if((day>=1)&&(day<=31)){
                    if(day<22){
                        burc="Yay";
                    }else{
                        burc="Oğlak";
                    }
                }else {
                    isEror=true;
                }break;


                }
if(isEror){
    System.out.print("Haltalı Giriş Yaptınız . Tekrar Deneyin");

}else {
    System.out.print("Burcunuz : "+burc);
}


        }

























    }

