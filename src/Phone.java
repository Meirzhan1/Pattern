public class Phone {
    private String model;
    private String os;
    private int year;
    private double screensize;
    private String color;
    private int storage;

    private Phone(Builder builder) {
        this.model = builder.model;
        this.os = builder.os;
        this.year = builder.year;
        this.screensize = builder.screensize;
        this.color=builder.color;
        this.storage=builder.storage;
    }


    public static class Builder {
        private String model;
        private String os;
        private int year;
        private double screensize;
        private String color;
        private int storage;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder screensize(double screensize) {
            this.screensize = screensize;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }

    public static class Director {
        public Phone constructBudgetPhone(Builder builder) {
            return builder.model("X Pro")
                    .os("IOS")
                    .year(2020)
                    .screensize(6)
                    .color("Black")
                    .storage(64)
                    .build();

        }
        public Phone constructGamingPhone(Builder builder) {
            return builder.model("Samsung")
                    .os("Android")
                    .year(2023)
                    .screensize(6.7)
                    .color("Blue")
                    .storage(1028)
                    .build();
        }

        public Phone constructFoldablePhone(Builder builder) {
            return builder.model("Flip")
                    .os("Android")
                    .year(2024)
                    .screensize(6.8)
                    .color("White")
                    .storage(128)
                    .build();
        }
    }

    @Override
    public String toString() {
        return "Phone {" + model + "," + os + "," + year + "," + screensize + "," + color + "," + storage + "}";
    }
}