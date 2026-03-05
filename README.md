# Rock Paper Scissors

An easy, object-oriented implementation of the classic Rock Paper Scissors game in Java.


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

