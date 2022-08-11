import java.util.Random;

public class MagicBox<T> {

    protected String name;
    protected T[] items;
    private T item;

    public MagicBox(String name, T[] items) {
        this.name = name;
        this.items = items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    private T pick() throws RuntimeException {
        int count = 0;
        for (T element : items)
            if (element == null) {
                count++;
            }

        int randomIndex;
        if (add(item)) {
            System.out.println("The Magic Box is not filled with enough amount of items."
                    + "\nYou can fill: " + count + " item(s) "
                    + "in your " + "'" + name + "'");
            throw new RuntimeException();
        } else {
            randomIndex = new Random().nextInt(items.length);
        }
        return items[randomIndex];
    }

    public String toString() {
        return name + " - " + "Random element from The Box: " + "[" + pick() + "]";
    }
}