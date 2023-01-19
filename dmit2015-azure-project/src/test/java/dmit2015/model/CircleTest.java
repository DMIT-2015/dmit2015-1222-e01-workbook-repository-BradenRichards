package dmit2015.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void area() {
    }

    @Test
    void perimeter() {
    }

    class ParameterizedCircleTest {
        @ParameterizedTest(name = "radius = {0}, expected area = {1} ")
        @CsvSource({
                "1.0, 3.14",
                "25.0, 1963.50",
                "100.0, 31415.93",
                "125.0, 49087.39",
        })
        void area_DifferentRadius_ReturnsCorrectResults(double radius, double expectedArea) throws Exception {
// Arrange
            Circle circle1 = new Circle();
// Act
            circle1.setRadius(radius);
// Assert
            assertEquals(expectedArea, circle1.area(), 0.005);
        }

    }
}