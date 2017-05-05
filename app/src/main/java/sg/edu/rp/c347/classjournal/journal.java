package sg.edu.rp.c347.classjournal;

import java.io.Serializable;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class journal implements Serializable {
    // Create the attributes for your class
    private String week;
    private char dg;

// Create the constructor to give your 	attributes values

    public journal(String week, char dg) {
        this.week = week;
        this.dg = dg;
    }

    //generate getter
    public String getWeek() {
        return week;
    }

    //generate getter
    public char getDg() {
        return dg;
    }

    //generate setter
    public void setWeek(String week) {
        this.week = week;
    }

    public void setDg(char dg) {
        this.dg = dg;
    }
}
