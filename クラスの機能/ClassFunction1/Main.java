public class Main {
    public static void main(String[] args) {
        Overload o1= new Overload();
        
        o1.sameName();
        o1.sameName(0);
        o1.sameName(0,1);
        o1.sameName("str1");
        o1.sameName("str2");
      }
}
