
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String name = args[0];
                name = name.toUpperCase();
                int num = Integer.parseInt(args[1]);
                int nameLength = name.length();

                for (int i = 0; i < nameLength; i++) {
                        System.out.print("Give me ");
                        if ("AEFHILMNORSX".indexOf(name.charAt(i)) != -1) {
                                System.out.print("an ");
                        } else {
                                System.out.print("a ");
                        }
                        System.out.println(name.charAt(i) + ": " + name.charAt(i) + "!");
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < num; j++) {
                        System.out.println(name + "!!!");
                }
        }
}
