package Task1;

public class Employee {
    // Membrii clasei sunt marcați ca private
    private String name;
    private int age;
    private String department;

    // Constructor cu 3 parametri pentru inițializarea membrilor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter pentru name
    public String getName() {
        return name;
    }

    // Setter pentru name
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru age
    public int getAge() {
        return age;
    }

    // Setter pentru age
    public void setAge(int age) {
        if (age > 0) {  // Opțional: puteți adăuga validare pentru vârstă
            this.age = age;
        } else {
            System.out.println("Vârsta trebuie să fie mai mare de 0.");
        }
    }

    // Getter pentru department
    public String getDepartment() {
        return department;
    }

    // Setter pentru department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Metodă pentru afișarea informațiilor despre angajat
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}
