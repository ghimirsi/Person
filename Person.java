import java.util.Calendar;

class Person {
    private String IDnum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String IDnum, String firstName, String lastName, String title, int YOB)
    {
        this.IDnum = IDnum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    public String getIDnum()
    {
        return IDnum;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)

    {
        this.lastName = lastName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYOB()
    {
        return YOB;
    }



    public String fullName()
    {
        return firstName + " " + lastName;
    }
    public String formalName()
    {
        return title + " " + firstName;
    }

    public int getAge()
    {
        return Calendar.YEAR - YOB;
    }

    public int getAge(int Year)
    {
        return Year - YOB;
    }

    public String toCSVDataRecord()
    {
        return IDnum + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

}

