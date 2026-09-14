package dev.manas.learning.statics;

/** Contrasts one shared class field with per-object instance state. */
public final class PopulationCounter {
    private static int createdCount;

    private final int instanceNumber;

    static {
        System.out.println("PopulationCounter class initialized");
    }

    public PopulationCounter() {
        createdCount++;
        instanceNumber = createdCount;
    }

    public static int getCreatedCount() {
        return createdCount;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
