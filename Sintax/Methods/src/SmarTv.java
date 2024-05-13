public class SmarTv {
    boolean state = false;
    
    int chanel = 1;
    
    int volum = 30;

    public void on() {
        state = true;
    }

    public void off() {

        state = false;
    }

    public void moreVolum() {
        volum++;

    }
    public void menusVolum() {
        volum--;

    }

    public void frontChanel() {
        chanel++;

    } 

    public void backChanel() {
        chanel--;

    }

    public void moveChanel(int newChanel ) {
        chanel = newChanel;
    }


}
