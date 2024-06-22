

class phone{

    public String brand = "";
    public phone(){
        brand = "vivo";
    }

    public void ringtone(){
        System.out.println("You are getting a call");
    }
}

class oppo extends phone{
    public String model ;

    public void ringtone(){
        System.out.println("This call is from oppo class 2 ");
    }

    public oppo(){
        model = "a78";
    }
}

public class abc {
    public static void main(String[] args) {
        //System.out.println("Hello");
        //System.out.println("Welcome");

        oppo newphone = new oppo();

        newphone.ringtone();
        System.out.println(newphone.brand);

        phone newphone1 = new phone();

        newphone1.ringtone();
    }
}