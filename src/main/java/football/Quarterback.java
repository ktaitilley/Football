package football;

/**
 * A quarterback throws to a Receiver.
 *
 * Empty on purpose. We start on this one at Step 3 in the README.
 */
public class Quarterback {

    private final String name;
    private final int armStrength;   // longest throw he can make, in yards
    private int attempts;
    private int completions;
    private int passingYards;

    public Quarterback(String name, int armStrength) {
        this.name = name;
        this.armStrength = armStrength;
    }

    public String getName()       { return name; }
    public int getAttempts()      { return attempts; }
    public int getCompletions()   { return completions; }
    public int getPassingYards()  { return passingYards; }

    public boolean throwTo(Receiver target, int yards) {
        attempts = attempts + 1;

        if (yards > armStrength) {
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
            return false;
        }

        completions = completions + 1;
        passingYards = passingYards + yards;
        target.catchBall(yards);
        System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
        return true;
    }

    public boolean throwTo(Receiver target) {
        return throwTo(target, 10);
    }

    public int completionPercentage() {
        if (attempts == 0) {
            return 0;
        }
        return completions *100 / attempts ;
    }

    @Override
    public String toString() {
        return name + ": " + completions + "/" + attempts + ", " + passingYards + " yards, "
                + completionPercentage() + "%";
    }
}
