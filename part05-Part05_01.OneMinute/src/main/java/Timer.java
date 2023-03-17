public class Timer {
    private ClockHand firstHand;
    private ClockHand secondHand;

    public Timer() {
        this.firstHand = new ClockHand(60);
        this.secondHand = new ClockHand(100);
    }

    public void advance() {
        this.secondHand.advance();

        if (this.secondHand.value() == 0) {
            this.firstHand.advance();
        }
    }

    public String toString() {
        return firstHand + ":" + secondHand;
    }
}
