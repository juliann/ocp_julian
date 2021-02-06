package ch7;

public class Criminal {
    private boolean hostageReleased = false;
 
    public void releaseHostage(Police police) {
        while (!police.isMoneySent()) {
 
            System.out.println("Criminal: waiting police to give ransom");
 
        }
 
        System.out.println("Criminal: released hostage");
 
        this.hostageReleased = true;
    }
 
    public boolean isHostageReleased() {
        return this.hostageReleased;
    }
}