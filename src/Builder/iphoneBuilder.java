/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import smartphonebuilder.Models.IphonePhone;
import smartphonebuilder.Models.SmartPhone;
import smartphonebuilder.Models.SumsungPhone;

/**
 *
 * @author Engah
 */
public class iphoneBuilder implements PhoneBuilderInterface {

    private IphonePhone ip;

    public iphoneBuilder() {
        ip = new IphonePhone();
    }

    @Override
    public void addCpu(String cpu) {
        this.ip.setCpu(cpu);
    }

    @Override
    public void addGpu(String gpu) {
        this.ip.setGpu(gpu);
    }

    @Override
    public void addRam(String ram) {
        this.ip.setRam(ram);
    }

    @Override
    public void addSensor(String sensor) {
        this.ip.setSensor(sensor);
    }

    @Override
    public void addCase(String casee) {
        this.ip.setCase(casee);
    }

    @Override
    public SmartPhone getPhone() {
        return ip;
    }
}
