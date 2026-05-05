package com.tw.step.rover.commands;

import com.tw.step.rover.boundary.Boundary;
import com.tw.step.rover.position.Navigator;

public class CommandCreator {
    public RoverCommand create(Character instruction, Navigator navigator, Boundary boundary) {
        switch (instruction) {
            case 'L': return new TurnLeftCommand(navigator, boundary);
            case 'R': return new TurnRightCommand(navigator, boundary);
            case 'F': return new MoveCommand(navigator, boundary);
        }
        return null;
    }
}
