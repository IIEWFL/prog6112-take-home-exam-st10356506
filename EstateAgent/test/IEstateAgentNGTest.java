/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author HP
 */
public class IEstateAgentNGTest {
    
    public IEstateAgentNGTest() {
    }

    @Test
    public void testEstateAgentSales() {
    }

    @Test
    public void testEstateAgentCommission() {
    }

    @Test
    public void testTopEstateAgent() {
    }

    public class IEstateAgentImpl implements IEstateAgent {

        public double EstateAgentSales(double[] propertySales) {
            return 0.0;
        }

        public double EstateAgentCommission(double propertySales) {
            return 0.0;
        }

        public int TopEstateAgent(double[] totalSales) {
            return 0;
        }
    }
    
}
