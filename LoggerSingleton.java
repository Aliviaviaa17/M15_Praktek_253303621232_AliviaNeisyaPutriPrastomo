public class LoggerSingleton {

    private static LoggerSingleton instance;

    // Private Constructor
    private LoggerSingleton() {
    }

    // Method getInstance()
    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    // Method catat
    public void catat(String event) {
        System.out.println("LOG SERVER: " + event);
    }
}