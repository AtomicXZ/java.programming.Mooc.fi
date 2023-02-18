public class Timer {
    private ClockHand seconds;
    private ClockHand milliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }

    public void advance() {
        this.milliseconds.advance();

        if (milliseconds.value() == 0) {
            seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.milliseconds;
    }
}
