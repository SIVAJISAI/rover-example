# Mars Rover Assignment (Java, Test-Driven, Multi-Phase)
Design and implement a Mars Rover simulation system in Java, evolving over multiple phases.

**The system must:**
- Be fully test-driven (no stdin / console input)
- Use clean architecture & abstractions
- Support extensibility without breaking existing code
- Be driven by a single input string

**Core Expectations (All Phases)**
- No direct main logic — everything driven via unit tests
- Use OO design principles
- Separate:
  - Parsing
  - Domain logic
  - Execution engine
- Avoid primitive obsession (use value objects, enums etc)
- Prefer immutability where possible
- Write comprehensive tests first

**Suggested Domain Model (Evolving)**
You are free to design, but a strong solution will likely include:

- Position (x, y)
- Direction (N, S, E, W)
- Rover
- Plateau
- Instruction
- CommandExecutor
- InputParser

**Entry Point (All Phases)**
```java
String input = "...";
RoverSystem system = new RoverSystem();
system.execute(input);
```
Return value can be:
- Final rover state(s)
- Or domain objects used in assertions

