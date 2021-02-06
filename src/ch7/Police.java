package ch7;

public class Police {
    private boolean moneySent = false;
 
    public void giveRansom(Criminal criminal) {
 
        while (!criminal.isHostageReleased()) {
 
            System.out.println("Police: waiting criminal to release hostage");
 
        }
 
        System.out.println("Police: sent money");
 
        this.moneySent = true;
    }
 
    public boolean isMoneySent() {
        return this.moneySent;
    }
 
}