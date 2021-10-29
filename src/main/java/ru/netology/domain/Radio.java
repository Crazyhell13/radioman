package ru.netology.domain;

public class Radio {
    //поля объекта Радио
    private int currentStation;
    private int currentVolume;

    //текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    //установить станцию
    public void setCurrentStation(int currentStation) {
        if (currentStation <0 || currentStation >9){
            return;
        }
        this.currentStation = currentStation;
    }

    //следующая станция
    public void setNextStation (){
        if (currentStation < 9) {
            currentStation = currentStation +1;
        }else {
            currentStation = 0;
        }
    }
    //предыдущая станция
    public void setPrevStation (){
        if (currentStation > 0) {
            currentStation = currentStation -1;
        }else {
            currentStation = 9;
        }
    }

    //текущий звук
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    //увеличить звук
    public void increaseVolume (){
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    //уменьшить звук
    public void decreaseVolume (){
        if (currentVolume > 0){
            currentVolume = currentVolume -1;
        }
    }
}
