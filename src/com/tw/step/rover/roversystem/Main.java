package com.tw.step.rover.roversystem;

import com.tw.step.rover.boundary.Boundary;
import com.tw.step.rover.boundary.InfinitePlateau;
import com.tw.step.rover.commands.CommandCreator;
import com.tw.step.rover.position.Navigator;

import java.util.HashMap;

public class Main {
    static void main() {
        String text = """
1 5 N
LFFRFLFFFR                
                """;

        RoverSystemScanner scanner = RoverSystemScanner.from(text);
        Navigator navigator = Navigator.create();
        Boundary boundary = new InfinitePlateau();
        CommandCreator commandCreator = new CommandCreator();
        RoverSystemParser roverSystemParser = new RoverSystemParser(scanner, navigator, boundary, commandCreator);
        RoverSystem system = roverSystemParser.parse();
        system.execute();
        System.out.println(system);
    }
}
