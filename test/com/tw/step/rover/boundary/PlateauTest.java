package com.tw.step.rover.boundary;

import com.tw.step.rover.position.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlateauTest {
    @Test
    void shouldAllowCoordinateWithinInclusiveBounds() {
        Plateau plateau = new Plateau(new Coordinate(0, 0), new Coordinate(5, 5));
        assertTrue(plateau.isWithin(new Coordinate(0, 0)));
        assertTrue(plateau.isWithin(new Coordinate(5, 5)));
        assertTrue(plateau.isWithin(new Coordinate(2, 3)));
    }

    @Test
    void shouldReturnFalseForCoordinatesOutsideBounds() {
        Plateau plateau = new Plateau(new Coordinate(0, 0), new Coordinate(5, 5));
        assertFalse(plateau.isWithin(new Coordinate(6, 5)));
        assertFalse(plateau.isWithin(new Coordinate(5, 6)));
        assertFalse(plateau.isWithin(new Coordinate(-1, 0)));
    }
}
