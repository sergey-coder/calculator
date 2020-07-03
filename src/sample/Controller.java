package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Controller {
    public Button one;
    public TextArea resultField;
    public Button four;
    public Button seven;
    public Button zero;
    public Button six;
    public Button five;
    public Button two;
    public Button eight;
    public Button three;
    public Button nine;
    public Button divide;
    public Button multiply;
    public Button minus;
    public Button equal;
    public Button plus;
    public Button point;

    StringBuilder veiwDisplay = new StringBuilder();
    public Button delit;
    public Button Armagedon;


    public void clicMouseone(MouseEvent mouseEvent) {
        veiwDisplay.append("1");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousethree(MouseEvent mouseEvent) {

        veiwDisplay.append("3");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMouseeight(MouseEvent mouseEvent) {

        veiwDisplay.append("8");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousetw(MouseEvent mouseEvent) {

        veiwDisplay.append("2");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousefive(MouseEvent mouseEvent) {

        veiwDisplay.append("5");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousesix(MouseEvent mouseEvent) {

        veiwDisplay.append("6");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousezero(MouseEvent mouseEvent) {

        veiwDisplay.append("0");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMouseseven(MouseEvent mouseEvent) {

        veiwDisplay.append("7");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousefour(MouseEvent mouseEvent) {

        veiwDisplay.append("4");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousenine(MouseEvent mouseEvent) {

        veiwDisplay.append("9");
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousedivide(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            veiwDisplay.append("/");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousemultiply(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            veiwDisplay.append("*");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseminus(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            veiwDisplay.append("-");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseequal(MouseEvent mouseEvent) {
        double rezult= 1.00;
        resultField.clear();
        String[] mult = veiwDisplay.toString().split("\\*");
        for(String listInt : mult){
            if(!listInt.contains("."))listInt=listInt + ".00";
            rezult *= Double.parseDouble(listInt);
        }
        if(rezult - (int)rezult !=0) {
            resultField.setText(String.valueOf(rezult));
        }else if(veiwDisplay==null || veiwDisplay.length()==0) {
            resultField.setText("");
        }else   resultField.setText(String.valueOf((int)rezult));
        veiwDisplay.delete(0,veiwDisplay.length());
        //veiwDisplay.delete(0,veiwDisplay.length());
       /* int result =0;
        String[] test = veiwDisplay.toString().split("\\*");
        for(String list: test){
            if(result==0){
                result = Integer.parseInt(list);
            }else{
                result *= Integer.parseInt(list);
            }

        }*/
        /*Integer resmult = 1;
        ArrayList<Integer> arrayResmult = new ArrayList<>();
        ArrayList<Integer> arrayResmult2 = new ArrayList<>();
        ArrayList<Integer> arrayResmult3 = new ArrayList<>();
        String[] minus = veiwDisplay.toString().split("\\-");
        for(String list: minus){
            String[] plus = veiwDisplay.toString().split("\\+");
            for(String list2: plus){
                String[] div = veiwDisplay.toString().split("\\/");
                for(String list3: div){
                    String[] mult = veiwDisplay.toString().split("\\*");
                    resmult = 1;
                    for(String list4: mult){
                       resmult = resmult * Integer.valueOf(list4);
                    }
                    arrayResmult.add(resmult);
                }
                resmult = 1;
                int correct = 1;
                for(Integer listdiv: arrayResmult){
                    resmult = resmult/listdiv;
                    if (correct==1){
                        correct=listdiv;
                        resmult=listdiv;
                    }
                }
                arrayResmult2.add(resmult);
            }
            resmult = 0;

            for(Integer listdiv: arrayResmult2){
                resmult = resmult+listdiv;
            }
            arrayResmult3.add(resmult);
        }
        resmult = 0;

        for(Integer listdiv: arrayResmult3){
            resmult = resmult-listdiv;
        }

        veiwDisplay.delete(0,veiwDisplay.length());
        veiwDisplay.append(resmult);
        resultField.setText(veiwDisplay.toString());*/
    }

    public void clicMouseplus(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            veiwDisplay.append("+");
            resultField.setText(veiwDisplay.toString());
        }

    }

    public void clicMousedelit(MouseEvent mouseEvent) {
        veiwDisplay.deleteCharAt(veiwDisplay.length()-1);
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMouseArmagedon(MouseEvent mouseEvent) {
        veiwDisplay.delete(0,veiwDisplay.length());
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousePoint(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            veiwDisplay.append(".");
            resultField.setText(veiwDisplay.toString());
        }
    }

    private boolean chekChar(StringBuilder veiwDisplay){
        if(veiwDisplay!=null && veiwDisplay.length()!=0 && veiwDisplay.charAt(veiwDisplay.length()-1)!='+' && veiwDisplay.charAt(veiwDisplay.length()-1)!='-' && veiwDisplay.charAt(veiwDisplay.length()-1)!='*' && veiwDisplay.charAt(veiwDisplay.length()-1)!='/'){
            return true;
        } else return false;
    }
}
