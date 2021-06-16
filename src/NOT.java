public class NOT {
    private int bit;

    public NOT(int bit){
        switch(bit){
            case 0: this.bit = 1; break;
            case 1: this.bit = 0; break;
            default: break;
        }
    }

    public int getResult(){
        return this.bit;
    }

}
