public class MainOfComputer {
    public static void main(String[] args) {
        Computer dell=new Computer(new BalancedPerformanceMode(),new DTS(),new LinuxOS());
        dell.startOS();
        dell.startPerforming();
        dell.startSound();
        dell.upgradeOS(new WindowsOS());
        dell.startOS();
        dell.stopOS();
        dell.stopPerforming();
        dell.stopSound();

        Computer hp=new Computer(new HighPerformanceMode(),new Dolby(),new WindowsOS());
        hp.startOS();
        hp.startPerforming();
        hp.startSound();
        hp.stopSound();
        hp.stopPerforming();
        hp.stopOS();
    }
}
