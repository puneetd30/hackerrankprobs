import java.math.BigDecimal;
 
/**
 * Immutable.
 */
public final class CashBalance {
  
   private BigDecimal initialBalance, totCredits, totDebits;
  
   //construct
   public CashBalance(CashBalanceBuilder builder) {
      this.initialBalance = builder.initialBalance;
      this.totCredits = builder.totCredits;
      this.totDebits = builder.totDebits;
   }
  
   //inner builder class
   public static class CashBalanceBuilder {
   
      //has same fields as the object it is going to build
      private BigDecimal initialBalance, totCredits, totDebits;
 
      //define the setters that return itself
      CashBalanceBuilder setInitialBalance(BigDecimal initialBalance) {
          this.initialBalance = initialBalance;
          return this;
      }
 
      CashBalanceBuilder setTotCredits(BigDecimal totCredits) {
          this.totCredits = totCredits;
          return this;
      }
 
      CashBalanceBuilder setTotDebits(BigDecimal totDebits) {
          this.totDebits = totDebits;
          return this;
      } 
    }// end inner class
  
    //only getter methods and no setter methods as it is an immutable object
   
   public static void main(String[] args) {
	      CashBalance.CashBalanceBuilder builder = new CashBalance.CashBalanceBuilder()
	                                          .setInitialBalance(BigDecimal.valueOf(250.00))
	                                          .setTotCredits(BigDecimal.valueOf(250.00))
	                                          .setTotDebits(BigDecimal.valueOf(250.00));
	      CashBalance bal = new CashBalance(builder);
	      
	      System.out.println(bal.getInitialBalance());
	  }

public BigDecimal getInitialBalance() {
	return initialBalance;
}

public BigDecimal getTotCredits() {
	return totCredits;
}

public BigDecimal getTotDebits() {
	return totDebits;
}
	 
	 
 
} 