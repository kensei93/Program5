package ru.netology.sqr;


public class SQRService {

    int counter = 0;

    public int calc(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            int iSqaure = i * i;
            if (iSqaure >= min) {
                if (iSqaure <= max) {
                    counter++;

                }
            }
        }
        return counter;

    }

}
