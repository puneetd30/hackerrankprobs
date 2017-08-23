public class SumNumbers {
 
    public static void main(String[] args) throws InterruptedException{
        Integer sum = 0;
        for (int i = 1000; i < 500000; i++) {
            sum += i;
            Thread.sleep(100);
        }
    }
} 