package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private final ArrayList<Sensor> sensors;
    private final ArrayList<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s: sensors) {
            if (!s.isOn()) return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s: sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s: sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !this.isOn()) throw new IllegalStateException();

        int sum = 0; int count = 0;
        for (Sensor s: sensors) {
            sum += s.read();
            count++;
        }
        readings.add(sum / count);
        return sum / count;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {return readings;}
}
