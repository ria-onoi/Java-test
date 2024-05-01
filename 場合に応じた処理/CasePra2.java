public class CasePra2 {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();

        switch(num){
            case 1:
            System.out.println("もっとがんばりましょう");
            break;

            case 2:
            System.out.println("もう少しがんばりましょう");
            break;

            case 3:
            System.out.println("さらに上を目指しましょう");
            break;

            case 4:
            System.out.println("大変よくできました");
            break;

            case 5:
            System.out.println("大変優秀です");
            break;

            default:
            System.out.println("あきらめたらそこで試合終了ですよ");
        }
    }
}
