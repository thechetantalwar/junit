public class CalcClass {
    private int a;
    private int b;
    CalcClass(int a, int b){
        this.a=a;
        this.b=b;
        if(a<0 || b<0){
            throw new IllegalArgumentException();
        }
    }
    public int sum()
    {
        return (this.a + this.b);
    }
}
