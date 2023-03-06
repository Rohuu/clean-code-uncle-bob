public class ChromeOS implements OperatingSystem{
    @Override
    public void startOperatingSystem() {
        System.out.println("You are using chrome OS");
    }

    @Override
    public void stopOperatingSystem() {
        System.out.println("Chrome OS stops");
    }
}
