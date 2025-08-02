package CoreJava;

class Com {
    public void playmusic() {
        System.out.println("Now music Playing");
    }

    public String singername(int cost) {
        if (cost > 900)
            return "Ansh and Sakshi";
        else
            return "ABC";

    }
}

public class Computer {
    public static void main(String a[]) {

        Com obj = new Com();

        obj.playmusic();
        String str = obj.singername(1000);
        System.out.println(str);

    }

}
