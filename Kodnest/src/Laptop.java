public class Laptop {
    String brand;
    String color;
    int cost;
    public Laptop(){

    }
    void doOperation(){
        System.out.println(brand+" "+color+"Which cost"+cost+"is doing pressing");
    }
    public Laptop(String a,String b,int c){
        brand=a;
        color=b;
        cost=c;
    }
}
