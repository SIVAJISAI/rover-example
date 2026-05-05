package com.tw.step.rover.rover;

import com.tw.step.rover.boundary.InfinitePlateau;
import com.tw.step.rover.boundary.Plateau;
import com.tw.step.rover.position.Coordinate;
import com.tw.step.rover.position.Direction;
import com.tw.step.rover.position.Navigator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class DeadRoverStateTest {
    @Test
    void shouldIgnoreRemainingInstructionsOnceLost() {
        Rover rover = new Rover(new Coordinate(5, 5), Direction.N);
        DeadRoverState state = new DeadRoverState(rover);
        Navigator navigator = Navigator.create();
        Plateau boundary = new Plateau(new Coordinate(0, 0), new Coordinate(5, 5));

        RoverState nextState = state.move(navigator, boundary);

        assertSame(state, nextState);
        assertEquals(RoverStatus.DEAD, state.status());
    }
}
