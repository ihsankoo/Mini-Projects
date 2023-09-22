// PART 2: Sorting & Searching HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StateCapitalsPart2 {
    // Initialize HashMap with state and capital pairs
    public static void main(String[] args) {
        Map<String, String> statesAndCapitalsMap = new HashMap<>();
        statesAndCapitalsMap.put("Alabama", "Montgomery");
        statesAndCapitalsMap.put("Alaska", "Juneau");
        statesAndCapitalsMap.put("Arizona", "Phoenix");
        statesAndCapitalsMap.put("Arkansas", "Little Rock");
        statesAndCapitalsMap.put("California", "Sacramento");
        statesAndCapitalsMap.put("Colorado", "Denver");
        statesAndCapitalsMap.put("Connecticut", "Hartford");
        statesAndCapitalsMap.put("Delaware", "Dover");
        statesAndCapitalsMap.put("Florida", "Tallahassee");
        statesAndCapitalsMap.put("Georgia", "Atlanta");
        statesAndCapitalsMap.put("Hawaii", "Honolulu");
        statesAndCapitalsMap.put("Idaho", "Boise");
        statesAndCapitalsMap.put("Illinois", "Springfield");
        statesAndCapitalsMap.put("Indiana", "Indianapolis");
        statesAndCapitalsMap.put("Iowa", "Des Moines");
        statesAndCapitalsMap.put("Kansas", "Topeka");
        statesAndCapitalsMap.put("Kentucky", "Frankfort");
        statesAndCapitalsMap.put("Louisiana", "Baton Rouge");
        statesAndCapitalsMap.put("Maine", "Augusta");
        statesAndCapitalsMap.put("Maryland", "Annapolis");
        statesAndCapitalsMap.put("Massachusetts", "Boston");
        statesAndCapitalsMap.put("Michigan", "Lansing");
        statesAndCapitalsMap.put("Minnesota", "Saint Paul");
        statesAndCapitalsMap.put("Mississippi", "Jackson");
        statesAndCapitalsMap.put("Missouri", "Jefferson City");
        statesAndCapitalsMap.put("Montana", "Helena");
        statesAndCapitalsMap.put("Nebraska", "Lincoln");
        statesAndCapitalsMap.put("Nevada", "Carson City");
        statesAndCapitalsMap.put("New Hampshire", "Concord");
        statesAndCapitalsMap.put("New Jersey", "Trenton");
        statesAndCapitalsMap.put("New Mexico", "Santa Fe");
        statesAndCapitalsMap.put("New York", "Albany");
        statesAndCapitalsMap.put("North Carolina", "Raleigh");
        statesAndCapitalsMap.put("North Dakota", "Bismarck");
        statesAndCapitalsMap.put("Ohio", "Columbus");
        statesAndCapitalsMap.put("Oklahoma", "Oklahoma City");
        statesAndCapitalsMap.put("Oregon", "Salem");
        statesAndCapitalsMap.put("Pennsylvania", "Harrisburg");
        statesAndCapitalsMap.put("Rhode Island", "Providence");
        statesAndCapitalsMap.put("South Carolina", "Columbia");
        statesAndCapitalsMap.put("South Dakota", "Pierre");
        statesAndCapitalsMap.put("Tennessee", "Nashville");
        statesAndCapitalsMap.put("Texas", "Austin");
        statesAndCapitalsMap.put("Utah", "Salt Lake City");
        statesAndCapitalsMap.put("Vermont", "Montpelier");
        statesAndCapitalsMap.put("Virginia", "Richmond");
        statesAndCapitalsMap.put("Washington", "Olympia");
        statesAndCapitalsMap.put("West Virginia", "Charleston");
        statesAndCapitalsMap.put("Wisconsin", "Madison");
        statesAndCapitalsMap.put("Wyoming", "Cheyenne");

        // Display HashMap
        for (Map.Entry<String, String> entry : statesAndCapitalsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // TreeMap for sorting
        Map<String, String> sortedStatesAndCapitals = new TreeMap<>(statesAndCapitalsMap);

        // User Input for state and displaying its capital
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state: ");
        String userState = scanner.nextLine();
        if (sortedStatesAndCapitals.containsKey(userState)) {
            System.out.println("The capital of " + userState + " is " + sortedStatesAndCapitals.get(userState));
        } else {
            System.out.println(userState + " is not in the list.");
        }
    }
}
