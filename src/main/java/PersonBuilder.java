public class PersonBuilder {
    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
   }

    public PersonBuilder setName(String name) {
        newPerson.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("The age is specified incorrectly");
        newPerson.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.address = address;
        return this;
    }

    public Person build() {
        if (newPerson.getName() == null || newPerson.getSurname() == null) {
            throw new IllegalStateException("The first or last name is not specified");
        }
        return newPerson;
    }
}

