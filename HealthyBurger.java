package alex.leaernprogramming;


    public class HealthyBurger extends BaseBurger {

        private String healthyExtra1Name;
        private double healthyExtra1Price;

        private String healthyExtra2Name;
        private double healthyExtra2Price;

        public HealthyBurger(String meat, double price) {
            super("Healthy", meat, price, "Brown rye");
        }

        public void addHealthAddition1(String name, double price) {
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
        }

        public void addHealthAddition2() {
            this.healthyExtra2Name = "Lentis";
            this.healthyExtra2Price = 2.5;
        }

        @Override
        public double itemizeHamburger() {
            double hamburgerPrice = super.itemizeHamburger();
            if(this.healthyExtra1Name != null) {
                hamburgerPrice += this.healthyExtra1Price;
                System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
            }
            if(this.healthyExtra2Name != null) {
                hamburgerPrice += this.healthyExtra2Price;
                System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
            }

            return hamburgerPrice;
        }
    }


