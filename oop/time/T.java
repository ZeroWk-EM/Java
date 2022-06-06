package oop.time;

public class T {
    int hour;
    int minute;
    int second;

    // Costruttore
    T(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Funzione per cambiare il tempo
    public void timeAdd(int x, int y, int z) {
        this.hour = this.hour + x;
        this.minute = this.minute + y;
        this.second = this.second + z;

        // Controllo secondi
        while (this.second > 59) {
            if (this.second > 59) {
                this.second = this.second - 60;
                this.minute++;
            }
        }

        // Controllo minuti
        while (this.minute > 59) {
            if (this.minute > 59) {
                this.minute = this.minute - 60;
                this.hour++;
            }
        }

        // Controllo ore
        while (this.hour > 23) {
            if (this.hour > 23) {
                this.hour = this.hour - 24;
            }
        }

    }

    public void timeLess(int x, int y, int z) {
        this.hour = this.hour - x;
        this.minute = this.minute - y;
        this.second = this.second - z;

        // Controllo secondi
        if (this.second < 0) {
            this.second = this.second + 60;
            this.minute--;
        }

        // Controllo minuti
        if (this.minute < 59) {
            this.minute = this.minute + 60;
            this.hour--;
        }

        // Controllo ore
        if (this.hour < 23) {
            this.hour = this.hour + 24;
        }
    }

}
