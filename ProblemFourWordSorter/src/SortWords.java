import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {
        // String from the previous question
        String text = "To be or not to be, that is the question;"
                + " Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = text.split("\\s+");

        // Perform bubble sort on the words
        bubbleSort(words);

        // Print the sorted words
        System.out.println("Words in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble Sort Method
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    // Swap arr[i] and arr[i + 1]
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
