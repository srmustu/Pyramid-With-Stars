import java.util.Scanner;
public class PyramidWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String m1,m2,m3,star = "*";
        int base;

        m1 = "How many layers of pyramid do you want to create : ";

        System.out.print(m1);
        base = inp.nextInt();

        for (int i = 1; i <= base; i++){

            for (int g =1; g <= (base - i); g++){
                System.out.print(" ");
            }

            for (int y = 1; y <= ((2 * i) - 1); y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
