
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

    // static state is shared by every instance of this class.
    private static final class PopulationCounter {
        private static int createdCount;

        private final int instanceNumber;

        static {
            System.out.println("PopulationCounter class initialized");
        }

        private PopulationCounter() {
            createdCount++;
            instanceNumber = createdCount;
        }

        private static int getCreatedCount() {
            return createdCount;
        }

        private int getInstanceNumber() {
            return instanceNumber;
        }
    }
}
