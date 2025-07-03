package BasicQuestions;

public class JavaVersion {
    public static void main(String[] args) {
        //Java Version
        System.out.println("\nJava Version : "+System.getProperty("java.version"));
        // Java Runtime Version
        System.out.println("Java Runtime Version : "+ System.getProperty("java.runtime.version"));
        // Java URL Version
        System.out.println("Java URL Version : "+System.getProperty("java.vendor.url"));
        // Java Vendor
        System.out.println("Java Vendor : "+System.getProperty("java.vendor"));
        // Java Home
        System.out.println("Java Home : "+System.getProperty("java.home"));
        // Java class path
        System.out.println("Java Class Path : "+System.getProperty("java.class.path"));
        System.out.println();
    }       
}
