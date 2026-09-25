public class Qequation {
    private float a;
    private float b;
    private float c;

    public Qequation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int countSquares(){
        int count = 0;
         float D = b*b-4*a*c;
         if(D > 0)
         {count = 2;}
         else if(D == 0)
         {count = 1;}
         else {count = 0;}
        return count;
    }
    public double findSquares(){
        return 0;
    }
    }


