import java.util.Scanner; //import package called java.util from which scanner class is used to read input
class p4_userInput {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your year of birth: ");
        int dob = input.nextInt();
        System.out.print("Enter your gender (M , F): ");
        char gender = input.next().charAt(0);
        System.out.println ("You are " + name + ". You are a " + (2025 - dob) + " year old " + gender + ".");
        input.close();
    }
}