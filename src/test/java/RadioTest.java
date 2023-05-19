import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLessMin() {
        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumePlusOne() {
        radio.currentVolume = 50;
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMinusOne() {
        radio.currentVolume = 50;
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationAfterMax() {
        radio.currentStation = 9;
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationPlusOne() {
        radio.currentStation = 7;
        radio.nextStation();
        int expected = 8;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationAfterMin() {
        radio.currentStation = 0;
        radio.prevStation();
        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationMinusOne() {
        radio.currentStation = 7;
        radio.prevStation();
        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationLowerZero() {
        radio.currentStation = 5;
        radio.setCurrentStation(-1);
        int expected = 5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMax() {
        radio.currentStation = 5;
        radio.setCurrentStation(20);
        int expected = 5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation() {
        radio.currentStation = 5;
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
}
