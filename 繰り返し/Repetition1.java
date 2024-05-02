public class Repetition1 {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int sum=0;
        
        for(int i=1; i< num+1 ; i++){
            sum= sum+i;
        }
        
        System.out.println("1から"+ num +"の和は" +sum+ "です");
      }
}
