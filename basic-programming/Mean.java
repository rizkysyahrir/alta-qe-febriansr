public class Mean {
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }

    private static float Mean(float[] numbers){
        float totalBil = 0;
        for (float number: numbers) {
            totalBil = totalBil + number;
        }
        float result = totalBil/numbers.length;
        return result;

    }
}
