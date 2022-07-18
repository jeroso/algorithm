package DesignPattern.State;

public class Laptop {
    public static String ON = "on";
    public static String OFF = "off";
    private String powerStatus = "";

    public Laptop() {
        setPowerStatus(Laptop.OFF);
    }

    public void setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
    }

    public void powerPush() {
        if ("on".equals(this.powerStatus)) {
            System.out.println("전원 OFF");
        }else{
            System.out.println("전원 ON");
        }
    }
}
