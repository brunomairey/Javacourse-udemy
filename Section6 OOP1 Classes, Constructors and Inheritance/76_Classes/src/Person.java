public class Person {
    private String firstName;
    private String  lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age<0||age>100){
            this.age = 0;
        }
        else {
            this.age =age;
        }
    }

    public boolean isTeen(){
        if(age>12&&age<20){
            return true;
        }
        else {
            return false;
        }
    }

    public String getFullName(){
        if(this.firstName.isEmpty()&&this.lastName.isEmpty()){
            return "";
        }
        else if(this.firstName.isEmpty()){
            return lastName;
        }
        else if(this.lastName.isEmpty()){
            return firstName;
        }
        else {
            return this.firstName + " " + this.lastName;
        }
    }
}
