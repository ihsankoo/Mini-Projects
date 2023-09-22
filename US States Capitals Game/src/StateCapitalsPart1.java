// PART 1: Sorting Arrays


import java.util.Scanner;

public class StateCapitalsPart1 {

    public static void main(String[] args) {
        // Initialize 2D array with state and capital pairs
        String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}

        };

        // Display array
        for (String[] pair : statesAndCapitals) {
            System.out.println(pair[0] + " - " + pair[1]);
        }

        // Bubble Sort by capital
        for (int i = 0; i < statesAndCapitals.length - 1; i++) {
            for (int j = 0; j < statesAndCapitals.length - i - 1; j++) {
                if (statesAndCapitals[j][1].compareTo(statesAndCapitals[j+1][1]) > 0) {
                    String[] temp = statesAndCapitals[j];
                    statesAndCapitals[j] = statesAndCapitals[j+1];
                    statesAndCapitals[j+1] = temp;
                }
            }
        }

        // User Input and Counting Correct Answers
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        for (String[] pair : statesAndCapitals) {
            System.out.print("Enter the capital for " + pair[0] + ": ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(pair[1])) {
                correctCount++;
            }
        }
        System.out.println("You answered " + correctCount + " questions correctly out of 50.");
    }
}