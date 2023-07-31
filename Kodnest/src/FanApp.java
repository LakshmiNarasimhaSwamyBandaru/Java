public class FanApp {
    public static void main(String[] args){
        Fan f1=new Fan("Crompton","black",3000);

        f1.blowAir();
        f1.rotate();
        new Fan("Usha","white",1500).rotate();
    }
}
