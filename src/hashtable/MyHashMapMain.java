package hashtable;


import java.util.Scanner;

public class MyHashMapMain {
    MyHashMap<String, Integer> myHashMap;
    MyLinkedHashMap<String, Integer> myLinkedHashMap;

    public static void main(String[] args) {
        MyHashMapMain myHashMapMain = new MyHashMapMain();
        myHashMapMain.myHashMap = new MyHashMap();

        String[] words = "To be or not to be".toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMapMain.myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            myHashMapMain.myHashMap.add(word, value);
        }
        System.out.println(myHashMapMain.myHashMap);
        System.out.println(myHashMapMain.myHashMap.get("to"));

        myHashMapMain.myLinkedHashMap = new MyLinkedHashMap<>();
        String[] wordsOfLargeParagraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations".toLowerCase().split(" ");
        for (String word : wordsOfLargeParagraph) {
            Integer value = myHashMapMain.myLinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            myHashMapMain.myLinkedHashMap.add(word, value);
        }
        System.out.println("Enter key to get frequency ");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        System.out.println("Frequency of " + key + " = " + myHashMapMain.myLinkedHashMap.get(key));

        System.out.println("Enter key to remove :");
        key = sc.next();
        MyMapNode removedNode = (MyMapNode) myHashMapMain.myLinkedHashMap.remove(key);
        System.out.println(removedNode == null ? "Key not present in map" : "Removed : " + removedNode);
        System.out.println(myHashMapMain.myLinkedHashMap);
    }
}
