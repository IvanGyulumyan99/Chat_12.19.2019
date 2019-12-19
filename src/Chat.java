import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        String[] listOfMembers = {"a", "b", "c"};
        System.out.println("Chat members: ");
        for (int i = 0; i < listOfMembers.length; i++) {
            System.out.print(listOfMembers[i] + " ");
        }
        System.out.println();
        while (true) {
            Scanner firstMember = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String firstMembersName = firstMember.nextLine();
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String formattedDate = date.format(formatDate);
            System.out.println("date and time: " + formattedDate);


            for (int i = 0; i < listOfMembers.length; i++) {
                if (listOfMembers[i].equals(firstMembersName)) {
                    System.out.print("Enter text: ");
                    String member1Text = firstMember.nextLine();
                    System.out.println("End of chat.");
                }
            }
        }
    }
}

