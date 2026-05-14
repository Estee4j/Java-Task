import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

     
    @Test
    public void testThatMethodCanCalculateSum(){
    double[] scoreCount = {10, 15, 8, 9, 22, 30, 11};
    double expectedResult = 105;
    
    double actualResult = StandardDeviation.varianceCalculation(scoreCount);
    
    assertEquals(expectedResult, actualResult);
    
    }
    
    @Test
    public void testThatMethodCanCalculateMean(){
    double[] scoreCount = {10, 15, 8, 9, 22, 30, 11};
    double expectedResult = 15;
    
    double actualResult = StandardDeviation.meanCalculation(scoreCount);
    
    assertEquals(expectedResult, actualResult);
    
    }


    @Test
    public void testThatMethodCanCalculateVariance(){
    double[] scoreCount = {10, 15, 8, 9, 22, 30, 11};
    double expectedResult = 64.67;
    
    double actualResult = StandardDeviation.varianceCalculation(scoreCount);
    
    assertEquals(expectedResult, actualResult);
       
  }


   


}
