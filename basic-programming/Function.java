public class Function {

    public static void main(String[] args) {

        System.out.println(primaBil(11));
        System.out.println(primaBil(13));
        System.out.println(primaBil(17));
        System.out.println(primaBil(20));
    }

    private static boolean primaBil (int number){

        boolean bilangan = false;
        for(int i=2; i<=number; i++){
            if(number % i == 0 & i!=number){
                return true;
            }
        }
            return bilangan;
        }
}