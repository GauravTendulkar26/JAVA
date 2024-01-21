class variable{
    static int a = 10 ; // static 
    int b = 20 ; // instance 
    public static void main(String arr[]){
        int c = 30 ; // local
        variable obj = new variable();
        System.out.println(variable.a);
        System.out.println(obj.b);
        System.out.println(c);
    }
}