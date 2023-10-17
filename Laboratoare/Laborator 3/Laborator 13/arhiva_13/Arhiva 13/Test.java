package Laborator13;

import java.util.ArrayList;

/**
 * Created by mihai
 */
public class Test {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.round((float) Math.random() * 100));
        }
        System.out.println(list);
        //Exemplul pentru map din enunt
        System.out.println(ListUtil.map(new Function<Integer, Integer>() {
            @Override
            public Integer execute(Integer x) {
                return 2*x;
            }
        }, list));

        /*TODO 1 - Pornind de la exemplul anterior pentru map, realizati un apel pentru filter
        Va trebui sa pastreze in lista doar numerele pare
        Trebuie sa inlocuiti valoarea null din apelul functionalei filter */
        System.out.println(ListUtil.filter(null, list));

        ListUtil.reverse(list);
        System.out.println(list);

        //TODO 2 - Apelati sum pentru lista noastra (inlocuiti valorea null cu un Addition)
        System.out.println(ListUtil.sum(list, null));

        //Exemplu de functie ce urmeaza a fi data ca parametru lui foldl pentru a calcula suma elementelor
        Function<Integer,Function<Integer,Integer>> add = new Function<Integer,Function<Integer,Integer>>(){
            @Override
            public Function<Integer,Integer> execute(final Integer a) {
                return new Function<Integer,Integer>(){
                    @Override
                    public Integer execute(Integer b) {
                        return a + b;
                    }
                };
            }
        };
        System.out.println(ListUtil.foldl(add, new Integer(0), list));
        //Apelam si reducem cu aceasta functie
        System.out.println(ListUtil.reduce(add, list));

        //TODO 3 - Realizati o functie similara cu add pe care sa o folosim pentru a inversa elementele
        //Observatie: Vom folosi functionala foldr pentru a realiza acest lucru
        //Hint: Acumulatorul o sa fie lista vida si tot adaugam elemente la el (de la dreapta la stanga)
        //Trebuie sa inlocuiti cele doua valori null

        Function<ArrayList<Integer>,Function<Integer,ArrayList<Integer>>> append = null;
        System.out.println(ListUtil.foldr(append, null, list));

        //Exemple de apeluri pentru all si any
        System.out.println(ListUtil.all(new Function<Integer, Boolean>() {
            @Override
            public Boolean execute(Integer x) {
                return x % 2 == 0;
            }
        }, list));
        System.out.println(ListUtil.any(new Function<Integer, Boolean>() {
            @Override
            public Boolean execute(Integer x) {
                return x % 3 == 1;
            }
        }, list));
    }
}
