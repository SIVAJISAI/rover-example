package com.tw.step.rover.rover;

import com.tw.step.rover.boundary.Plateau;
import com.tw.step.rover.position.Coordinate;
import com.tw.step.rover.position.Direction;
import com.tw.step.rover.position.Navigator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LiveRoverStateTest {
    @Test
    void shouldStayAliveWhenMovingWithinPlateau() {
        Rover rover = new Rover(new Coordinate(1, 1), Direction.N);
        LiveRoverState state = new LiveRoverState(rover);
        Plateau plateau = new Plateau(new Coordinate(0, 0), new Coordinate(5, 5));

        RoverState nextState = state.move(Navigator.create(), plateau);

        assertEquals(RoverStatus.ALIVE, nextState.status());
        assertEquals("1 2 N ALIVE", rover.toString());
    }

    @Test
    void shouldBecomeLostWhenMovingOffPlateau() {
        Rover rover = new Rover(new Coordinate(5, 5), Direction.N);
        LiveRoverState state = new LiveRoverState(rover);
        Plateau plateau = new Plateau(new Coordinate(0, 0), new Coordinate(5, 5));

        RoverState nextState = state.move(Navigator.create(), plateau);

        assertEquals(RoverStatus.DEAD, nextState.status());
        assertEquals("5 5 N ALIVE", rover.toString());
    }
}