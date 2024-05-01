class Overload {
    //メンバ変数
    int num;
    String str;
    
    //メソッド
    void sameName(){
        System.out.println("引数をもたないsameNameメソッドです");
    }
    
    void sameName(int num){
        System.out.println("int型の引数を1つもつsameNameメソッド。引数：" + num);
    }
    
    void sameName(int num1, int num2){
        System.out.println("int型の引数を2つもつsameNameメソッド。引数：" + num1+ "," + num2);
    }
    
    void sameName(String str1){
        System.out.println("String型の引数を1つもつsameNameメソッド。引数：" + str1);
    }
    
    void sameName(String str1, String str2){
        System.out.println("String型の引数を2つもつsameNameメソッド。引数：" + str1+ "," + str2);
    }
    
}