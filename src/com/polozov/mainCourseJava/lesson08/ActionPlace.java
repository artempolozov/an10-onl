package com.polozov.mainCourseJava.lesson08;

public class ActionPlace {

    private String placeName;
    private Person[] persons;

    public ActionPlace(String placeName) {
        this.placeName = placeName;
        this.persons = new Person[1000];
    }

    public void addPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                break;
            }
        }
    }

    public void removePerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].equals(person)) {
                persons[i] = null;
                break;
            }
        }
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void makeSomething() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                persons[i].doSomething();
            }
        }
    }
}
