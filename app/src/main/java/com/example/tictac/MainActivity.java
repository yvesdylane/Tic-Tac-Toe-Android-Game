package com.example.tictac;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Enables edge-to-edge display and applies window insets
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // Adjusts padding for system bars (like status and navigation bars)
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Method to check if all buttons are filled
    public boolean checkFull(){
        List<Button> buttons = new ArrayList<>();
        // Add all buttons to the list
        buttons.add(findViewById(R.id.btn1));
        buttons.add(findViewById(R.id.btn2));
        buttons.add(findViewById(R.id.btn3));
        buttons.add(findViewById(R.id.btn4));
        buttons.add(findViewById(R.id.btn5));
        buttons.add(findViewById(R.id.btn6));
        buttons.add(findViewById(R.id.btn7));
        buttons.add(findViewById(R.id.btn8));
        buttons.add(findViewById(R.id.btn9));

        // Check if any button still has a blank space
        for (Button button : buttons){
            if(button.getText().toString().equals(" ")){
                return false; // Board is not full
            }
        }
        return true; // All buttons are filled
    }

    // Method to reset the board (clear all buttons)
    public void reset(){
        List<Button> buttons = new ArrayList<>();
        // Add all buttons to the list
        buttons.add(findViewById(R.id.btn1));
        buttons.add(findViewById(R.id.btn2));
        buttons.add(findViewById(R.id.btn3));
        buttons.add(findViewById(R.id.btn4));
        buttons.add(findViewById(R.id.btn5));
        buttons.add(findViewById(R.id.btn6));
        buttons.add(findViewById(R.id.btn7));
        buttons.add(findViewById(R.id.btn8));
        buttons.add(findViewById(R.id.btn9));

        // Set each button text to blank (reset)
        for (Button button : buttons){
            button.setText(" ");
        }
    }

    // Method to check if there is a winner
    public boolean win(){
        // Get references to the buttons
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn9);
        Button btn3 = findViewById(R.id.btn8);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn3);
        Button btn6 = findViewById(R.id.btn2);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn6);
        Button btn9 = findViewById(R.id.btn5);

        // Get the text from each button (X or O)
        String b1T = btn1.getText().toString();
        String b2T = btn2.getText().toString();
        String b3T = btn3.getText().toString();
        String b4T = btn4.getText().toString();
        String b5T = btn5.getText().toString();
        String b6T = btn6.getText().toString();
        String b7T = btn7.getText().toString();
        String b8T = btn8.getText().toString();
        String b9T = btn9.getText().toString();

        // Check rows for a win
        if(b1T.equals(b2T) && b2T.equals(b3T) && !b1T.equals(" ")){
            return true;
        } else if (b4T.equals(b5T) && b5T.equals(b6T) && !b4T.equals(" ")) {
            return true;
        }else if (b7T.equals(b8T) && b8T.equals(b9T) && !b7T.equals(" ")){
            return true;
        }

        // Check columns for a win
        if(b1T.equals(b4T) && b4T.equals(b7T) && !b1T.equals(" ")){
            return true;
        } else if (b2T.equals(b5T) && b5T.equals(b8T) && !b2T.equals(" ")) {
            return true;
        }else if (b3T.equals(b6T) && b6T.equals(b9T) && !b3T.equals(" ")){
            return true;
        }

        // Check diagonals for a win
        if(b1T.equals(b5T) && b5T.equals(b9T) && !b1T.equals(" ")){
            return true;
        } else if (b3T.equals(b5T) && b5T.equals(b7T) && !b3T.equals(" ")) {
            return true;
        }

        return false; // No winner
    }

    @SuppressLint("SetTextI18n")
    // Method called when a button is clicked, changes the button text to X or O
    public void changeText(View view){
        int id = view.getId(); // Get the id of the clicked button
        Button button = findViewById(id); // Get the button using the id

        // If the button is blank, we update its text
        if(button.getText().equals(" ")) {
            TextView player = findViewById(R.id.textView); // Get the TextView displaying the current player
            TextView symbole = findViewById(R.id.textView2); // Get the TextView displaying the current symbol (X or O)

            // Set the clicked button's text to the current player's symbol (X or O)
            button.setText(symbole.getText().toString());

            // Create an AlertDialog to show messages (win, draw)
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if(win()){
                // If there's a winner, show a dialog and reset the board
                builder.setMessage(player.getText().toString() + " won");
                AlertDialog dialog = builder.create();
                dialog.show();
                reset();
            } else if (checkFull()) {
                // If the board is full with no winner, show a draw message
                builder.setMessage("NO WINNER!!!!!");
                AlertDialog dialog = builder.create();
                dialog.show();
                reset();
            }

            // Toggle between Player 1 and Player 2
            if (player.getText().equals("Player 1")) {
                player.setText("Player 2");
                symbole.setText("O"); // Change symbol to O
            } else {
                player.setText("Player 1");
                symbole.setText("X"); // Change symbol to X
            }
        }
    }
}
