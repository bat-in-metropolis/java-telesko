package dev.manas.learning;

import dev.manas.learning.abstraction.AbstractionDemo;
import dev.manas.learning.annotations.AnnotationDemo;
import dev.manas.learning.arrays.ArraysDemo;
import dev.manas.learning.basics.ControlFlowDemo;
import dev.manas.learning.basics.HelloWorld;
import dev.manas.learning.basics.MethodsDemo;
import dev.manas.learning.basics.TypesAndCastingDemo;
import dev.manas.learning.enums.EnumDemo;
import dev.manas.learning.functional.LambdaDemo;
import dev.manas.learning.inheritance.CalculatorDemo;
import dev.manas.learning.nested.InnerClassDemo;
import dev.manas.learning.oop.OopDemo;
import dev.manas.learning.polymorphism.PolymorphismDemo;
import dev.manas.learning.statics.StaticMembersDemo;
import dev.manas.learning.strings.StringsDemo;

/** Runs every example covered by the 09:00:00 checkpoint. */
public final class AllDemos {
    private AllDemos() {
    }

    public static void main(String[] args) {
        run("Hello world", () -> HelloWorld.main(args));
        run("Types and casting", () -> TypesAndCastingDemo.main(args));
        run("Control flow", () -> ControlFlowDemo.main(args));
        run("Methods and overloading", () -> MethodsDemo.main(args));
        run("Arrays", () -> ArraysDemo.main(args));
        run("Strings", () -> StringsDemo.main(args));
        run("Objects and encapsulation", () -> OopDemo.main(args));
        run("Static members", () -> StaticMembersDemo.main(args));
        run("Inheritance", () -> CalculatorDemo.main(args));
        run("Polymorphism", () -> PolymorphismDemo.main(args));
        run("Abstract classes", () -> AbstractionDemo.main(args));
        run("Inner classes", () -> InnerClassDemo.main(args));
        run("Enums", () -> EnumDemo.main(args));
        run("Annotations", () -> AnnotationDemo.main(args));
        run("Functional interfaces and lambdas", () -> LambdaDemo.main(args));
    }

    private static void run(String title, Runnable demo) {
        System.out.println("\n=== " + title + " ===");
        demo.run();
    }
}
