package alex.leaernprogramming;


    public class DeluxeHamburger extends BaseBurger {
        public DeluxeHamburger() {
            super("Deluxe", "Sausage & Bacon", 14.54, "White");
            super.addHamburgerAddition1();
            super.addHamburgerAddition2("Drink", 1.81);
        }

        @Override
        public void addHamburgerAddition1() {
            super.addHamburgerAddition1();
        }

        @Override
        public void addHamburgerAddition2(String name, double price) {
            super.addHamburgerAddition2(name, price);
        }

        @Override
        public void addHamburgerAddition3(String name, double price) {
            super.addHamburgerAddition3(name, price);
        }

        @Override
        public void addHamburgerAddition4(String name, double price) {
            super.addHamburgerAddition4(name, price);
        }
    }
