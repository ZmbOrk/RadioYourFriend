package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStationOverFinalStation() {
        Radio gaga = new Radio(140,140);
        gaga.nextRadioStation();
        assertEquals(0, gaga.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationIfFinalStation() {
        Radio gaga = new Radio(10,10);
        gaga.nextRadioStation();
        assertEquals(0, gaga.getCurrentRadioStation());
    }
    @Test
    void shouldNextRadioStation() {
        Radio gaga = new Radio(5,10);
        gaga.nextRadioStation();
        assertEquals(6, gaga.getCurrentRadioStation());
    }
    @Test
    void shouldNextStationOverMax() {
        Radio gaga = new Radio(141,140);
        gaga.nextRadioStation();
        assertEquals(0, gaga.getCurrentRadioStation());
    }
    @Test
    void shouldPrevStationIfCurrentStationMin() {
        Radio gaga = new Radio(0,10);
        gaga.prevRadioStation();
        assertEquals(10, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationStart() {
        Radio gaga = new Radio(0,56);
        gaga.prevRadioStation();
        assertEquals(56, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfCurrentStationLessStart() {
        Radio gaga = new Radio(-1,56);
        gaga.prevRadioStation();
        assertEquals(56, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radio gaga = new Radio(3,10);
        gaga.prevRadioStation();
        assertEquals(2, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        Radio gaga = new Radio(5,10);
        assertEquals(5, gaga.getCurrentRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(9);
        gaga.shouldSoundVolumeUp();
        assertEquals(10, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(7);
        gaga.shouldSoundVolumeDown();
        assertEquals(6, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(100);
        gaga.shouldSoundVolumeUp();
        assertEquals(100, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControlOverMax() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(101);
        gaga.shouldSoundVolumeUp();
        assertEquals(100, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(0);
        gaga.shouldSoundVolumeDown();
        assertEquals(0, gaga.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControlLessMin() {
        Radio gaga = new Radio();
        gaga.setCurrentSoundVolume(-1);
        gaga.shouldSoundVolumeDown();
        assertEquals(0, gaga.getCurrentSoundVolume());
    }
}