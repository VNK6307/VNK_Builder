public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age = null;
    protected String location = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        if (name == null || surname == null) {
            throw new IllegalStateException("Значения полей имени и фамилии должны быть обязательно заполнены!");
        } else {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + location.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String tempAge;
        if (age == null) {
            tempAge = "возраст неизвестен";
        } else {
            tempAge = age + " год";
        }
        return name + " " + surname + ", " + tempAge + ", живет в городе " + location;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChild = new PersonBuilder();
        newChild.setSurname(this.surname);
        newChild.setAge(0);
        newChild.setLocation(this.getLocation());
        return newChild;
    }

    public boolean hasAddress() {
        return this.location != null;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public void happyBirthday() {
        if (this.age != null) {
            age += 1;
        } else {
            throw new RuntimeException("У этого человека возраст неизвестен.");
        }
    }
}// class
