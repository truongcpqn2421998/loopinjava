import java.util.Scanner;

public class writePrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of prime you want to write: ");
        int number=scanner.nextInt();
        int total=0;
        int count=1;
        while(total<number){
            if(checkPrime(count)){
                System.out.println(count);
                total++;
            }
            count++;
        }
    }
    public static boolean checkPrime(int a) {
        if (a<2){
            return false;
        }else {
            int i=2;
            while(i<=Math.sqrt(a)){
                if(a%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
