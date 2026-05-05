package com.tw.step.rover.rover;

import com.tw.step.rover.boundary.Boundary;
import com.tw.step.rover.position.Navigator;

public interface RoverState {
    RoverState turnLeft(Navigator navigator, Boundary boundary);

    RoverState turnRight(Navigator navigator, Boundary boundary);

    RoverState move(Navigator navigator, Boundary boundary);
    RoverStatus status();
}
