package io.study.java.examples.printer;

public class Printer<T> implements Printable {

    private T text;

    public Printer(T text){
        this.text = text;
    }

    public void setText(T text) {
        this.text = text;
    }

    public T getText() {
        return text;
    }

    public T printItem(T text){
        fowardingText(text);
        System.out.println(getText());
        return text;
    }

    @Override
    public void fowardingText(Object o) {
        o = this.text;
    }
}
