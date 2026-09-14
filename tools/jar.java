package tools;

public class jar {
    public static void main() {
        System.out.println("dasf");

        Score score = new Score();
        System.out.println(score.marks);

    }
}

class Marks {
    protected int marks = 99;
}

class Score extends Marks {
    Marks marks = new Marks();

    public void scorePrint() {
        System.out.println(marks.marks);
    }
}
