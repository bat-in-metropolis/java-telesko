package dev.manas.learning.functional;

/** A lambda target: exactly one abstract method. */
@FunctionalInterface
public interface Operation {
    int apply(int left, int right);
}
