package Laborator13;

import java.util.*;

/**
 * Created by mihai
 */

public class ListUtil {
    public static <A, B> A foldl(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        return null;
    }

    public static <A> void reverse(List<A> xs) {
        //Hint: Folositi iteratori
    }

    public static <A, B> A foldr(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        //Hint: reverse + foldl
    }

    public static <A, B> List<B> map(Function<A, B> function, List<A> xs) {
        return null;
    }

    public static <A> List<A> filter(Function<A, Boolean> function, List<A> xs) {
        return null;
    }

    public static <A> A reduce(Function<A, Function<A, A>> function, List<A> xs) {
        return null;
    }

    public static <A> boolean all(Function<A, Boolean> function, List<A> xs) {
        return true;
    }

    public static <A> boolean any(Function<A, Boolean> function, List<A> xs) {
        return false;
    }

    public static <A extends Number> A sum(List<A> xs, Addition<A> operation) {
        return null;
    }
}
