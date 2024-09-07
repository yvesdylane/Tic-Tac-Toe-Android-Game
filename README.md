Tic-Tac-Toe Android Game
Welcome to Tic-Tac-Toe, a classic two-player strategy game built for Android! In this turn-based game, players alternate marking X’s and O’s on a 3x3 grid, with the goal of securing three marks in a row before their opponent.

🕹️ Game Overview
Tic-Tac-Toe is a simple, yet exciting turn-based game that requires players to employ strategy and tactical moves to win. Whether you are Player 1 (X) or Player 2 (O), you must think ahead and plan your moves to outsmart your opponent.

Key features include:

Two-player mode: Player 1 vs Player 2
Real-time turn switching: Switches between X and O automatically
Win detection: Rows, columns, and diagonals are all checked for a winner
Draw detection: If the grid is full and no winner, it's a draw!
Board reset: Instantly resets the board after a win or draw
🛠️ Installation
To play the game on your Android device, follow these steps:

Clone the repository:
bash
Copy code
git clone [https://github.com/your-repo/tictactoe.git](https://github.com/yvesdylane/Tic-Tac-Toe-Android-Game.git)
Open the project in Android Studio.
Connect an Android device or launch an emulator.
Click Run to build and install the app on your device.

🎮 How to Play
Start the game: The game begins with Player 1 playing as "X".
Mark your move: Tap on any available cell on the 3x3 grid to mark your symbol (X or O).
Win conditions:
Secure three X’s or O’s in a row, either horizontally, vertically, or diagonally.
The game checks for a winning combination after each move.
End of the game: Once a player wins, a message displays the winner, and the game board is reset.
Draw: If all cells are filled and no player has won, the game declares a draw and resets automatically.
Alternate turns: Players alternate between turns. After Player 1 plays, the turn switches to Player 2 (O), and vice versa.

🧩 Game Mechanics
Turn-based mechanics: Players take turns marking their symbols on the grid.
Win Detection: Every time a symbol is placed, the game checks if there are three matching symbols in a row (horizontally, vertically, or diagonally).
Draw Mechanism: If all cells on the grid are occupied with no winning combination, the game detects a draw and resets the board for a new game.
UI Design: Simple and intuitive design with a clean and responsive UI.

🔧 Code Structure
MainActivity.java: The core logic of the game, where game state is managed, user input is handled, and win or draw conditions are evaluated.
Activity Layout (XML): Defines the layout of the 3x3 grid and the player status display.
Button Controls: Each button on the grid represents a cell, and tapping one triggers the player's move.

🎯 Game Objectives
Strategy: Players need to think ahead and block their opponent's moves while attempting to line up their own symbols.
Competitive gameplay: The game provides a competitive experience where two players battle it out for Tic-Tac-Toe supremacy!

🚀 Future Enhancements
In future updates, we aim to introduce new features, including:

Single-player mode: Play against an AI.
Difficulty settings: Challenge yourself with varying levels of AI difficulty.
Online Multiplayer: Play against friends or random opponents online.

🤝 Contribution
Contributions are welcome! Feel free to submit issues, feature requests, or pull requests to improve the game further.

Fork the repository.
Create a new branch for your feature:
bash
  git checkout -b feature-branch
Commit your changes:
bash
  git commit -m "Add new feature"
Push the branch:
bash
  git push origin feature-branch
Create a Pull Request.
📝 License
This project is licensed under the MIT License - see the LICENSE file for details.
