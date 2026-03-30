
void main(String[] args) {

    System.out.println("====================================");
    System.out.println("    Train Consist Management App");
    System.out.println("====================================");

    System.out.println();

    System.out.println("====================================");
    System.out.println("    UC3 - Track Unique Bogies IDs");
    System.out.println("====================================");


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

    Set<String> bogies = new HashSet<>();
    System.out.println();

    bogies.add("BG101");
    bogies.add("BG102");
    bogies.add("BG103");
    bogies.add("BG104");

    System.out.println("Bogie IDs After Insertion:");
    System.out.println(bogies);
    System.out.println();
    System.out.println("UC3 uniqueness validation completed...");

}
