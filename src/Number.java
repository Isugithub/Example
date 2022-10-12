public class Number {
    static void number(int a) {
        System.out.println(a);
    }
    static void word(int b,String c){
        System.out.println(b+" and "+c);
    }
    static void all(String d){
        System.out.println(d);
    }
    static void point(double e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        Number numbers = new Number();
        number(12345);
        word(123,"abc");
        all("54 abcd");
        point(3.89);
    }
}
