import java.util.Random;

public class MagicBox<T> {

    private final String name;
    private final int size;
    private final T[] items;

    protected MagicBox(String name, int size) {
        this.name = name;
        this.size = size;
        items = (T[]) new Object[size];
    }

    protected boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("The item [" + item + "] hasn't been added in your " + name + "." +
                " You can't fill this Magic Box more than " + size + " cells!");
        return false;
    }

    private T pick() throws RuntimeException {
        int count = 0;
        int randomIndex = 0;
        for (T element : items)
            if (element == null) {
                count++;
            throw new RuntimeException("The Magic Box is not filled with enough amount of items."
                    + "\nYou can fill: " + count + " item(s) "
                    + "in your " + "'" + name + "'");
            } else {
            Random random = new Random();
            randomIndex = random.nextInt(size);
        }
        return items[randomIndex];
    }

    public String toString() {
        return name + " - " + "Random element from The Box: " + "[" + pick() + "]";
    }
}