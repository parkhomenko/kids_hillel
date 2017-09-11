package com.hillel.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

  // Для хранения промежуточных значений работы калькулятора,
  // используйте следующие переменные
  private int op1 = 0;
  private int op2 = 0;

  // Для хранения результата, используйте переменную result
  private int result = 0;

  @Override
  public void start(Stage window) throws Exception {

    // Поле ввода числа
    TextField textField = new TextField("0");
    textField.setAlignment(Pos.CENTER_RIGHT); // Текст в поле будет справа
    textField.setPrefSize(200, 50);

    // Кнопки верхней строчки калькулятора
    Button clear = new Button("C");
    clear.setPrefSize(50, 50);
    Button percent = new Button("%");
    percent.setPrefSize(50, 50);
    Button plusMinus = new Button("+/-");
    plusMinus.setPrefSize(50, 50);

    // Кнопки действий
    Button division = new Button("/");
    division.setPrefSize(50, 50);
    Button multiplication = new Button("*");
    multiplication.setPrefSize(50, 50);
    Button subtraction = new Button("-");
    subtraction.setPrefSize(50, 50);
    Button addition = new Button("+");
    addition.setPrefSize(50, 50);
    Button calculation = new Button("=");
    calculation.setPrefSize(50, 50);

    // Кнопки цифр
    Button zero = new Button("0");
    zero.setPrefSize(100, 50);
    Button point = new Button(".");
    point.setPrefSize(50, 50);
    Button one = new Button("1");
    one.setPrefSize(50, 50);
    Button two = new Button("2");
    two.setPrefSize(50, 50);
    Button three = new Button("3");
    three.setPrefSize(50, 50);
    Button four = new Button("4");
    four.setPrefSize(50, 50);
    Button five = new Button("5");
    five.setPrefSize(50, 50);
    Button six = new Button("6");
    six.setPrefSize(50, 50);
    Button seven = new Button("7");
    seven.setPrefSize(50, 50);
    Button eight = new Button("8");
    eight.setPrefSize(50, 50);
    Button nine = new Button("9");
    nine.setPrefSize(50, 50);

    // Таблица для расположения кнопок
    GridPane gridPane = new GridPane();

    gridPane.add(textField, 0, 0); // сначала колонка, а потом строка
    GridPane.setColumnSpan(textField, 4); // текстовое поле растянуто на 4 колонки

    gridPane.add(clear, 0, 1);
    gridPane.add(percent, 1, 1);
    gridPane.add(plusMinus, 2, 1);

    gridPane.add(division, 3, 1);
    gridPane.add(multiplication, 3, 2);
    gridPane.add(subtraction, 3, 3);
    gridPane.add(addition, 3, 4);
    gridPane.add(calculation, 3, 5);

    gridPane.add(zero, 0, 5);
    GridPane.setColumnSpan(zero, 2);
    gridPane.add(point, 2, 5);
    gridPane.add(one, 0, 4);
    gridPane.add(two, 1, 4);
    gridPane.add(three, 2, 4);
    gridPane.add(four, 0, 3);
    gridPane.add(five, 1, 3);
    gridPane.add(six, 2, 3);
    gridPane.add(seven, 0, 2);
    gridPane.add(eight, 1, 2);
    gridPane.add(nine, 2, 2);

    // Всё что внутри метода handle выполнится, когда
    // пользователь нажмет на копку 1.
    // Вы можете добавлять такие события и для других кнопок.
    // Здесь в качестве примера появляется новое окно с сообщением.
    // Вам нужно добавить в текстовое поле значение 1, чтобы
    // калькулятор начал работать.
    one.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION, "Вы нажали на кнопку 1", ButtonType.OK);
        alert.show();
      }
    });

    // Создаем сцену, в которую помещаем нашу таблицу с кнопками
    Scene scene = new Scene(gridPane);

    // Добавляем сцену в окно
    window.setScene(scene);

    window.setTitle("Calculator");
    //window.setWidth(500);
    //window.setHeight(750);
    window.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
