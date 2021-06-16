public class OR {
    private int bit1;
    private int bit2;

    public OR (int bit1, int bit2){
        this.bit1 = bit1;
        this.bit2 = bit2;
    }

    public boolean resultBool(){
        if(bit1 == 1 || bit2 == 1){
            return true;
        } else {
            return false;
        }
    }

    public int resultInt(){
        if(bit1 == 1 || bit2 == 1){
            return 1;
        } else {
            return 0;
        }
    }
}
