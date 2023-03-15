class Date{
    int month, day, year;
    Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }
    public void setMonth(int m){
        month = m;
    }
    public void setDate(int d){
        day = d;
    }
    public void setYear(int y){
        year = y;
    }
    public int getMonth(){
        return month;
    }
    public int getDate(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public void displayDate(){
        System.out.println("Date is: " +month+"/"+day+"/"+year);
    }
}


