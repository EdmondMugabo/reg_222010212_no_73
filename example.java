import java.text.DecimalFormat;

class person{
    private String name;
    private int age;
    private String location;
    private char gender;
    private int phoneNumber;
    private String nationality;
    private String color;

    public person(String name, int age, String nationality, int phoneNumber, String location, char gender, String color){
        this.name = name;
        this.age = age;
        this.location = location;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
        this.color = color;
    }

    public void display(){
        String information1 = name;
        String information2 = nationality;
        String information3 = location;
        String information4 = color;
        int information5 = age;
        int information6 = phoneNumber;
        char information7 = gender;

        return (information1, information2, information3, information4, information5, information6, information7);
    }
}

public class example {
    public static void main(String[] args)
    {
        String name = "Mukashaka";
        String nationality = "Rwandan";
        String color = "Blue";
        String location = "Nyabugogo";
        int age = 30;
        int phoneNumber = 7868985;
        char gender = 'F';
        person info = new person(name, age, nationality, phoneNumber, location, gender, color);
        System.out.println(name);
        System.out.println( age );
        System.out.println( nationality);
        System.out.println( phoneNumber);
        System.out.println( location);
        System.out.println( gender);
        System.out.println( color);
    }   
}