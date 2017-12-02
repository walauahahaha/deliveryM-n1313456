/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

/**
 *
 * @author walauahahaha
 */
public class scheOrderDA {
    private String scheID;
    private String name;
    private String rest;
    private String fb;
    private String dayWeek;
    private String period;
    private String dateF;
    private String dateT;
    private String tDur;
    private String ses;
    private String quant;

    public scheOrderDA(String scheID, String name, String rest, String fb, String dayWeek, String period, String dateF, String dateT, String tDur, String ses, String quant) {
        this.scheID = scheID;
        this.name = name;
        this.rest = rest;
        this.fb = fb;
        this.dayWeek = dayWeek;
        this.period = period;
        this.dateF = dateF;
        this.dateT = dateT;
        this.tDur = tDur;
        this.ses = ses;
        this.quant = quant;
    }

    public scheOrderDA() {
        
    }

    
    
    public String getScheID() {
        return scheID;
    }

    public void setScheID(String scheID) {
        this.scheID = scheID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDateF() {
        return dateF;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    public String getDateT() {
        return dateT;
    }

    public void setDateT(String dateT) {
        this.dateT = dateT;
    }

    public String gettDur() {
        return tDur;
    }

    public void settDur(String tDur) {
        this.tDur = tDur;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }
    
    
}
