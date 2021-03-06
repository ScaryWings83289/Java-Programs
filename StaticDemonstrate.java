// Write a program to show creation and usage of static / non-static function. 
public class StaticDemonstrate {
    public static void staticFunction() {
        System.out.println("Static function called!");
    }
    public void nonStaticFunction() {
        System.out.println("Non-static function called!");
    }
    public static void main(String[] args) {
        System.out.println("Calling static function from main");
        staticFunction();
        
        System.out.println("----------------------");
        System.out.println("\nCalling non-static function from main");
        StaticDemonstrate staticDemonstrate = new StaticDemonstrate();
        staticDemonstrate.nonStaticFunction();
    }
}
