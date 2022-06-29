package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    public void increaseVolume () {
     if (currentVolume < 10) {
         currentVolume++;
     }
        public void decreaseVolume () {
            if (currentVolume > 0) {
                currentVolume--;
            }
        }
     public void  nextStation() {
            if (currentStation < 9) {
                currentStation++;
            }
            else {
                currentStation=0;

            }
            public void  prevStation() {
                if (currentStation > 9) {
                    currentStation = 0;
                }
                else {
                    currentStation --;

                }
        }

        }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
            if (currentStation > 9) {
                return;
            }
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }

            if (currentVolume > 10) {
                return;
            }
            this.currentVolume = currentVolume;

    }
}

    public void setCurrentStation(int i) {
    }
