package com.example.newjava;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class XandOGame extends Application implements EventHandler {
    public static void main(String[] args) {
        launch();
    }

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    int count = 0;

    @Override
    public void start(Stage stage) throws Exception {

        btn1 = new Button();
        btn1.setPrefWidth(100);
        btn1.setPrefHeight(100);
        btn1.setOnAction(this);


        btn2 = new Button();
        btn2.setPrefWidth(100);
        btn2.setPrefHeight(100);
        btn2.setOnAction(this);


        btn3 = new Button();
        btn3.setPrefWidth(100);
        btn3.setPrefHeight(100);
        btn3.setOnAction(this);


        btn4 = new Button();
        btn4.setPrefWidth(100);
        btn4.setPrefHeight(100);
        btn4.setOnAction(this);


        btn5 = new Button();
        btn5.setPrefWidth(100);
        btn5.setPrefHeight(100);
        btn5.setOnAction(this);


        btn6 = new Button();
        btn6.setPrefWidth(100);
        btn6.setPrefHeight(100);
        btn6.setOnAction(this);


        btn7 = new Button();
        btn7.setPrefWidth(100);
        btn7.setPrefHeight(100);
        btn7.setOnAction(this);


        btn8 = new Button();
        btn8.setPrefWidth(100);
        btn8.setPrefHeight(100);
        btn8.setOnAction(this);

        btn9 = new Button();
        btn9.setPrefWidth(100);
        btn9.setPrefHeight(100);
        btn9.setOnAction(this);

        GridPane grid = new GridPane();
        grid.addRow(1, btn1, btn2, btn3);
        grid.addRow(2, btn4, btn5, btn6);
        grid.addRow(3, btn7, btn8, btn9);

        BorderPane root = new BorderPane();
        root.setCenter(grid);
        Scene scene = new Scene(root, 300, 300);


        stage.setTitle("X and O Game");
        stage.show();
        stage.setScene(scene);


    }


    @Override
    public void handle(Event event) {
        Button clickedButton = (Button) event.getSource();
        if (isCountEven()) {
            clickedButton.setText("O");
            count++;
        } else {
            clickedButton.setText("X");
            count++;
        }
        if (checkWinCondition()) {
            String winner = isCountEven() ? "X" : "O";
            System.out.println("Player " + winner + " wins!");
            // Display a message indicating the winner
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game Over");
            alert.setHeaderText(null);
            alert.setContentText("Player " + winner + " wins!");
            alert.showAndWait();

        }
    }





    private boolean isCountEven() {
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkWinCondition() {
        String[][] board = new String[3][3];
        board[0][0] = btn1.getText();
        board[0][1] = btn2.getText();
        board[0][2] = btn3.getText();
        board[1][0] = btn4.getText();
        board[1][1] = btn5.getText();
        board[1][2] = btn6.getText();
        board[2][0] = btn7.getText();
        board[2][1] = btn8.getText();
        board[2][2] = btn9.getText();

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].isEmpty()) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]) && !board[0][i].isEmpty()) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].isEmpty()) ||
                (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].isEmpty())) {
            return true;
        }

        return false;
    }


}



