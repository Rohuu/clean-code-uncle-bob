public class Computer {
    private Performance performance;
    private Sound sound;
    private OperatingSystem operatingSystem;

    public Computer(Performance performance, Sound sound, OperatingSystem operatingSystem) {
        this.performance = performance;
        this.sound = sound;
        this.operatingSystem = operatingSystem;
    }

    public void upgradeOS(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void upgradeSound(Sound sound) {
        this.sound = sound;
    }

    public void upgradePerformance(Performance performance) {
        this.performance = performance;
    }

    public void startPerforming(){
        performance.startPerformanceMode();
    }
    public void stopPerforming(){
        performance.stopPerformanceMode();
    }
    public void startSound(){
        sound.startSoundMode();
    }
    public void stopSound(){
        sound.stopSoundMode();
    }
    public void startOS(){
        operatingSystem.startOperatingSystem();
    }
    public void stopOS(){
        operatingSystem.stopOperatingSystem();
    }
}
