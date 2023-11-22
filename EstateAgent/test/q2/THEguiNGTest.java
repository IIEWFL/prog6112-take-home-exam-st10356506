package q2;

import javax.swing.JComboBox;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class THEguiNGTest {
    
    public THEguiNGTest() {
    }

    @Test
    public void CalculateCommission_CalculatedSuccessfully() {
        //create instance variable
        THEgui gui = new THEgui();
        javax.swing.JTextField txtPrice = gui.getTxtPrice();
        javax.swing.JTextField txtPercentage = gui.getTxtPercentage();
        //set the test data
        txtPrice.setText("1000000");
        txtPercentage.setText("20");
        //call the calculateCommission() method
        double commission = gui.calculateCommission();
        //set the expected outcome
        assertEquals(commission, 200000.0);
    }
    
    @Test
    public void CalculateCommission_CalculatedUnSuccessfully()  {
        THEgui gui = new THEgui();
      javax.swing.JTextField txtPrice = gui.getTxtPrice();
        javax.swing.JTextField txtPercentage = gui.getTxtPercentage();
        txtPrice.setText("10000");
        txtPercentage.setText("20");
        //calls the calculateCommission() method
        double commission = gui.calculateCommission();
          //set a wrong output to test the CalculatedUnSuccessfully()
        assertEquals(commission, 2000.0);
    }
    @Test
    public void ValidationTest_valid() {
        //tests if data being entered are valid and arent null
        THEgui gui = new THEgui();
        //call the variables to be tested
        //https://stackoverflow.com/questions/9306207/how-to-make-a-private-swing-component-a-public-one-in-java
        JComboBox<String> cmbLocation = gui.getcmbLocation();
        javax.swing.JTextField txtName = gui.getTxtName();
        javax.swing.JTextField txtPrice = gui.getTxtPrice();
        javax.swing.JTextField txtPercentage = gui.getTxtPercentage();
        //create test data
        cmbLocation.setSelectedItem("Cape Town");
        txtName.setText("John Doe");
        txtPrice.setText("500000");
        txtPercentage.setText("5");
        
        //calls the validateInputs() method to test if the inputs are valid according to the rules
        boolean result = gui.validateInputs();
        
        //expect the results to be true, if not then the test will fail.
        assertTrue(result);
    }

}
