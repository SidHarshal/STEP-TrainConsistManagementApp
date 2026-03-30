import java.util.*;

public class UC5{

void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("====================================");
    System.out.println("    Train Consist Management App");
    System.out.println("====================================");

    System.out.println();

    System.out.println("====================================");
    System.out.println("    UC6 - Map Bogie to Capacity (HashMap)");
    System.out.println("====================================");

//UC2
//    List<String> trainConsist = new ArrayList<>();
//
//    System.out.println("Train successfully initialized....");
//
//    System.out.println();
//
//    System.out.println("Initial Bogie Count : " + trainConsist.size());
//    System.out.println("Current Train Consist : " + trainConsist);
//
//    System.out.println();
//
//    System.out.println("After Adding Bogies:");
//    trainConsist.add("Sleeper");
//    trainConsist.add("AC Chair");
//    trainConsist.add("First Class");
//    System.out.println(trainConsist);
//
//    System.out.println();
//
//
//    System.out.println("After Removing 'AC Chair:");
//    trainConsist.remove("AC Chair");
//    System.out.println(trainConsist);
//
//    System.out.println();
//
//    System.out.println("Checking if 'Sleeper' exists");
//    System.out.println("Contains Sleeper?" + trainConsist.contains("Sleeper"));


//UC3
//    Set<String> bogies = new HashSet<>();
//    System.out.println();
//
//    bogies.add("BG101");
//    bogies.add("BG102");
//    bogies.add("BG103");
//    bogies.add("BG104");
//
//    System.out.println("Bogie IDs After Insertion:");
//    System.out.println(bogies);
//    System.out.println();
//    System.out.println("UC3 uniqueness validation completed...");


    //UC4
//
//    List<String> trainConsist = new LinkedList<>();
//    trainConsist.add("Engine");
//    trainConsist.addLast("Sleeper");
//    trainConsist.add("AC");
//    trainConsist.add("Cargo");
//    trainConsist.add("Guard");
//    System.out.println(trainConsist);
//    System.out.println(trainConsist);
//
//    System.out.println("Adding Pantry Car at Position 2");
//    trainConsist.add(2, "Pantry");
//    System.out.println(trainConsist);
//
//    System.out.println(trainConsist);
//    System.out.println("After Removing First and Last Bogie");
//    trainConsist.removeFirst();
//    trainConsist.removeLast();
//    System.out.println(trainConsist);
//    System.out.println();
//    HashSet<String> bogie = new HashSet<>();
//
//
//    System.out.println("Enger Bogie IDs--");
//    while(true){
//        String B = sc.nextLine();
//        System.out.println("Enter Exit if entered all bogies");
//        if(B.equalsIgnoreCase("Exit")){break;}
//        bogie.add(B);
//    }
//
//    System.out.println();
//    System.out.println(bogie);
//    System.out.println();
//
//    System.out.println("UC4 ordered consist operations completed");


    //UC5
//    Set<String> formation = new LinkedHashSet<>();
//
//    System.out.println("Please enter the name of the bogies you want to add\n(To Exit you can type 'Exit'): ");
//    while(true){
//        String name = sc.nextLine();
//        if(name.equalsIgnoreCase("Exit")){break;}
//        formation.add(name);
//    }
//    System.out.println();
//    System.out.println("Final Train Formation:");
//    System.out.println(formation);

    //UC6
    Map<String, Integer> capacity = new LinkedHashMap<>();

    System.out.println("Enter bogie-capacity and Enter 'Exit' to exit entering--");
    while (true) {
        System.out.println("Enter bogie:");
        String key = sc.nextLine();
        if (key.equalsIgnoreCase("Exit")) {
            break;
        }
        System.out.println("Enter capacity");
        int value = sc.nextInt();
        sc.nextLine();
        if (key.equalsIgnoreCase("Exit")) {
            break;
        }
        capacity.put(key, value);

    }
    System.out.println();
    System.out.println("Bogie Capacity Details:");
    for (Map.Entry<String, Integer> entry : capacity.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
}
