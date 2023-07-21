package sg.edu.rp.c346.id22024852.demotodolist;

import java.util.Calendar;

public class TodoItem {
    private String title;
    private Calendar date;

    public TodoItem(String title, Calendar date){
        this.title = title;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)-1)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day){
        String getDay = "";
        if (day == date.SUNDAY){
            getDay = "Sunday";
        } else if (day == 2){
            getDay = "Monday";
        } else if (day == 3){
            getDay = "Tuesday";
        } else if (day == 4){
            getDay = "Wednesday";
        } else if (day == 5){
            getDay = "Thursday";
        } else if (day == 6){
            getDay = "Friday";
        } else if (day == 7){
            getDay = "Saturday";
        }
        return getDay;
    }

}

