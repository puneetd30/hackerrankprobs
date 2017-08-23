class LongestPassword {
    public int solution(String S) {
        String[] splitString=S.split(" ");
        int max=-1;
        for(String value: splitString){
            value=value.toUpperCase();
            
            char[] valueCharArr=value.toCharArray();
            int letters=0;
            int digits=0;
            int spl=0;
            for(int i=0;i<valueCharArr.length;i++){
                    boolean isUpper=isUpperCase(valueCharArr[i]);
                    if(isUpper){
                        
                        letters++ ;   
                    }
                    
                    boolean isNumber= isDigit(valueCharArr[i]);
                    if(isNumber){
                        digits++;    
                    }
                    
                   if(!isUpper && !isNumber){
                        spl++;
                    }
            
            }
            
            if( letters%2==0 && digits%2!=0 && spl==0){
                if(max<valueCharArr.length){
                  max=valueCharArr.length;  
                }
                
            }
            
        }
        
        return max;
    }
    
    public static boolean isUpperCase(char s) {
		if (s >= 65 && s <= 90) {
			return true;
		}
		return false;
	}
	

	public static boolean isDigit(char s) {
		if (s >= 48 && s <= 57) {
			return true;
		}
		return false;
	}
}