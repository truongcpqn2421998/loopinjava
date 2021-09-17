import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=-1;
        while(choice!=0){
            System.out.println("1: Vẽ hình chữ nhật");
            System.out.println("2: Vẽ hình tam giác vuông ");
            System.out.println("3: Vẽ hình tam giác cân");
            System.out.println("4: Exit");
            System.out.println("CHỌN HÌNH MUỐN IN:");
        choice=scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Vẽ Hình chữ nhật");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Vẽ hình tam giác góc vuông bên trái trên");
                for (int i = 6; i > 0; i--) {
                    for (int j = 6; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.print('\n');
                }
                System.out.println("Vẽ hình tam giác góc vuông bên trái dưới");
                for (int i = 6; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print('\n');
                }
                System.out.println("Vẽ hình tam giác góc vuông bên phải dưới");
                for (int i = 6; i > 0; i--) {
                    for (int j = 1; j <i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 6;k>=i ; k--) {
                        System.out.print("*");
                    }
                    System.out.print('\n');
                }
                System.out.println("Vẽ hình tam giác góc vuông bên phải trên");
                for (int i = 6; i > 0; i--) {
                    for (int k = 6; k >i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print('\n');
                }
                break;
            case 3:
                System.out.println("Vẽ hình tam giác cân");
                for (int i = 5; i > 0; i--) {
                    for (int j = 1; j <i ; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 5; k >=i; k--) {
                        System.out.print("* ");
                    }
                    System.out.print('\n');
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        }
    }
}
