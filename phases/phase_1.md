# Phase 1: Single Rover (Safe Plateau)

**Requirements**

- Single rover
- Plateau is fixed and infinite-safe (no boundaries enforced)
- Rover supports:
  - N, S, E, W → direction changes
  - F → move forward

**Input Format**
```text
1 5 N
NFFSFEFFFW
```
- Line 1: x y direction
- Line 2: instruction string

**Expected Behavior**
- Rover moves correctly
- No boundary checks required