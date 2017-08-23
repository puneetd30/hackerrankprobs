import java.math.BigDecimal;

public class Iteration {
 
    public int countA(String input) {
        if (input == null || input.length( ) == 0) {
            return 0;
        }
 
        int count = 0;
        for (int i = 0; i < input.length( ); i++) {
            if(input.substring(i, i+1).equals("A")){
                count++;
            }
        }
        
        Double value1 = Double.valueOf("0.1"); //String to Double
        Double value2 = Double.valueOf("0.2"); //String to Double
        Double value3 = Double.valueOf("0.3"); //String to Double
        System.out.println("result = " + (value1 + value2 - value3)); 
        BigDecimal value11 = new BigDecimal("0.1"); //String to BigDecimal
        BigDecimal value21 = new BigDecimal("0.2"); //String to BigDecimal
        BigDecimal value31 = new BigDecimal("0.3"); //String to BigDecimal
        System.out.println("result = " + (value11.add(value21).subtract(value31)));
        return count;
    }
 
    public static void main(String[ ] args) {
          System.out.println(new Iteration( ).countA("AAA ratingA"));     // Ans.3
    }
} 
 
