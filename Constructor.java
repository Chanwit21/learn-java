public class Constructor {
    int a;

    public Constructor(){
        a = 1;
    }
    public static void main(String[] args) {
        Constructor x = new Constructor();
        System.out.println(x.a);
    }
}
