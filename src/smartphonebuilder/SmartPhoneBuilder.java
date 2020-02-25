/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphonebuilder;

import Builder.PhoneBuilderInterface;
import Builder.SumsungBuilder;
import java.util.ArrayList;
import smartphonebuilder.Models.SumsungPhone;

/**
 *
 * @author Engah
 */
public class SmartPhoneBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list =  new ArrayList<>();
        list.add("snapdragon") ;
        list.add("gpu1") ;
        list.add("ram1") ;
        list.add("sensor1") ;
        list.add("case1") ;
        PhoneCreator creator =  new PhoneCreator() ;
        SumsungBuilder builder = new SumsungBuilder() ;
        SumsungPhone sumsungPhone = (SumsungPhone) creator.getPhoneInstance(builder,list) ;
        System.out.println(sumsungPhone.toString());
    }
    
}
