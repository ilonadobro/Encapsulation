public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxVolume = 100;
    private int maxStation = 9;


    public Radio(int stationSize) {
        maxStation = stationSize - 1;
    }

    public Radio() {
    }

    public int getMaxStation() {
        return maxStation + 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

}
