public class InstanceInitializer {
    public InstanceInitializer(){
        System.out.println("In parent class");
    }
}
class B extends InstanceInitializer{
    static final int a;
    public B(){
        //a=100;
        System.out.println("In child class " + a);
    }

    static {
        a =1000;
        System.out.println("In Special block");
    }

    /*{
        a =2000;
        System.out.println("In Special block 2");
    }*/

    public static void main(String[] args) {
        B test = new B();
    }
}
