public class MainProblem2 {
        public static void main(String[] args) {
            System.out.println("coba edit 2");
            System.out.println(palindrome("civic"));
            System.out.println(palindrome("katak"));
            System.out.println(palindrome("kasur rusak"));
            System.out.println(palindrome("kupu-kupu"));
            System.out.println(palindrome("lion"));
        }
        private static boolean palindrome(String value){
            char[] array = value.toCharArray();
    
            int a = 0;
            int b = array.length - 1;
    
            while (b > a) {
    
                if (array[a] != array[b]) {
                    return false;
                }
                ++a;
                --b;
            }
                return true ;
        }
    
}
