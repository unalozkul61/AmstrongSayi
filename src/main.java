import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int number = input.nextInt();
        int basNumber =0 ;  // Basamak Sayımız
        int tempNumber = number;  // Sayımızı geçici olarak tempnumber a atıyoruz .
        int basValue ;
        int  basPow;
        int result = 0 ;

        while (tempNumber !=0) {
            tempNumber /=10;
            basNumber ++ ;
        }
        tempNumber = number ;
         while (tempNumber !=0) {
             basValue = tempNumber %10;
             basPow = 1 ;

             for (int i = 1 ; i <= basNumber ; i ++ ) {
                 basPow *=basValue;
             }
             result += basPow;
             tempNumber /=10;
         }
        System.out.println(result);

    }
}
