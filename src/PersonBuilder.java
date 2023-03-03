public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age = null;
    protected String location = null;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Введен недопустимый возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age);
        if (location != null) {
            person.setLocation(location);
        }
        return person;
    }
}// class

