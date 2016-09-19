package sample;

import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.awt.Event.*;
import java.lang.String;

public class Controller implements Initializable {
    @FXML
    private Button Bubble;
    @FXML
    private Label LabelA;
    @FXML
    private Label LabelC;
    @FXML
    private Label LabelB;
    @FXML
    private TextField userInput;
    @FXML
    private Button minMax;
    @FXML
    private Button reverse;
    @FXML
    private Button submit;
    @FXML
    private Button MinMax2;

    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert Bubble != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";

        submit.setOnAction((event) -> {
            LabelA.setText(userInput.getText());
            LabelB.setText(userInput.getText());
            LabelC.setText(userInput.getText());
        });

        Bubble.setOnAction((event) -> {
            String output = "";
            String input = userInput.getText();
            String[] numbers = input.split(" ");
            int [] unsorted = new int[numbers.length];

            for (int i = 0;i < numbers.length; i++) {
                unsorted[i] = Integer.parseInt(numbers[i]);
            }
            bubblesort(unsorted);

            for (int s : unsorted){
                output += s + " ";
            }
            LabelA.setText(output);
        });

        minMax.setOnAction((event) -> {
            String output = "";
            String input = userInput.getText();
            String[] numbers = input.split(" ");
            int [] unsorted = new int[numbers.length];

            for (int i = 0;i < numbers.length; i++) {
                unsorted[i] = Integer.parseInt(numbers[i]);
            }
            output += minMax(0,unsorted);
            LabelB.setText(output);
        });
        MinMax2.setOnAction((event) -> {
            String output = "";
            String input = userInput.getText();
            String[] numbers = input.split(" ");
            int [] unsorted = new int[numbers.length];

            for (int i = 0;i < numbers.length; i++) {
                unsorted[i] = Integer.parseInt(numbers[i]);
            }
            output += minMax(1,unsorted);
            LabelB.setText(output);
        });

        reverse.setOnAction((event)->{
            String output = "";
            String input = userInput.getText();
            String[] numbers = input.split(" ");
            int [] unsorted = new int[numbers.length];

            for (int i = 0;i < numbers.length; i++) {
                unsorted[i] = Integer.parseInt(numbers[i]);
            }
            reverse(unsorted,numbers);
            for (int s : unsorted){
                output += s + " ";
            }
            LabelC.setText(output);
        });
    }

    private static void bubblesort(int[] a) {
        int var;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    var = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = var;
                }
            }
        }
        for (double f : a) {
            System.out.print(f + " ");
        }
    }
    private static int minMax(int flag, int[] a) {
        if (flag == 0) {
            int var = 100000;
            for (int i = 0; i < a.length; i++) {
                if (var > a[i]) {
                    var = a[i];
                }
            }
            return var;
        }
        if (flag == 1) {
            int var = 0;
            for (int i = 0; i < a.length; i++) {
                if (var < a[i]) {
                    var = a[i];
                }
            }
            return var;
        } else {
            return 0;
        }
    }
    private static void reverse(int[] array, String[] numbers){
        int a = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbers[array.length - a ]);
            a++;
        }
        for(int e : array){
            System.out.print(e + " ");
        }
    }
}
