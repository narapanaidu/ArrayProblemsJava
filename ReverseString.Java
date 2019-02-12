class Main{
  public static void main(String[] args){
    
    //calling and printing result from ReverseStringone
    String resultone = ReverseStringone("hello");
    System.out.println(resultone);
    
    //calling and printing result from ReverseStringtwo
    String resulttwo = ReverseStringtwo("hello");
    System.out.println(resulttwo);
  }

  //Method to reverse a string 
  //Time Complexity - O(n)
  
  private static String ReverseStringone(String NormalString)
  {
    char[] NormalArray = NormalString.toCharArray();
    char[] ReversedArray = new char[NormalArray.length];
    for(int i =NormalArray.length-1; i>=0; i--){
      ReversedArray[ReversedArray.length-i-1] = NormalArray[i];
    }
    return new String(ReversedArray);//this will converted the character array to string
  }

  //Method to reverse a string in more readabale format in Java
  //Time Complexity - O(n)
  
  private static String ReverseStringtwo(String NormalString)
  {
    return new StringBuffer(NormalString).reverse().toString();
  }
}
