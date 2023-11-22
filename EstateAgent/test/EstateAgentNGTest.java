import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class EstateAgentNGTest {
    
    @Test
    public void CalculateTotalSales_ReturnsToSales() {
        //create the test variables
        int[][] propertyPrice = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}};
        //define the expected outcome
        int[] expectedTotalSales = {4300000, 3500000};
        
        int[] totalSale = new int[2];
        //for loop to iterate through the inner and outer loops to calculate the total sales
        for (int i = 0; i < propertyPrice.length; i++) {
            for (int j = 0; j < propertyPrice[i].length; j++) {
                totalSale[i] += propertyPrice[i][j];
            }
        }
         //validates the output to ensure its true
        assertEquals(totalSale, expectedTotalSales);
    }

    @Test
    public void CalculateTotalCommission_ReturnsCommission() {
        //create test data
        int[][] propertyPrice = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}};
        //set the expected outcome
        double[] expectedCommission = {86000, 70000};

        double[] commission = new double[2];
      //for loop to iterate through the inner and outer loops to calculate the total commission
        for (int i = 0; i < propertyPrice.length; i++) {
            for (int j = 0; j < propertyPrice[i].length; j++) {
                commission[i] += propertyPrice[i][j] * 0.02;
            }
        }
       
        assertEquals(commission, expectedCommission);
    }

    @Test
    public void TopAgent_ReturnsTopPosition() {
        //create test data
        int[] totalSale = {4300000, 3500000};
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        String expectedTopAgent = "Joe Bloggs";
        //initialize topPerformingAgent array to 0
        int topPerformingAgent = 0;
        //iterate through the total sales of each agent
        for (int i = 1; i < totalSale.length; i++) {
            //compares the total sales
            if (totalSale[i] > totalSale[topPerformingAgent]) {
                topPerformingAgent= i;
            }
        }
        //adds the top agent to the topPerformingAgent array
        String topAgent = agents[topPerformingAgent];

        assertEquals(topAgent, "Joe Bloggs");
    }
}
