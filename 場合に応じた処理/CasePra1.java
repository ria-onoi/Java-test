public class CasePra1 {
    public static void main(String[] args) {
        System.out.println("整数値(1~10)を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        
        if(num<5){
            System.out.println("5未満の整数" + num +"が入力されました");
        } else if(num==5){
            System.out.println("5が入力されました");
        } else {
            System.out.println("6以上の整数" + num +"が入力されました");
        }
      }
}
