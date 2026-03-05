# Rock Paper Scissors

A clean, object-oriented implementation of the classic Rock Paper Scissors game in Java with comprehensive unit tests.

## Quick Start

```bash
# Build and run the game
mvn clean compile exec:java -Dexec.mainClass="rps.RockPaperScissors"

# Run all tests
mvn clean test

# View test coverage report
mvn clean test jacoco:report && open target/site/jacoco/index.html
```

## How to Build

```bash
cd /Users/giorgigoguadze/eclipse-workspace/test
mkdir -p out
javac -d out $(find src -name '*.java')
```

## How to Run

### Automated Tournament (100 rounds)
```bash
java -cp out rps.RockPaperScissors
```
This runs 100 rounds between AutoPaper (always plays paper) and Computer (random moves), displaying final statistics.


## Game Rules

- **Rock** beats Scissors
- **Paper** beats Rock
- **Scissors** beats Paper
- Same moves result in a Draw


### Player Implementations

**Computer**: Random AI opponent. Uses `Move.randomMove()` for each decision.

**AutoPaper**: Deterministic player always playing paper. 

## Example Output

```
Mar 05, 2026 4:49:55 PM rps.RockPaperScissors main
INFO: Results after 100 Rounds:
-------------------------
Player A (always Paper): 39 wins
Player B (Random):       29 wins
Draws:                   32
```

## Unit Tests

This project includes **33 comprehensive unit tests** using JUnit 5:

- **MoveTest** (10 tests): Parsing, validation, and random selection
- **GameRulesTest** (10 tests): All game rules and win conditions
- **ScoreboardTest** (7 tests): Score tracking and accumulation
- **ComputerTest** (3 tests): Random AI move generation
- **AutoPaperTest** (3 tests): Deterministic test strategy

**Test Results**: All 33 tests pass with 0 failures and 0 errors.

### Running Tests

```bash
# Run all tests
mvn clean test

# Run specific test class
mvn test -Dtest=MoveTest

# Run with coverage report
mvn clean test jacoco:report
```

For detailed test documentation, see [TESTING.md](TESTING.md).

## Project Structure

```
src/
├── main/java/rps/
│   ├── Move.java
│   ├── Player.java
│   ├── GameRules.java
│   ├── Scoreboard.java
│   ├── RockPaperScissors.java
│   └── players/
│       ├── User.java
│       ├── Computer.java
│       └── AutoPaper.java
│
└── test/java/rps/
    ├── MoveTest.java
    ├── GameRulesTest.java
    ├── ScoreboardTest.java
    └── players/
        ├── ComputerTest.java
        └── AutoPaperTest.java
```

## Example Output

```
Mar 05, 2026 4:49:55 PM rps.RockPaperScissors main
INFO: Results after 100 Rounds:
-------------------------
Player A (always Paper): 39 wins
Player B (Random):       29 wins
Draws:                   32
```

