package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetCurrentStationDefault() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentStation() {
        Radio radio = new Radio(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxStationDefault() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getNumberOfStations() - 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxStation() {
        Radio radio = new Radio(25);
        int expected = 24;
        int actual = radio.getNumberOfStations() - 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationValidValue() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(45);
        int expected = 45;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationLowerLimit() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationUpperLimit() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(59);
        int expected = 59;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationAboveMax() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(75);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBelowMin() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(60);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAfterMax() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(59);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(45);
        radio.setPrevStation();
        int expected = 44;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAfterMin() {
        Radio radio = new Radio(60);
        radio.setPrevStation();
        int expected = 59;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationValidValueDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationLowerLimitDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationUpperLimitDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationAboveMaxDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationBelowMinDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationDefault() {
        Radio radio = new Radio();
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAfterMaxDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setPrevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAfterMinDefault() {
        Radio radio = new Radio();
        radio.setPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhen0() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    /*@Test
    public void shouldSetCurrentVolume () {
        Radio radio = new Radio ();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMax () {
        Radio radio = new Radio ();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMin () {
        Radio radio = new Radio ();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeAfterMax () {
        Radio radio = new Radio ();
        radio.setCurrentVolume(125);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeAfterMin () {
        Radio radio = new Radio ();
        radio.setCurrentVolume(-20);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }*/
}