/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import smartphonebuilder.Models.HTCPhone;
import smartphonebuilder.Models.SmartPhone;
import smartphonebuilder.Models.SumsungPhone;

/**
 *
 * @author Engah
 */
public class HTCPBuilder implements PhoneBuilderInterface {

    private HTCPhone htcpb;

    public HTCPBuilder() {
        htcpb = new HTCPhone();
    }

    @Override
    public void addCpu(String cpu) {
        this.htcpb.setCpu(cpu);
    }

    @Override
    public void addGpu(String gpu) {
        this.htcpb.setGpu(gpu);
    }

    @Override
    public void addRam(String ram) {
        this.htcpb.setRam(ram);
    }

    @Override
    public void addSensor(String sensor) {
        this.htcpb.setSensor(sensor);
    }

    @Override
    public void addCase(String casee) {
        this.htcpb.setCase(casee);
    }

    @Override
    public SmartPhone getPhone() {
        return htcpb;
    }
}
