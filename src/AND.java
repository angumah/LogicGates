public class AND {
    private int bit1;
    private int bit2;

    private int result;

    public AND(int bit1, int bit2) {
        this.bit1 = bit1;
        this.bit2 = bit2;
    }

    public boolean resultBool() {
        if (bit1 == 1 && bit2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int resultInt() {
        if(this.bit1 == 1){
            if(this.bit1 == this.bit2) {
                return 1;
            }
        }
        return 0;
    }
}
