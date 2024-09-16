import java.util.Random;

public class UniqueID {
    private static String id;

    public UniqueID(int length, String pref, int count) {
        this.id = pref + craeteID(length) + " | " + count;
    }

    private String craeteID(int length){
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder item = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            item.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return item.toString();
    }
}
