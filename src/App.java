import java.util.Scanner;
public class App {

    public static void main(String[]args) throws Exception {

        // The original list of children
        String naughtyNiceList[][] = {
            {"LoGan", "may", "Naughty", "7730 Whitemarsh Court", "deOdeRant"},
            {"Cecilia","bOYer","Nice","8686 Elm St.","PUddle"},
            {"lorElAi","moRsE","Naughty","8529 Birchpond St.","TOMAto"},
            {"MR.", "trAiNOr", "Naughty", "123 Dingle Bell Dr.", "baD InTerNeT"},
            {"rory","black","Naughty","39 FairfieldAve.","lampShaDe"},
            {"Denzel","SancHez","","961 Hanover Ave.","shOEs"},
            {"maNUEL","Lambert","Nice","698 Arrowhead Rd.","chArgEr"},
            {"Trinity","FISHER","Nice","49 Arlington Avenue","winDow"},
            {"maTthiAs","hayEs","Nice","23 Woodside Ave.","LOTION"},
            {"Sophia","SToUT","Naughty","7640 Andover Dr.","teddY beAr"},
            {"keNNedy","Dunlap","","63 Cypress Rd.","pAnts"},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            {" "," "," "," "," "},
            
        };

        // Accept new comma-delimited entries
        Scanner in = new Scanner(System.in);
        boolean enter = true;
        String[] newEntry;
        String yesNo;

        printArray(naughtyNiceList);

        // Converting all strings to uppercase
        for (int i = 0; i < naughtyNiceList.length; i++){
            for ( int j = 0; j < naughtyNiceList[j].length; j++){
               naughtyNiceList[i][j] = naughtyNiceList[i][j].toUpperCase();       
            }
            // Changing naughty kids' gifts to coal
            if (naughtyNiceList[i][2].equals ("NAUGHTY")){
                naughtyNiceList[i][4] = "COAL";
            }
        }

        //printing the array out after we modified it
        printArray(naughtyNiceList);


        //Asking if user wants to add more children to the list
        do{
            System.out.println(Colors.ANSI_BLUE);
            System.out.println("Would you like to add any more children to the list?");
            System.out.println("If yes, enter new data for children.");
            System.out.println("If no, type no to exit the program");
            yesNo = in.nextLine().toUpperCase();
            System.out.println(Colors.ANSI_RESET);

            // If no, it exits the loop
            if(yesNo.equals("NO")) {
                System.out.println("Peace out.");
                break;
            }
            // If yes, it continues the loop
            if(yesNo.equals("YES")) {

            
            System.out.println("Enter a list");
                // Please enter a list
                newEntry = in.nextLine().toUpperCase().split(",");
            
                // Finding an open space in the array for the new child to go into
                for (int i = 0; i < naughtyNiceList.length; i++) {
                    if (naughtyNiceList[i][0].equals(" ")
                    && naughtyNiceList[i][1].equals(" ")
                    && naughtyNiceList[i][2].equals(" ")
                    && naughtyNiceList[i][3].equals(" ")
                    && naughtyNiceList[i][4].equals(" ")
                    ){
                        naughtyNiceList[i] = newEntry;

                    // Changing the new child's gift to coal if naughty
                    if (naughtyNiceList[i][2].equals("NAUGHTY")) {
                        naughtyNiceList[i][4] = "COAL";
                    }
                        break;
                    }

                }
                // Printing the new array out after the new child is added
                printArray(naughtyNiceList);
                    
            }
            
        }while(true);

    }
    // Changing the color of naughty kids to red, nice kids to green, and unmarked kids to yellow
    public static String[][] printArray(String[][] naughtyNiceList) {
        for (int i = 0; i < naughtyNiceList.length; i ++) {
            if (naughtyNiceList[i][2].toUpperCase().equals("NAUGHTY")){
                System.out.println(Colors.ANSI_RED); 
            }
            else if (naughtyNiceList[i][2].toUpperCase().equals("NICE")) {
                System.out.println(Colors.ANSI_GREEN);               
            }
            else {
                System.out.println(Colors.ANSI_YELLOW);
            }
            for (int j = 0; j < naughtyNiceList[i].length; j++) {
                System.out.print(naughtyNiceList[i][j] + " ");
            }
            System.out.println(Colors.ANSI_RESET);
        
        }

        return naughtyNiceList;

    }
   




    

}