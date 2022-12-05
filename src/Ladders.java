public class Ladders {

    private int [][] mat;
    private boolean frue;

    public Ladders(){
        mat = new int[10][10];

    }

    public boolean hitit(int z){
        if(z == 4){
            frue = true;
        }
        if(z == 13){
            frue = true;
        }
        if(z == 50){
            frue = true;
        }
        if(z == 33){
            frue = true;
        }
        if(z == 42){
            frue = true;
        }
        if(z == 62){
            frue = true;
        }
        if(z == 74){
            frue = true;
        }
        else{
            frue = false;
        }
        return frue;
    }

    public int jeasoi(boolean x, int z){
        if(x = true){
            if(z == 4){
                z = 25;
            }
            if(z == 13){
                z = 46;
            }
            if(z == 50){
                z = 69;
            }
            if(z == 33){
                z = 49;
            }
            if(z == 42){
                z = 63;
            }
            if(z == 62){
                z = 81;
            }
            if(z == 74){
                z = 92;
            }
        }
    }

}
