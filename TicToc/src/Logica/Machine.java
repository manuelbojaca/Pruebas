package Logica;

public class Machine {
    private String Tec;
    private int tim;

    public Machine() {
        this.Tec = " ";
        this.tim = 0;
    }

    public String getTec() {
        return Tec;
    }
    public void setTec(String Tec) {
        this.Tec = Tec;
    }

    public int getTim() {
        return tim;
    }
    public void setTim(int tim) {
        this.tim = tim;
    }
    
    public void ToT(){
        this.tim++;
        if(this.tim%2 == 0)
            this.Tec = "Tic";
        else
            this.Tec = "Toc";    
    }
}
