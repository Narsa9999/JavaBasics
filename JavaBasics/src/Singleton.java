public class Singleton {
    /*
    Need one ststic variable of type same class so that it will store only one value across all instances
    Need private constructor to restrict creation of this outside the class
    need public static method for global access
     */

    //private static Singleton instance;//Lazy loading
    private static Singleton instance = new Singleton();//Early loading
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(instance);
        System.out.println(instance.hashCode());
        instance = null;
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.hashCode());
    }
}
