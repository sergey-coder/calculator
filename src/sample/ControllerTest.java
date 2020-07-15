package sample;

import javafx.event.EventType;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest  {
    Controller cont = new Controller();
    StringBuilder veiwDisplay = new StringBuilder();


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void clicMouseequal() {
         String a,b,c,d;

        a="545.504*";
        b="54*";
        c="3345*";
        d="3";
        veiwDisplay.append(a);
        veiwDisplay.append(b);
        veiwDisplay.append(c);
        veiwDisplay.append(d);
        //cont.clicMouseequal();
        String rezultCal = "";
        String rezultTestVeiwDisplay = veiwDisplay.toString();
        //String rezultTestResultField = cont.resultField.getText();
        System.out.println("поле вейв = " + rezultTestVeiwDisplay);
        //System.out.println("поле resultField = " + rezultTestResultField);
    }


}