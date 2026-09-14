package dev.manas.learning.statics;

/** Static initialization and class-versus-instance fields. */
public final class StaticMembersDemo {
    private StaticMembersDemo() {
    }

    public static void main(String[] args) {
        PopulationCounter first = new PopulationCounter();
        PopulationCounter second = new PopulationCounter();

        System.out.println("first instance: " + first.getInstanceNumber());
        System.out.println("second instance: " + second.getInstanceNumber());
        System.out.println("shared count: " + PopulationCounter.getCreatedCount());
    }
}
