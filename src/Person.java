public class Person {
    private String fullName;
    private int age;
    private long ssn;

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Person(){
        age = 17;
        fullName = "Sue";
    }

    public Person(String fullName){
        setAge(-17);
        setFullName(fullName);
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String fullName, int age, long ssn) {
        this.fullName = fullName;
        this.age = age;
        this.ssn = ssn;
    }

    public void setAge(int newAge){
        if (age > 0)
            age = newAge;
        else
            age = 0;
    }

    public int getAge(){
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String newName) {
        fullName = newName;
        // this.name -> object's name
        // name -> parameter
    }

    public void haveBirthday(){
        age++;
    }

    public Boolean isMinor() {
        if (age < 18)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return fullName + "\'s age is "+age;
    }
}
