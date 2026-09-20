
/** Conditions, switch, ternary expressions, and the four loop shapes. */
public final class ControlFlowDemo {
    private ControlFlowDemo() {
    }

    public static void main(String[] args) {
        int score = 76;
        String result = score >= 50 ? "pass" : "fail";
        System.out.println("result: " + result);

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            default:
                System.out.println("keep practising");
        }

        int whileCount = 1;
        while (whileCount <= 2) {
            System.out.println("while: " + whileCount);
            whileCount++;
        }

        int doWhileCount = 3;
        do {
            System.out.println("do-while runs once: " + doWhileCount);
        } while (doWhileCount < 3);

        for (int index = 0; index < 2; index++) {
            System.out.println("for: " + index);
        }
    }
}
