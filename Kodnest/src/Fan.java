public class Fan {
    String brand;
    String color;
    int cost;
    void blowAir(){
        System.out.println(brand+"fan is blowing air");
    }
    void rotate(){
        System.out.println(brand+" "+color+"color fan is rotating");
    }
    public Fan(String a,String b,int c){
        brand=a;
        color=b;
        cost=c;
    }
}
