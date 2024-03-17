import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // user inputs with 10 parts of speech
        System.out.println("Hello, welcome to this Mad Libs game. To start please enter a place: ");
        Scanner in = new Scanner(System.in);

        String place;
        place = in.nextLine();

        System.out.println("Please enter a person that you have always wanted to meet: ");
        String person1;
        person1 = in.nextLine();

        System.out.println("Next, please enter an adjective: ");
        String adj1;
        adj1 = in.nextLine();

        System.out.println("Please enter another adjective: ");
        String adj2;
        adj2 = in.nextLine();

        System.out.println("Now, we need the name of a liquid: ");
        String liquid;
        liquid = in.nextLine();

        System.out.println("Next, we need the name of a food: ");
        String food1;
        food1 = in.nextLine();

        System.out.println("Next, we need a past tense verb: ");
        String verb1;
        verb1 = in.nextLine();

        System.out.println("Please give the name of a person: ");
        String person2;
        person2 = in.nextLine();

        System.out.println("Don't worry we're almost done. Now, we need the name of an object: ");
        String object1;
        object1 = in.nextLine();

        System.out.println("Last question! We need another object: ");
        String object2;
        object2 = in.nextLine();

        in.close();

        // output with a custom story user made through inputs
        System.out.println("Thank you for your input. You will now see your MadLib down below. Thanks again and have a great day!");
        System.out.println("Today, I walked into " + place + " because I wanted to visit " + person1 + ". It was very " + adj1 + " and " + adj2 + "." +
                " While walking there, I drank " + liquid + " and ate some " + food1 + ". I also " + verb1 + " a dog. " +
                person2 + " came with me, and we had to fight a " + object1 + " along the way. Word of advice, if you're going to fight a " +
                object1 + " make sure to bring a " + object2 + " with you.");
    }
}
