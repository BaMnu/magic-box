public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> integerBox = new MagicBox<>("'Magic Box for Numbers'", new Integer[3]);
        MagicBox<String> stringBox = new MagicBox<>("'Magic Box for Words'", new String[3]);

        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);
        integerBox.add(4);

        stringBox.add("letter");
        stringBox.add("word");
        stringBox.add("sentence");
        stringBox.add("text");

        System.out.println(integerBox + "\n" + stringBox);
    }
}