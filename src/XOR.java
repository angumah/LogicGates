public class XOR {
    private int bit1;
    private int bit2;

    public XOR (int bit1, int bit2){
        this.bit1 = bit1;
        this.bit2 = bit2;
    }

    public boolean resultBool(){
        if(bit1 == 1 || bit2 == 1){
            switch(bit1){
                case 0 : break;
                case 1 : if(bit2 == 0){
                    return true;
                } else {return false;}
            }

            switch(bit2){
                case 0 : break;
                case 1 : if(bit1 == 0){
                    return true;
                } else {return false;}
            }
        }
        return false;
    }


    public int resultInt(){
        if(bit1 == 1 || bit2 == 1){
            switch(bit1){
                case 0 : break;
                case 1 : if(bit2 == 0){
                    return 1;
                } else {return 0;}
            }

            switch(bit2){
                case 0 : break;
                case 1 : if(bit1 == 0){
                    return 1;
                } else {return 0;}
            }
        }
        return 0;
    }

}
