public class Method2Type {
    public void add(int x,int y){
        System.out.println("sum:"+(x+y));
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        Method2Type obj=new Method2Type();
        obj.add(a,b);
    }
}
