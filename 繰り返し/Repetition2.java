public class Repetition2 {
    public static void main(String[] args) {
        System.out.println("1~100の整数を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        int i=1;
          
        while(num%7 !=0){
            System.out.println("1~100の整数を入力してください");
            num = new java.util.Scanner(System.in).nextInt();
            i++;
        }
        
        System.out.println("処理を終了しました");
      }
}
