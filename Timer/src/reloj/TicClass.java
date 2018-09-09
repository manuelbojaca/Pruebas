package reloj;

public class TicClass {

    private int value;

    public TicClass(int initialValue){
        this.value=initialValue;
    }

    public TicClass(){
        this.value=0;
    }

    public void setValue(int newValue){
        this.value=newValue;
    }

    public int getValue(){
        return this.value;
    }

    public void increment(){
        this.value++;
    }
}

