package stepanPackage.practice12to15.task1;

public class Person {
    private String firstName, secondName, patronymic;

    public Person(String secondName, String firstName, String patronymic) {
        setSecondName(secondName);
        setFirstName(firstName);
        setPatronymic(patronymic);
    }

    public Person(String secondName, String firstName) {
        setSecondName(secondName);
        setFirstName(firstName);
    }

    public Person(String secondName) {
        setSecondName(secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getInitials() {
        StringBuilder s = new StringBuilder();
        char tempFirst = getFirstName().charAt(0);
        char tempPartonymic = getPatronymic().charAt(0);

        s.append(this.getSecondName()+" ").append(tempFirst+". ").append(tempPartonymic+".");
        return s.toString();
    }
}
