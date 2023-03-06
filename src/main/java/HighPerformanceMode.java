public class HighPerformanceMode implements Performance{
    @Override
    public void startPerformanceMode() {
        System.out.println("High performance mode starts");
    }

    @Override
    public void stopPerformanceMode() {
        System.out.println("Oops! High performance mode stops");
    }
}
