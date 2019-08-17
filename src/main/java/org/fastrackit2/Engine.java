package org.fastrackit2;

public class Engine {
    int ccm;
    int cp;
    int torque;
    String fuel;
    public Engine(int ccm,int cp, int torque){
        this.ccm=ccm;
        this.cp=cp;
        this.torque=torque;
    }
    public Engine (int ccm, int cp){
        this.ccm=ccm;
        this.cp=cp;
    }
}
