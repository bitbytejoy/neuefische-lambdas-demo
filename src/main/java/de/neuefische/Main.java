package de.neuefische;

public class Main {
    public static String test = "abc";

    public static void main(String[] args) {
        String[] names = {
                "Christian",
                "Abir",
                "Florian",
                "Thanh",
                "Claudia",
                "Muslim",
                "Raphaela",
                "Elias",
                "Ludwig"
        };

        final String abc = "test";

        forEach(names, name -> {
            System.out.println(name + " " + abc);
            test = "bce";
        });
    }

    public static void forEach (String[] names, Callback callback) {
        for (String name : names) {
            callback.call(name);
        }
    }
}