    public static void plusMinus(List<Integer> arr) {
    // Write your code here
     //Scanner scan = new Scanner(System.in);
      //int n = scan.nextInt();
      //System.out.println(n);
      int count=0,i = 0;
      float zero_count=0;
      float positive_count = 0;
      float a=0,negative_count=0;
      float len = arr.size();
      for(i=0;i<len;i++){
          if(arr.get(i)==0)
          {
              
              zero_count++;
          }
          else if(arr.get(i)>0){
             
              positive_count++;
          }
          else if(arr.get(i)<0){
              
              negative_count++;
          }
      }
        {
           a = positive_count/len;
           System.out.printf("%.6f",a);
           }
           {
           a = negative_count/len;
           System.out.printf("\n%.6f",a);
           }
           {
           a = zero_count/len;
           System.out.printf("\n%.6f",a);
           
           }      

    }

}
