package dev.manas.learning.enums;

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
}
