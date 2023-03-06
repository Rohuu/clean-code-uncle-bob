public class BalancedPerformanceMode implements Performance{
    @Override
    public void startPerformanceMode() {
        System.out.println("Balanced mode starts");
    }

    @Override
    public void stopPerformanceMode() {
        System.out.println("Balanced mode stops");
    }
}
