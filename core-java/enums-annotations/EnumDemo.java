
/** Type-safe fixed values and enum-based branching. */
public final class EnumDemo {
    private EnumDemo() {
    }

    public static void main(String[] args) {
        Status status = Status.RUNNING;
        switch (status) {
            case RUNNING:
                System.out.println("all good");
                break;
            case FAILED:
                System.out.println("try again");
                break;
            case PENDING:
                System.out.println("please wait");
                break;
            default:
                System.out.println("done");
        }

        for (LaptopModel model : LaptopModel.values()) {
            System.out.println(model + ": $" + model.getPriceInDollars());
        }
    }

    private enum Status {
        PENDING,
        RUNNING,
        SUCCESS,
        FAILED
    }

    // Enum constants are objects, so an enum can contain fields and methods.
    private enum LaptopModel {
        MACBOOK(2200),
        XPS(2400),
        SURFACE(1500),
        THINKPAD(1200);

        private final int priceInDollars;

        LaptopModel(int priceInDollars) {
            this.priceInDollars = priceInDollars;
        }

        private int getPriceInDollars() {
            return priceInDollars;
        }
    }
}
