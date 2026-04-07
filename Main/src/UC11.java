import java.util.*;
import java.util.stream.Collectors;

public class UC11 {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("    Train Consist Management App");
        System.out.println("====================================");

        System.out.println();

        System.out.println("====================================");
        System.out.println("    UC11 - Validate Train ID and Cargo Code");
        System.out.println("====================================");

        // UC2
        // List<String> trainConsist = new ArrayList<>();
        //
        // System.out.println("Train successfully initialized....");
        //
        // System.out.println();
        //
        // System.out.println("Initial Bogie Count : " + trainConsist.size());
        // System.out.println("Current Train Consist : " + trainConsist);
        //
        // System.out.println();
        //
        // System.out.println("After Adding Bogies:");
        // trainConsist.add("Sleeper");
        // trainConsist.add("AC Chair");
        // trainConsist.add("First Class");
        // System.out.println(trainConsist);
        //
        // System.out.println();
        //
        //
        // System.out.println("After Removing 'AC Chair:");
        // trainConsist.remove("AC Chair");
        // System.out.println(trainConsist);
        //
        // System.out.println();
        //
        // System.out.println("Checking if 'Sleeper' exists");
        // System.out.println("Contains Sleeper?" + trainConsist.contains("Sleeper"));

        // UC3
        // Set<String> bogies = new HashSet<>();
        // System.out.println();
        //
        // bogies.add("BG101");
        // bogies.add("BG102");
        // bogies.add("BG103");
        // bogies.add("BG104");
        //
        // System.out.println("Bogie IDs After Insertion:");
        // System.out.println(bogies);
        // System.out.println();
        // System.out.println("UC3 uniqueness validation completed...");

        // UC4
        //
        // List<String> trainConsist = new LinkedList<>();
        // trainConsist.add("Engine");
        // trainConsist.addLast("Sleeper");
        // trainConsist.add("AC");
        // trainConsist.add("Cargo");
        // trainConsist.add("Guard");
        // System.out.println(trainConsist);
        // System.out.println(trainConsist);
        //
        // System.out.println("Adding Pantry Car at Position 2");
        // trainConsist.add(2, "Pantry");
        // System.out.println(trainConsist);
        //
        // System.out.println(trainConsist);
        // System.out.println("After Removing First and Last Bogie");
        // trainConsist.removeFirst();
        // trainConsist.removeLast();
        // System.out.println(trainConsist);
        // System.out.println();
        // H ashSet<String> bogie = new HashSet<>();
        //
        //
        // System.out.println("Enger Bogie IDs--");
        // while(true){
        // String B = sc.nextLine();
        // System.out.println("Enter Exit if entered all bogies");
        // if(B.equalsIgnoreCase("Exit")){break;}
        // bogie.add(B);
        // }
        //
        // System.out.println();
        // System.out.println(bogie);
        // System.out.println();
        //
        // System.out.println("UC4 ordered consist operations completed");

        // UC5
        // Set<String> formation = new LinkedHashSet<>();
        //
        // System.out.println("Please enter the name of the bogies you want to add\n(To
        // Exit you can type 'Exit'): ");
        // while(true){
        // String name = sc.nextLine();
        // if(name.equalsIgnoreCase("Exit")){break;}
        // formation.add(name);
        // }
        // System.out.println();
        // System.out.println("Final Train Formation:");
        // System.out.println(formation);

        // UC6
        // Map<String, Integer> capacity = new LinkedHashMap<>();

        // System.out.println("Enter bogie-capacity and Enter 'Exit' to exit
        // entering--");
        // 
        // while (true) {
        // em.out.println("Enter bogie:");
        // ng key = sc.nextLine();
        // key.equalsIgnoreCase("Exit")) {
        // 
        // 
        // em.out.println("Enter capacity");
        // value = sc.nextInt();
        // extLine();
        // key.equalsIgnoreCase("Exit")) {
        // 
        // 
        // city.put(key, value);

        // }
        // System.out.println();
        // System.out.println("Bogie Capacity Details: ");
        // for (Map.Entry<String, Integer> entry : capacity.entrySet()) {
        // em.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

         
        // List<Bogie> bogies = new ArrayList<>();

