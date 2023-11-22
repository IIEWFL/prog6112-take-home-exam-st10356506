//define the iEstate interface
public interface IEstateAgent {
    double EstateAgentSales(double[] propertySales);
    double EstateAgentCommission(double propertySales);
    int TopEstateAgent(double[] totalSales);
}
//create an abstract class EstateAgent that implements iEstateAgent
//https://www.geeksforgeeks.org/implement-interface-using-abstract-class-in-java/
abstract class EstateAgent implements IEstateAgent {
    //create and populate propertyPrice, month, agents, totalSale, commission, and topPerformingAgent arrays
    static int propertyPrice[][] = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
    };
    static String month[] = {"JAN", "FEB", "MAR"};
    static String agents[] = {"Joe Bloggs", "Jane Doe"};
    static int[] totalSale = new int[2];
    static double[] commission = new double[2];
    static String topPerformingAgent = "";

    public static void main(String[] args) {
        setLayout();
        displayInfo();
        getTopAgent();
    }

    public static void setLayout() {
        //sets the layout of the report
        //\t is a place holder
        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println();
        System.out.println("\t\tJAN" + "\t\t" + "FEB" + "\t\t\t" + "MAR");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("");
    }

    public static void displayInfo() {
        //for loop to display the info for each agent and price
        for (int i = 0; i < agents.length; i++) {
            System.out.print(agents[i] + ":\t");
            for (int j = 0; j < propertyPrice[i].length; j++) {
                System.out.print( "R" + propertyPrice[i][j] + "\t\t");
                totalSale[i] += propertyPrice[i][j];
                commission[i] += propertyPrice[i][j] * 0.02;
            }
           
            System.out.println();
            System.out.println("\t");
        }
        for (int i = 0; i < agents.length; i++) {
            //loops for the number of agents there are
            System.out.println("Total property sales for " + agents[i] + " = R" + totalSale[i]);
        
        }
        System.out.println("\t");
        for (int j = 0; j < agents.length; j++) {
        System.out.println("Sales Commission for " + agents[j] + " = R" + commission[j]);
    }
        System.out.println("\t");
    }

    public static void getTopAgent() {
        int topAgent = 0;
        //gets the top agent by comapring the total sale amounts for each agent
        for (int i = 1; i < totalSale.length; i++) {
            if (totalSale[i] > totalSale[topAgent]) {
                topAgent = i;
            }
        }
        //stores the top performing agent to the topPerformingAgent array
        topPerformingAgent = agents[topAgent];
        System.out.println("Top performing estate agent: " + topPerformingAgent);
    }
}
