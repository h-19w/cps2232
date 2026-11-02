package Hashing;

//hadassah //lab 4
public class Folding {
    public static void main(String[] args) {
        long key = 432197568;
        int hashTableSize = 11;
        System.out.println("key: " + key + "\nfolded hash: " +
                folding(key, hashTableSize));
    }
    public static int folding(long key, int tableSize) {
        int sum = 0;
        String keyStr = Long.toString(key);
        for (int i = 0; i < keyStr.length(); i += 2) {
            int allsum = 0;
            for (int j = i; j < Math.min(i + 2, keyStr.length()); j++) {
                allsum = allsum * 10 + (keyStr.charAt(j) - '0');
            }
            sum += allsum;
        }
        return sum % tableSize;
        }
    }

