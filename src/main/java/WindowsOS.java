public class WindowsOS implements OperatingSystem{
    @Override
    public void startOperatingSystem() {
        System.out.println("Starting window");
    }

    @Override
    public void stopOperatingSystem() {
        System.out.println("Shutting down window");
    }
}

