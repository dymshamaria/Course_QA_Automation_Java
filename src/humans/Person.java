package humans;

public class Person {
    public String name;
    public char sex;
    private int yearOfBirth;

    public Person(String name, char sex, int yearOfBirth) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        if (this.sex == 'R') {
            return "Mr. " + name;
        } else if (this.sex == 'F') {
            return "Ms " + name;
        } else {
            return name;
        }

//        return switch (this.sex) {
//            case 'M' -> "Mr. " + name;
//            case 'F' -> "Ms. " + name;
//            default -> name;
//        };




//        switch (this.sex){
//            case 'M':
//                return "Mr. " + name;
//            break;
//            case 'F':
//                return "Ms. " + name;
//            break;
//            default:
//                return name;
//    }





    }
}
