class TV {
    protected int volume;

    public TV(int volume) {
        this.volume = volume;
    }

    void play() {
        System.out.println("Base TV is playing");
    }

    void volUp() {
        volume += 2;
    }

    void volDown() {
        volume -= 2;
    }
}

class SamsungTV extends TV {
    public SamsungTV(int volume) {
        super(volume);
    }

    @Override
    void play() {
        System.out.println("SamsungTV is playing");
    }

    @Override
    void volUp() {
        volume += 10;
    }

    @Override
    void volDown() {
        volume -= 10;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        // Dynamic method dispatch
        TV obj = new SamsungTV(2);
        obj.play();
        obj.volUp();
        obj.volUp();

        System.out.println("The current volume of the TV is: " + obj.volume);
    }
}
