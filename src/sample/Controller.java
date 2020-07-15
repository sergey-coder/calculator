package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
// тесты -
// знак -+ реализация
// если сразу поле = нажать кнопку то =.
// порядок выполнения действий математических    слева напрво кто первый
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

    public void clicMousezero(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'0');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'0');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'0');
            veiwDisplay.append("0");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseone(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'1');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'1');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'1');
            veiwDisplay.append("1");
            resultField.setText(veiwDisplay.toString());
        }

    }

    public void clicMousetwo(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'2');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'2');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'2');
            veiwDisplay.append("2");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousethree(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'3');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'3');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'3');
            veiwDisplay.append("3");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousefour(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'4');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'4');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'4');
            veiwDisplay.append("4");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousefive(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'5');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'5');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'5');
            veiwDisplay.append("5");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousesix(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'6');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'6');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'6');
            veiwDisplay.append("6");
            resultField.setText(veiwDisplay.toString());
        }
    }



    public void clicMouseseven(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'7');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'7');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'7');
            veiwDisplay.append("7");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseeight(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'8');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'8');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'8');
            veiwDisplay.append("8");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousenine(MouseEvent mouseEvent) {
        if(chekNullStartStrint(veiwDisplay)){
            delEqual(veiwDisplay,'9');
            veiwDisplay.setCharAt(veiwDisplay.length()-1,'9');
            resultField.setText(veiwDisplay.toString());
        }else{
            delEqual(veiwDisplay,'9');
            veiwDisplay.append("9");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousedivide(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            delEqual(veiwDisplay,'/');
            deleteExcessNull(veiwDisplay);
            veiwDisplay.append("/");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMousemultiply(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            delEqual(veiwDisplay,'*');
            deleteExcessNull(veiwDisplay);
            veiwDisplay.append("*");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseminus(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            delEqual(veiwDisplay,'-');
            deleteExcessNull(veiwDisplay);
            veiwDisplay.append("-");
            resultField.setText(veiwDisplay.toString());
        }
    }

    public void clicMouseequal(MouseEvent mouseEvent) {
        String correctString = veiwDisplay.toString();

        checkFirstOccurrenceSymbol(correctString);
        //получить первый входящий символ, выделить числа с данным символом, совершить арифметическое действие, заменить в билдере выражение на результат

        if(chekChar(veiwDisplay) && veiwDisplay.charAt(veiwDisplay.length()-1)!='='){
            resultField.clear();

            ArrayList<Double> rezult = new ArrayList();
            String[] mult = veiwDisplay.toString().split("/");
            for (String list : mult){
                double rezultMultiplay = multiplay(list);
                rezult.add(rezultMultiplay);
            }
            double rezultMultiplay = divide(rezult);

            if(rezultMultiplay - (int)rezultMultiplay !=0) {
                resultField.setText(String.valueOf(rezultMultiplay));
                veiwDisplay.delete(0,veiwDisplay.length());
                veiwDisplay.append(rezultMultiplay);
                veiwDisplay.append("=");
            }else if(veiwDisplay==null || veiwDisplay.length()==0) {
                resultField.setText("");
            }else {
                resultField.setText(String.valueOf((int)rezultMultiplay));
                veiwDisplay.delete(0,veiwDisplay.length());
                veiwDisplay.append(String.valueOf((int)rezultMultiplay));
                veiwDisplay.append("=");
            }
        }
    }

    private char checkFirstOccurrenceSymbol(String veiwDisplay){
        int char1 = veiwDisplay.toString().indexOf('*');
        int char2 = veiwDisplay.toString().indexOf('/');
        int char3 = veiwDisplay.toString().indexOf('+');
        int char4 = veiwDisplay.toString().indexOf('-');

        if(char1==-1 && char2!=-1) return '/';
        if(char1!=-1 && char2==-1) return '*';
        if((char1!=-1 && char2 !=-1)){
            if(char1 < char2) return '*';
            if(char1 > char2) return '/';
        }

        if(char1==-1 && char2==-1){
            if(char3==-1 && char4!=-1) return '-';
            if(char3!=-1 && char4==-1) return '+';
            if((char3!=-1 && char4 !=-1)){
                if(char3 < char4) return '+';
                if(char3 > char4) return '-';
            }
        }
        return '!';
    }

    private double divide(ArrayList<Double> rezuilt){

        Double firstNumber= rezuilt.get(0);
        double rezult=rezuilt.get(0);

        for(Double listInt : rezuilt){
                if(listInt!=firstNumber) rezult /= listInt;
            }
        return rezult;
    }
    private double multiplay(String list){
        double rezult= 1.00;
        String[] mult = list.split("\\*");
        for(String listInt : mult){
            if(!listInt.contains("."))listInt=listInt + ".00";
            rezult *= Double.parseDouble(listInt);
        }
        return rezult;
    }

    public void clicMouseplus(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)){
            delEqual(veiwDisplay,'+');
            deleteExcessNull(veiwDisplay);
            veiwDisplay.append("+");
            resultField.setText(veiwDisplay.toString());
        }

    }

    public void clicMousedelit(MouseEvent mouseEvent) {
        if(veiwDisplay.length()!=0){
            veiwDisplay.deleteCharAt(veiwDisplay.length()-1);
            resultField.setText(veiwDisplay.toString());
        }

    }

    public void clicMouseArmagedon(MouseEvent mouseEvent) {
        veiwDisplay.delete(0,veiwDisplay.length());
        resultField.setText(veiwDisplay.toString());
    }

    public void clicMousePoint(MouseEvent mouseEvent) {
        if(chekChar(veiwDisplay)&&chekPoint(veiwDisplay)){
            veiwDisplay.append(".");
            resultField.setText(veiwDisplay.toString());
        }
    }
// блок проверок
    private boolean chekChar(StringBuilder veiwDisplay){
        if(veiwDisplay!=null && veiwDisplay.length()!=0 && veiwDisplay.charAt(veiwDisplay.length()-1)!='+' && veiwDisplay.charAt(veiwDisplay.length()-1)!='-' && veiwDisplay.charAt(veiwDisplay.length()-1)!='*' && veiwDisplay.charAt(veiwDisplay.length()-1)!='/'&& veiwDisplay.charAt(veiwDisplay.length()-1)!='.'){
            return true;
        } else return false;
    }

    private boolean chekPoint(StringBuilder veiwDisplay){
        String[] mult = veiwDisplay.toString().split("\\*|-|/|\\+");
        if(!mult[mult.length-1].contains(".")){
            return true;
        } else return false;
    }
//не дает делать с начала более одного нуля
    private boolean chekNull(StringBuilder veiwDisplay){
        String[] mult = veiwDisplay.toString().split("\\*|-|/|\\+");
        if(mult[mult.length-1].length()==1 && mult[mult.length-1].charAt(0)=='0'){
            return false;
        } else return true;
    }
    // заменяет первый ноль на следующее за ним число
    private boolean chekNullStartStrint(StringBuilder veiwDisplay){
        String[] mult = veiwDisplay.toString().split("\\*|-|/|\\+");
        if(mult[mult.length-1].length()==1 && mult[mult.length-1].charAt(0)=='0'){
            return true;
        } else return false;
    }

    //удаление лишний нулей с числах с .
    private StringBuilder deleteExcessNull(StringBuilder veiwDisplay){
        String[] mult = veiwDisplay.toString().split("\\*|-|/|\\+");
        if(mult[mult.length-1].contains(".")){
            int i = mult[mult.length-1].length()-1;
            String str  = mult[mult.length-1];
            while (str.charAt(i)=='0'){
               str = str.substring(0,i);
               veiwDisplay.deleteCharAt(veiwDisplay.length()-1);
               i--;
               if(str.charAt(i)=='.' ){
                   veiwDisplay.deleteCharAt(veiwDisplay.length()-1);
                   break;
               }
            }

        }
        return veiwDisplay;
    }
    private void delEqual(StringBuilder veiwDisplay, char enterChar){
        if(veiwDisplay.length()!=0 && veiwDisplay.charAt(veiwDisplay.length()-1)=='=' && (enterChar == '*' ||enterChar == '/' ||enterChar == '+' || enterChar == '-' )){
            veiwDisplay.deleteCharAt(veiwDisplay.length()-1);
        }else if(veiwDisplay.length()!=0&&veiwDisplay.charAt(veiwDisplay.length()-1)=='='){
            veiwDisplay.delete(0,veiwDisplay.length());
        }
    }
}
