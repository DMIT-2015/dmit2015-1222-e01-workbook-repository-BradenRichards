package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @ParameterizedTest(name = "Area = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,200",
            "20,20,400",
            "50,50,2500"
    })
    void area(double length, double width, double expectedArea){
        Rectangle currentRectangle = new Rectangle();
            currentRectangle.setLength(length);
            currentRectangle.setWidth(width);
         assertEquals(expectedArea, currentRectangle.area(), 0.05);
    }

    @ParameterizedTest(name = "Area = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,60",
            "20,20,80",
            "50,50,200"
    })
    void perimeter(double length, double width, double expectedPerimeter){
        Rectangle currentRectangle = new Rectangle();
        currentRectangle.setLength(length);
        currentRectangle.setWidth(width);
        assertEquals(expectedPerimeter, currentRectangle.perimeter(), 0.05);
    }

    @ParameterizedTest(name = "Area = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,22.36",
            "20,20, 28.28",
            "50,50,70.71"
    })
    void diagonal(double length, double width, double expectedDiagonal){
        Rectangle currentRectangle = new Rectangle();
        currentRectangle.setLength(length);
        currentRectangle.setWidth(width);
        assertEquals(expectedDiagonal, currentRectangle.diagonal(), 0.05);
    }
}