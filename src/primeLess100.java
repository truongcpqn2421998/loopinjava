public class primeLess100 {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            if(checkPrime(i)==true){
                System.out.println(i);
            }
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
