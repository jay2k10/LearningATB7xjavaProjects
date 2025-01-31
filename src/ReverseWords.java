
    public class ReverseWords {
        public static void main(String[] args) {
            // Input string
            String input = "I am Jay";

            System.out.println("Input String is: "+input);

            // Split the string into words
            String[] words = input.split(" ");

            // StringBuilder to store the result
            StringBuilder reversedString = new StringBuilder();

            // Reverse each word
            for (String word : words) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                reversedString.append(reversedWord).append(" ");
            }

            // Trim the trailing space and print the result
            System.out.println("Reversed string: " + reversedString.toString().trim());
        }
    }


