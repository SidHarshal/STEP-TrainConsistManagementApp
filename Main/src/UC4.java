
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("====================================");
    System.out.println("    Train Consist Management App");
    System.out.println("====================================");

    System.out.println();

    System.out.println("====================================");
    System.out.println("    UC4 - Maintain Ordered Bogie Consist");
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

    List<String> trainConsist = new LinkedList<>();
    trainConsist.add("Engine");
    trainConsist.addLast("Sleeper");
    trainConsist.add("AC");
    trainConsist.add("Cargo");
    trainConsist.add("Guard");
    System.out.println(trainConsist);
    System.out.println(trainConsist);

    System.out.println("Adding Pantry Car at Position 2");
    trainConsist.add(2, "Pantry");
    System.out.println(trainConsist);

    System.out.println(trainConsist);
    System.out.println("After Removing First and Last Bogie");
    trainConsist.removeFirst();
    trainConsist.removeLast();
    System.out.println(trainConsist);
    System.out.println();
    HashSet<String> bogie = new HashSet<>();


    System.out.println("Enger Bogie IDs--");
    while(true){
        String B = sc.nextLine();
        System.out.println("Enter Exit if entered all bogies");
        if(B.equalsIgnoreCase("Exit")){break;}
        bogie.add(B);
    }

    System.out.println();
    System.out.println(bogie);

    System.out.println("");

}
