package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio friend = new Radio();

    @Test
    void shouldNextStationIfFinalStation() {
        friend.setCurrentRadioStation(9);
        friend.nextRadioStation();
        assertEquals(0, friend.getCurrentRadioStation());
    }

    @Test
    void shouldNextRadioStation() {
        friend.setCurrentRadioStation(2);
        friend.nextRadioStation();
        assertEquals(3, friend.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationIfStartStation() {
        friend.setCurrentRadioStation(0);
        friend.prevRadioStation();
        assertEquals(9, friend.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        friend.setCurrentRadioStation(3);
        friend.prevRadioStation();
        assertEquals(2, friend.getCurrentRadioStation());
    }

    @Test
    void shouldControlNumButtonStation() {
        friend.setCurrentRadioStation(5);
        assertEquals(5, friend.getCurrentRadioStation());
    }

    @Test
    void shouldControlMinOutsideStation() {
        friend.setCurrentRadioStation(-1);
        assertEquals(9, friend.getCurrentRadioStation());
    }

    @Test
    void shouldControlMaxOutsideStation() {
        friend.setCurrentRadioStation(10);
        assertEquals(0, friend.getCurrentRadioStation());
    }

    @Test
    void shouldSoundVolumeUp() {
        friend.setCurrentSoundVolume(9);
        friend.shouldSoundVolumeUp();
        assertEquals(10, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDown() {
        friend.setCurrentSoundVolume(7);
        friend.shouldSoundVolumeDown();
        assertEquals(6, friend.getCurrentSoundVolume());
    }

    @Test
    void setVolumeUnderMin() {
        friend.setCurrentSoundVolume(-1);
        assertEquals(0, friend.getCurrentSoundVolume());
    }

    @Test
    void setVolumeOverMax() {
        friend.setCurrentSoundVolume(11);
        assertEquals(10, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeUpControl() {
        friend.setCurrentSoundVolume(10);
        friend.shouldSoundVolumeUp();
        assertEquals(10, friend.getCurrentSoundVolume());
    }

    @Test
    void shouldSoundVolumeDownControl() {
        friend.setCurrentSoundVolume(0);
        friend.shouldSoundVolumeDown();
        assertEquals(0, friend.getCurrentSoundVolume());
    }
}