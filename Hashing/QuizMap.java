package Hashing;
//hadassah //lab 1
public class QuizMap {
    private static final int ARRAY_SIZE = 11;
    private String[] keys;
    private String[] values;

    public QuizMap() {
        keys = new String[ARRAY_SIZE];
        values = new String[ARRAY_SIZE];
    }
    private int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += key.charAt(i);
        }return hashCode % ARRAY_SIZE;
    }
    public void insert(String key, String value) {
        int index = hash(key);
        keys[index] = key;
        values[index] = value;
        System.out.println("Inserted at index " + index + ": " + "(" + key + ", " + value + ")");
    }
    public void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (keys[i] != null) {
                System.out.println("Index " + i + ": (" +
                        keys[i] + ", " + values[i] + ")");
            } else {
                System.out.println("Index " + i + ": []");
            }
        }
    }
    public static void main(String[] args) {
        QuizMap hashTable = new QuizMap();
        hashTable.insert("algorithm", "a step-by-step process to solve a problem");
        hashTable.insert("water", "a universal solvent with formula H_2O");

        hashTable.display();
    }
}
