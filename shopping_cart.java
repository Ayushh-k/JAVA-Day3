import java.util.Scanner;
public class shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        double discount = 0.0;
        double finalAmt = 0.0;
        if(amount>5000){
            discount = amount*0.2;
            finalAmt = amount-discount;
        }else if(amount>3000&&amount<=5000){
            discount = amount*0.1;
            finalAmt = amount-discount;
        }else{
            finalAmt = amount-discount;
        }

        System.out.println("Discount: ₹"+discount+"\nFinal Amount: ₹"+finalAmt);
    }
}
