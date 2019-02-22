package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.model.logic;

public class DateOfNextDay {
    public static String dateDetermination(int day, int month, int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                day = ++day % 32;
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                day = ++day % 31;
            }else{
                day = ++day % 30;
            }
        }else{
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                day = ++day % 32;
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                day = ++day % 31;
            }else{
                day = ++day % 29;
            }
        }

        day = (day == 0 ? ++day : day);

        if(day == 1){
            month = ++month % 12;
            month = (month == 0 ? ++month : month);
            if(month == 1){
                year++;
            }
        }

        return "Next day: " + day + " " + month + " " + year;
    }
}

