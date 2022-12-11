package hashtable;

public class MyHashMapMain {
    MyHashMap<String, Integer> myHashMap;

    public static void main(String[] args) {
        MyHashMapMain myHashMapMain = new MyHashMapMain();
        myHashMapMain.myHashMap = new MyHashMap();
        String[] words = "To be or not to be".split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            Integer value = myHashMapMain.myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            myHashMapMain.myHashMap.add(word, value);
        }
        System.out.println(myHashMapMain.myHashMap);
    }
}
