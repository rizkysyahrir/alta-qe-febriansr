public class DrawXYZ {
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
    private static void DrawXYZ(int huruf){
        int bil = 0;
        for(int a=0; a<huruf; a++){
            for(int b=0; b<huruf; b++){
                bil++;
                if(bil%3==0){
                    System.out.print("X");
                } else if(bil%2!=0){
                    System.out.print("Y");
                } else if(bil%2==0){
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
