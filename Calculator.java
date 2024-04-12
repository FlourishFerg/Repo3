
package com.example.newjava;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Calculator extends Application{

    TextField screen;
    Button btn1,btn2, btn3, btn4, btn5, btn6,
            btn7,btn8,btn9,btn0,btnPlus,btnMinus,
            btnDivide,btnMultiply,btnModulus,
            btnSquare,btnEquals,btnClear,
            btnBackSpace,btnDot,btnSqrt,btnExponential,btnDisable;
    double num1, num2;
    String operation;
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        screen = new TextField();
        screen.setPrefHeight(80);
        screen.setId("calculator-screen");

        btn1 = new Button("1");
        btn1.setPrefHeight(80);
        btn1.setPrefWidth(80);
        btn1.setOnAction(e->{

//            screen.setText(screen.getText()+btn1.getText());
            screen.appendText(btn1.getText());
        });

        btn2 = new Button("2");
        btn2.setPrefHeight(80);
        btn2.setPrefWidth(80);
        btn2.setOnAction(e-> {
            screen.appendText(btn2.getText());
        });

        btn3 = new Button("3");
        btn3.setPrefHeight(80);
        btn3.setPrefWidth(80);
        btn3.setOnAction(e->{
            screen.appendText(btn3.getText());
        });

        btn4 = new Button("4");
        btn4.setPrefHeight(80);
        btn4.setPrefWidth(80);
        btn4.setOnAction(e->{
            screen.appendText(btn4.getText());
        });

        btn5 = new Button("5");
        btn5.setPrefHeight(80);
        btn5.setPrefWidth(80);
        btn5.setOnAction(e->{
            screen.appendText(btn5.getText());
        });

        btn6 = new Button("6");
        btn6.setPrefHeight(80);
        btn6.setPrefWidth(80);
        btn6.setOnAction(e->{
            screen.appendText(btn6.getText());
        });

        btn7 = new Button("7");
        btn7.setPrefHeight(80);
        btn7.setPrefWidth(80);
        btn7.setOnAction(e->{
            screen.appendText(btn7.getText());
        });

        btn8 = new Button("8");
        btn8.setPrefHeight(80);
        btn8.setPrefWidth(80);
        btn8.setOnAction(e->{
            screen.appendText(btn8.getText());
        });

        btn9 = new Button("9");
        btn9.setPrefHeight(80);
        btn9.setPrefWidth(80);
        btn9.setOnAction(e->{
            screen.appendText(btn9.getText());
        });

        btn0 = new Button("0");
        btn0.setPrefHeight(80);
        btn0.setPrefWidth(170);
        btn0.setOnAction(e->{
            screen.appendText(btn0.getText());
        });

        btnPlus = new Button("+");
        btnPlus.setPrefHeight(80);
        btnPlus.setPrefWidth(80);
        btnPlus.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                num1 = Double.parseDouble(screen.getText());
                screen.setText("");
                operation = "+";
            }
        });

        btnMinus = new Button("-");
        btnMinus.setPrefHeight(80);
        btnMinus.setPrefWidth(80);
        btnMinus.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                num1 = Double.parseDouble(screen.getText());
                screen.setText("");
                operation = "-";
            }
        });

        btnMultiply = new Button("*");
        btnMultiply.setPrefHeight(80);
        btnMultiply.setPrefWidth(80);
        btnMultiply.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                num1 = Double.parseDouble(screen.getText());
                screen.setText("");
                operation = "*";
            }
        });

        btnDivide = new Button("/");
        btnDivide.setPrefHeight(80);
        btnDivide.setPrefWidth(80);
        btnDivide.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                num1 = Double.parseDouble(screen.getText());
                screen.setText("");
                operation = "/";
            }
        });

        btnClear = new Button("AC");
        btnClear.setPrefHeight(80);
        btnClear.setPrefWidth(80);
        btnClear.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                screen.setText("");
            }
        });

        btnBackSpace = new Button("<=");
        btnBackSpace.setPrefHeight(80);
        btnBackSpace.setPrefWidth(80);
        btnBackSpace.setOnAction(e->{
            if(!screen.getText().isEmpty()) {
                String currentScreen = screen.getText();
                screen.setText(currentScreen.substring(0, currentScreen.length() - 1));
            }
        });

        btnDot = new Button(".");
        btnDot.setPrefHeight(80);
        btnDot.setPrefWidth(80);
        btnDot.setOnAction(e->{
            if(!screen.getText().contains(".")) {
                screen.appendText(btnDot.getText());
            }
        });

        btnModulus = new Button("%");
        btnModulus.setPrefHeight(80);
        btnModulus.setPrefWidth(80);
        btnModulus.setOnAction(e->{
            num1 = Double.parseDouble(screen.getText());
            screen.setText("");
            operation = "%";
        });

        btnExponential = new Button("^");
        btnExponential.setPrefHeight(80);
        btnExponential.setPrefWidth(80);
        btnExponential.setOnAction(e->{
            num1 = Double.parseDouble(screen.getText());
            screen.setText("");
            operation = "^";
        });

        btnSquare = new Button("^2");
        btnSquare.setPrefHeight(80);
        btnSquare.setPrefWidth(80);
        btnSquare.setOnAction(e->{
            num1 = Double.parseDouble(screen.getText());
            screen.setText(String.valueOf(num1*num1));
        });

        btnSqrt = new Button("sqrt");
        btnSqrt.setPrefHeight(80);
        btnSqrt.setPrefWidth(80);
        btnSqrt.setOnAction(e->{
            num1 = Double.parseDouble(screen.getText());
            double result = Math.sqrt(num1);
            screen.setText(String.valueOf(result));
        });
        btnDisable = new Button("Off");
        btnDisable.setPrefHeight(80);
        btnDisable.setPrefWidth(80);

        btnEquals = new Button("=");
        btnEquals.setPrefHeight(170);
        btnEquals.setPrefWidth(80);
        btnEquals.setStyle("-fx-background-color:blue; " +
                "-fx-text-fill:white;" +
                " -fx-font-size:35px;");
        btnEquals.setOnAction(e->{
            num2 = Double.parseDouble(screen.getText());
            double result;
            if(operation.equals("+")) {
                result = num1+num2;
                String screenResult = String.valueOf(result);
                if(screenResult.endsWith(".0")){
                    int intResult = (int) result;
                    screen.setText(String.valueOf(intResult));
                }else{
                    screen.setText(screenResult);
                }

            }
            else if(operation.equals("-")){
                result = num1-num2;
                String screenResult = String.valueOf(result);
                if(screenResult.endsWith(".0")){
                    int intResult = (int) result;
                    screen.setText(String.valueOf(intResult));
                }else{
                    screen.setText(screenResult);
                }
            }
            else if(operation.equals("%")){
                result = num1%num2;
                screen.setText(String.valueOf(result));
            }
            else if(operation.equals("*")){
                result = num1*num2;
                String screenResult = String.valueOf(result);
                if(screenResult.endsWith(".0")){
                    int intResult = (int) result;
                    screen.setText(String.valueOf(intResult));
                }else{
                    screen.setText(screenResult);
                }
            }
            else if(operation.equals("/")){
                result = num1/num2;
                String screenResult = String.valueOf(result);
                if(screenResult.endsWith(".0")){
                    int intResult = (int) result;
                    screen.setText(String.valueOf(intResult));
                }else{
                    screen.setText(screenResult);
                }
            }

            else if(operation.equals("^")){
                result = Math.pow(num1,num2);
                String screenResult = String.valueOf(result);
                if(screenResult.endsWith(".0")){
                    int intResult = (int) result;
                    screen.setText(String.valueOf(intResult));
                }else{
                    screen.setText(screenResult);
                }
            }
        });



        Button btnCloseWindow = new Button("X");
        btnCloseWindow.setId("close-window-button");
        btnCloseWindow.setOnAction(e->{
            stage.close();
        });


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);

        grid.add(btnCloseWindow,0,1,5,1);
        GridPane.setHalignment(btnCloseWindow, HPos.RIGHT);
        GridPane.setValignment(btnCloseWindow, VPos.TOP);

        grid.add(screen,0,2,5,1);
        grid.addRow(3,btnClear,btnSquare,btnSqrt,btnModulus,btnBackSpace);
        grid.addRow(4,btn7,btn8,btn9,btnMinus,btnMultiply);
        grid.addRow(5,btn4,btn5,btn6,btnPlus,btnDivide);
        grid.addRow(6,btn1,btn2,btn3,btnExponential);
        grid.addRow(7,btnDisable);
        grid.add(btn0,2,7,2,1);
        grid.add(btnDot,1,7);
        grid.add(btnEquals,4,6,1,2);



        Scene scene = new Scene(grid,550,700);
        scene.getStylesheets()
                .add(getClass()
                        .getResource("CalculatorStyle.css")
                        .toExternalForm());
        stage.setScene(scene);
        stage.setTitle("My Simple Calculator");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

}