        // System.out.println("Enter bogie name and capacity (Enter 'Exit' to stop):");
        // while (true) {
        //     System.out.println("Bogie Name:");
        //     String name = sc.nextLine();
        //     if (name.equalsIgnoreCase("Exit")) {
        //         break;
        //     }
        //     System.out.println("Bogie Capacity:");
        //     int capacity = sc.nextInt();
        //     sc.nextLine(); // Consume newline
        //     bogies.add(new Bogie(name, capacity));
        // }

        // System.out.println


        // for (Bogie b : bogies) {
        // System.out.println(b.name + " -> " + b.capacity);
        // }
 
        // System.out.println();

        // System.out.println("After Sorting by Capacity:");
        // bogies.sort((a, b) -> a.capacity - b.capacity);
        // for (Bogie b : bogies) {
        // System.out.println(b.name + " -> " + b.capacity);
        // }
 
        // System.out.println();
        // System.out.println("UC7 sorting completed...");

        // System.out.println("All Bogies");

        // }

        // System.out.println();

        // System.out.println("Filtered Bogeies (Capacity > 60):");
        // List<Bogie> filteredBogies = bogies.stream()
        //         .filter(b -> b.capacity > 60)
        //         .collect(Collectors.toList());

        // for (Bogie b : filteredBogies) {
        //     System.out.println(b.name + " -> " + b.capacity);
        // }

        // System.out.println("UC8 filtering completed...");

        // List<Bogie> bogies = new ArrayList<>();

        // bogies.add(new Bogie("Sleeper", 72));
        // bogies.add(new Bogie("AC Chair", 56));
        // bogies.add(new Bogie("First Class", 24));
        // bogies.add(new Bogie("Sleeper", 70));
        // bogies.add(new Bogie("AC Chair", 60));

        // System.out.println("\nAll Bogies:");
        // for (Bogie b : bogies) {
        //     System.out.println(b.name + " -> " + b.capacity);
        // }

        // Map<String, List<Bogie>> groupedBogies = bogies.stream()
        //         .collect(Collectors.groupingBy(b -> b.name));

        // System.out.println("\nGrouped Bogies:\n\n");
        // for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
        //     System.out.println("Bogie Type: " + entry.getKey());
        //     for (Bogie b : entry.getValue()) {
        //         System.out.println("  " + b.name + " -> " + b.capacity);
        //     }
        //     System.out.println();
        // }
        
        // System.out.println();
        // System.out.println("UC9 grouping completed...");


        // UC10 - Count Total Seats in Train

    // List<Bogie> bogies = new ArrayList<>();

    // bogies.add(new Bogie("Sleeper", 72));
    // bogies.add(new Bogie("AC Chair", 56));
    // bogies.add(new Bogie("First Class", 24));
    // bogies.add(new Bogie("Sleeper", 70));

    // System.out.println("\nBogies in Train:");
    // for (Bogie b : bogies) {
    //     System.out.println(b.name + " -> " + b.capacity);
    // }

    // // ----- AGGREGATE USING STREAM (map + reduce) -----

    // int totalCapacity = bogies.stream()
    //         .map(b -> b.capacity)          // extract capacity
    //         .reduce(0, Integer::sum);      // sum all values

    // System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

    // System.out.println();
    // System.out.println("UC10 aggregation completed...");

    // UC11 - Validate Train ID and Cargo Code

    // Scanner sc = new Scanner(System.in);

    // Accept input
    System.out.print("Enter Train ID (Format: TR-1234): ");
    String trainId = sc.nextLine();

    System.out.print("Enter Cargo Code (Format: FR-AB12): ");
    String cargoCode = sc.nextLine();

    // ----- REGEX VALIDATION -----

    // Train ID: TR-1234
    boolean isTrainValid = trainId.matches("TR-\\d{4}");

    // Cargo Code: FR-AB12
    boolean isCargoValid = cargoCode.matches("FR-[A-Z]{2}\\d{2}");

    System.out.println();

    // Display results
    if (isTrainValid) {
        System.out.println("Train ID is VALID");
    } else {
        System.out.println("Train ID is INVALID");
    }

    if (isCargoValid) {
        System.out.println("Cargo Code is VALID");
    } else {
        System.out.println("Cargo Code is INVALID");
    }

    System.out.println();
    System.out.println("UC11 validation completed...");
    }
}
