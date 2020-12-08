package ocp8.ch02.designPattern.singleton;

// Instantiation using a static block
public class StaffRegister {

    private static final StaffRegister INSTANCE;

    static {
        INSTANCE = new StaffRegister();
        // Perform additional steps
        System.out.println("Singleton Object Created");
    }

    private StaffRegister() {
    }

    public static StaffRegister getINSTANCE() {

        return INSTANCE;
    }
// Data access methods
}
