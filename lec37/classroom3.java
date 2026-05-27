/*
 * INTERVIEW QUESTIONS - Itinerary from Tickets (HashMap):
 *
 * Q1: What is the problem?
 * A: Given flight tickets (source->dest), find the travel itinerary
 *
 * Q2: How to find starting city?
 * A: It won't appear as a destination in any ticket
 *
 * Q3: What data structure is used?
 * A: HashMap for tickets, reverse map to find start
 *
 * Q4: Time complexity?
 * A: O(n) - where n is number of tickets
 *
 * Q5: How to traverse the itinerary?
 * A: Keep following the destination from HashMap
 *
 * Q6: What if there's a cycle?
 * A: Need to handle differently; this assumes valid itinerary
 */
import java.util.*;

public class classroom3 {

    // Q: How to find starting point?
    // A: Create reverse map; start city won't be a value (destination)
    public static String getStart(HashMap<String, String> tick) {

        HashMap<String, String> revMap = new HashMap<>();

        // Q: Create reverse map: destination -> source
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }

        // Q: Find city that's not a destination (i.e., the starting point)
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;  // This city is never a destination
            }
        }

        return null;
    }

    public static void main(String args[]) {

        HashMap<String, String> tickets = new HashMap<>();

        // Q: Format: source -> destination
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Q: Find the starting city
        String start = getStart(tickets);

        // Q: Traverse the itinerary by following destinations
        while (tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);  // Move to next city
        }

        System.out.println(start);  // Print final destination
    }
}
