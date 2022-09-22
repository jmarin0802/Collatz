package javi.dev.tools.model;

import java.util.Arrays;

public class VariableSet {
    private String text;
    private boolean [] status;
    private int numeric;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean[] getStatus() {
        return status;
    }

    public void setStatus(boolean[] status) {
        this.status = status;
    }

    public int getNumeric() {
        return numeric;
    }

    public void setNumeric(int numeric) {
        this.numeric = numeric;
    }

    public VariableSet changeStatus(){
        if(numeric%2==0){
            if(status[0]=false){
                status[0]=true;
            }else {
                status[0]=false;
            }
        }
        return this;
    }

    public VariableSet concat(String textConcat){
        text=text+textConcat;
        return this;
    }

    public VariableSet Collatz(int i){
        numeric=numeric+i;
        if(numeric%2==0){
            numeric=numeric/2;
        }else{
            numeric=3*numeric+1;
        }
        return this;
    }

    public VariableSet(String text, int numeric) {
        this.text = text;
        this.status = new boolean[] {true, false};
        this.numeric = numeric;
    }

    public void sumOne(){
        this.numeric++;
    }

    public VariableSet() {
    }

    @Override
    public String toString() {
        return "VariableSet{" +
                "text='" + text + '\'' +
                ", status=" + Arrays.toString(status) +
                ", numeric=" + numeric +
                '}';
    }
}
