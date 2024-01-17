

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
  	for(int i = 2; i < e.length() - 10; i++)
  	{
    		if(isPrime(Double.parseDouble(e.substring(i, 10 + i))) == true)
    		{
      			System.out.println(Double.parseDouble(e.substring(i, 10 + i)));
    		}
  	}
	System.out.println("Replace this string with your answer!");
	}
	

	//Finish this function
	public static boolean isPrime(double d){
        {
		if(d < 2)
		{
   			return false;
  		}
  		for(int i = 2; i <= (int)Math.sqrt(d); i++)
  		{
    			if(d % i == 0)
    			{
      				return false;
    			}
  		}
  		return true;    
	}
}

}

