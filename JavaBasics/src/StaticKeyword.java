public class StaticKeyword {
    private static int count;
    private int test = 12;

    static {// this block executes at the time of loading the class.
        //Used to initialize static data member
        count = 100;
    }

    public int incrementCount(){
        return count++;
    }

    static void resetCounter(){
        count = 0;
    }

    public static void main(String[] args) {
        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.incrementCount();
        staticKeyword.incrementCount();
        StaticKeyword staticKeyword2 = new StaticKeyword();
        staticKeyword2.incrementCount();
        System.out.println(staticKeyword.count);
        System.out.println(staticKeyword2.count);
        staticKeyword2.resetCounter();
        staticKeyword2.incrementCount();
        System.out.println(staticKeyword.count);
        StaticKeyword.resetCounter();
        System.out.println(staticKeyword2.count);

    }
}
