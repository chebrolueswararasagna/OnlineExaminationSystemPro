import java.util.Scanner;

public class OnlineExaminationSystemPro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "rasa";
        String password = "1234";

        System.out.println("====================================");
        System.out.println("   ONLINE EXAMINATION SYSTEM PRO");
        System.out.println("====================================");

        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("\nInvalid Login!");
            return;
        }

        System.out.println("\nLogin Successful!");
        System.out.println("Exam Started...\n");

        int score = 0;

        // Question 1
        System.out.println("Q1. Java is a?");
        System.out.println("a) Browser");
        System.out.println("b) Programming Language");
        System.out.println("c) Operating System");
        System.out.println("d) Database");
        System.out.print("Answer: ");
        String ans1 = sc.next();
        if(ans1.equalsIgnoreCase("b"))
            score++;

        // Question 2
        System.out.println("\nQ2. Which keyword is used for inheritance?");
        System.out.println("a) this");
        System.out.println("b) static");
        System.out.println("c) extends");
        System.out.println("d) super");
        System.out.print("Answer: ");
        String ans2 = sc.next();
        if(ans2.equalsIgnoreCase("c"))
            score++;

        // Question 3
        System.out.println("\nQ3. Which database is popular?");
        System.out.println("a) MySQL");
        System.out.println("b) Chrome");
        System.out.println("c) Paint");
        System.out.println("d) Windows");
        System.out.print("Answer: ");
        String ans3 = sc.next();
        if(ans3.equalsIgnoreCase("a"))
            score++;

        // Question 4
        System.out.println("\nQ4. JSP stands for?");
        System.out.println("a) Java Server Pages");
        System.out.println("b) Java Source Package");
        System.out.println("c) Java Simple Program");
        System.out.println("d) None");
        System.out.print("Answer: ");
        String ans4 = sc.next();
        if(ans4.equalsIgnoreCase("a"))
            score++;

        // Question 5
        System.out.println("\nQ5. Tomcat is a?");
        System.out.println("a) Browser");
        System.out.println("b) Database");
        System.out.println("c) Web Server");
        System.out.println("d) IDE");
        System.out.print("Answer: ");
        String ans5 = sc.next();
        if(ans5.equalsIgnoreCase("c"))
            score++;

        // Question 6
        System.out.println("\nQ6. Which company owns Java?");
        System.out.println("a) Apple");
        System.out.println("b) Oracle");
        System.out.println("c) Microsoft");
        System.out.println("d) IBM");
        System.out.print("Answer: ");
        String ans6 = sc.next();
        if(ans6.equalsIgnoreCase("b"))
            score++;

        // Question 7
        System.out.println("\nQ7. Which symbol ends a Java statement?");
        System.out.println("a) :");
        System.out.println("b) ;");
        System.out.println("c) ,");
        System.out.println("d) #");
        System.out.print("Answer: ");
        String ans7 = sc.next();
        if(ans7.equalsIgnoreCase("b"))
            score++;

        // Question 8
        System.out.println("\nQ8. Array index starts from?");
        System.out.println("a) 0");
        System.out.println("b) 1");
        System.out.println("c) -1");
        System.out.println("d) 10");
        System.out.print("Answer: ");
        String ans8 = sc.next();
        if(ans8.equalsIgnoreCase("a"))
            score++;

        // Question 9
        System.out.println("\nQ9. Which loop executes at least once?");
        System.out.println("a) for");
        System.out.println("b) while");
        System.out.println("c) do-while");
        System.out.println("d) foreach");
        System.out.print("Answer: ");
        String ans9 = sc.next();
        if(ans9.equalsIgnoreCase("c"))
            score++;

        // Question 10
        System.out.println("\nQ10. Scanner class belongs to?");
        System.out.println("a) java.io");
        System.out.println("b) java.net");
        System.out.println("c) java.util");
        System.out.println("d) java.sql");
        System.out.print("Answer: ");
        String ans10 = sc.next();
        if(ans10.equalsIgnoreCase("c"))
            score++;

        double percentage = (score * 100.0) / 10;

        String grade;

        if(percentage >= 90)
            grade = "A+";
        else if(percentage >= 80)
            grade = "A";
        else if(percentage >= 70)
            grade = "B";
        else if(percentage >= 60)
            grade = "C";
        else
            grade = "F";

        System.out.println("\n====================================");
        System.out.println("              RESULT");
        System.out.println("====================================");
        System.out.println("Student Name : " + user);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers : " + (10 - score));
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);

        if(percentage >= 40)
            System.out.println("Status : PASS");
        else
            System.out.println("Status : FAIL");

        System.out.println("====================================");

        sc.close();
    }
}