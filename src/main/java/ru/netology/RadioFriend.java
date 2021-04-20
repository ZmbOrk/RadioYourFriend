package ru.netology;

class Radio {
    private int firstStation = 0;
    private int finalStation = 9;
    private int actualRadioStation;
    private int actualSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;

    public int getCurrentRadioStation() {
        return actualRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > finalStation) {
            this.actualRadioStation = firstStation;
            return;
        }
        if (currentRadioStation < firstStation) {
            this.actualRadioStation = finalStation;
            return;
        }
        this.actualRadioStation = currentRadioStation;
    }

    public int nextRadioStation() {
        actualRadioStation = actualRadioStation >= finalStation ? firstStation : ++actualRadioStation;
        return actualRadioStation;
    }

    public int prevRadioStation() {
        actualRadioStation = actualRadioStation <= firstStation ? finalStation : --actualRadioStation;
        return actualRadioStation;
    }

    public int getCurrentSoundVolume() {
        return actualSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            this.actualSoundVolume = maxSoundVolume;
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            this.actualSoundVolume = minSoundVolume;
            return;
        }
        this.actualSoundVolume = currentSoundVolume;
    }

    public void shouldSoundVolumeUp() {
        if (actualSoundVolume == maxSoundVolume)
            return;
        actualSoundVolume++;
    }

    public void shouldSoundVolumeDown() {
        if (actualSoundVolume == minSoundVolume)
            return;
        actualSoundVolume--;
    }
}



