package ru.netology.domain;

public class Radio {
    //поля объекта Радио
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    //узнать количество станций
    public int getNumberOfStations() {
        return numberOfStations;
    }

    //текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    //установить станцию
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > numberOfStations - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    //следующая станция
    public void setNextStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    //предыдущая станция
    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberOfStations - 1;
        }
    }

    //текущий звук
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //увеличить звук
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    //уменьшить звук
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
