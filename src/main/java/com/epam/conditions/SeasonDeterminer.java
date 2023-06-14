package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            switch (monthNumber) {
                case 1,2,12:
                    season = "Winter";
                    break;
                case 3,4,5:
                    season = "Spring";
                    break;
                case 6,7,8:
                    season = "Summer";
                    break;
                default:
                    season = "Autumn";
                    break;
            }
            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }

}
