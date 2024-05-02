public class Hairetsu2 {
    public static void main(String[] args) {
        int[][] seiseki = {{20,50,60}, {30,60,70}, {45,60,80}, {35,40,50}};
        
        for(int i=0 ; i<seiseki.length; i++){
            for(int k=0; k<seiseki[i].length; k++){
            System.out.println("社員"+ (i+1) + "の" + (k+1)+ "回目の点数は"+ seiseki[i][k] +"です");
            }
        }
      }
}
