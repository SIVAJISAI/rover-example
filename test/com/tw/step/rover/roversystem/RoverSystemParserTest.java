package com.tw.step.rover.roversystem;

import com.tw.step.rover.boundary.InfinitePlateau;
import com.tw.step.rover.boundary.Plateau;
import com.tw.step.rover.commands.CommandCreator;
import com.tw.step.rover.position.Coordinate;
import com.tw.step.rover.position.Navigator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoverSystemParserTest {
    @Test
    void shouldParsePlateauRoverAndCommandsFromInput() {
        String input = "5 5\n1 2 N\nRFF";

        RoverSystemParser parser = new RoverSystemParser(
                RoverSystemScanner.from(input),
                Navigator.create(),
                new CommandCreator()
        );

        RoverSystem roverSystem = parser.parse();
        roverSystem.execute();

        assertEquals("3 2 E ALIVE", roverSystem.toString());
    }

}
