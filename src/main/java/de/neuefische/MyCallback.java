package de.neuefische;

public class MyCallback implements Callback {
    @Override
    public void call(String name) {
        System.out.println(name.repeat(2));
    }
}
