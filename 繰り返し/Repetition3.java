public class Repetition3 {
    public static void main(String[] args) {
        System.out.println("チーム24のメンバーを紹介します");
        
        String[] ArrayList={"青木希海", "尾ノ井理愛", "佐々木菜穂", "中島帆乃香", "長岡輝貴"};
        for(String Team24: ArrayList){
            System.out.println(Team24);
        }
        System.out.println("以上"+ArrayList.length + "名。よろしくお願い致します。");
    }
}
