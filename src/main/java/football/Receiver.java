package football;

/**
 * A receiver catches passes and keeps his own stats.
 *
 * Empty on purpose. We build it together, starting at Step 1 in the README.
 */
public class Receiver {
    private String name;
    private int number;
    private int catches;
    private int yards;

    public Receiver(String name, int number) {
        this.name = name;
        this.number = number;
        this.catches = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getCatches() {
        return catches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catchBall(int gain) {
        catches = catches + 1;
        yards = yards + gain;
    }

    @Override
    public String toString() {
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }

    public double yardsPerCatch() {
        if (catches == 0) {
            return 0.0;
        }
        return (double) yards / catches;
    }






}
