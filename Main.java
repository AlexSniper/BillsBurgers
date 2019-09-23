package alex.leaernprogramming;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//	BaseBurger baseBurger= new BaseBurger("Basic","Kotlet",3.45,"White bred");
//        System.out.println(baseBurger.itemizeHamburger());
//        baseBurger.addHamburgerAddition4("Cheese",6);
//        baseBurger.addHamburgerAddition1();
//        baseBurger.addHamburgerAddition2(";",233);
//       baseBurger.addHamburgerAddition3("v",2);
       HealthyBurger hb=new HealthyBurger("s",4);
       hb.itemizeHamburger();
       hb.addHealthAddition2();
       hb.addHealthAddition1("Healthy Burger",6);
       //hb.addHamburgerAddition1();
        System.out.println(hb.itemizeHamburger());


//        System.out.println((baseBurger.itemizeHamburger()));


    }
}

