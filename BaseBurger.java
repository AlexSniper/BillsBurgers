package alex.leaernprogramming;

public class BaseBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public BaseBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1() {
        this.addition1Name = "carrot";
        this.addition1Price = .12;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = "tomato";
        this.addition2Price = .2;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = "Lettuce";
        this.addition3Price = .28;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = "Cheese";
        this.addition4Price = .41;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);
        if(this.addition1Name != null) {//Esli dopolnitelnie product dobavlen to budet  ukazivatsja chena
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {//If addition2Name is chosen that will add price to price of hamburger
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }















}
