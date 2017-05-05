package sg.edu.rp.c347.classjournal;

import java.io.Serializable;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class journal implements Serializable {
    // Create the attributes for your class
    private String week;
    private String dg;

// Create the constructor to give your 	attributes values

    public journal(String week, String dg) {
        this.week = week;
        this.dg = dg;
    }

    //generate getter
    public String getWeek() {
        return week;
    }

    //generate getter
    public String getDg() {
        return dg;
    }

    //generate setter
    public void setWeek(String week) {
        this.week = week;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }
}
