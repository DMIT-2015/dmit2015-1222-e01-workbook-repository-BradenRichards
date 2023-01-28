package dmit2015.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanadianPersonalIncomeTaxManagerTest {

    @Test
    void readAllLinesFromCsvFiles() {
        //Arrange an object to test
        var incomeTaxManager = new CanadianPersonalIncomeTaxManager();

        //Act on the object
        final String csvRelativePath = "data/CanadianPersonalIncomeTaxRates(1).csv";
        List<String> allLines = incomeTaxManager.readAllLinesFromCsvFiles(csvRelativePath);

        //Assert - Compare expected with actual results
        //There should be 440 elements in the list
        assertEquals(439,allLines.size());
        //Check the first and last element of the file
        final String firstElement = "CAN,Canada,2023,1,0,53359,0.1500,0.00,0";
        final int firstElementIndex = 0;
        final String lastElement = "NU,Nunavut,2015,4,138586,,0.1150,9489.22,9489";
        final int lastElementIndex = allLines.size() -1;
        assertEquals(firstElement,allLines.get(firstElementIndex));
        assertEquals(lastElement, allLines.get(lastElementIndex));
    }
}