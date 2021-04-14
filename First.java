/*
Write generic method to reverse arrays of any type
 */
public class FirstProgram {
    public static void main(String[] args) {
        String[] names = { "Hello", "World" };
        String[] name = { "Data", "Structures" };
        System.out.println("Hello World " +" reverse :");
        printArray(names);
        System.out.println();
        System.out.println("Data Structures " +" reverse :");
        printArray(name);
    }

    public static <T> void printArray(T[] array) {
        for (int i = array.length - 1; i >= 0; i--)
             System.out.print(array[i] + " ");
              System.out.println();

    }
}
