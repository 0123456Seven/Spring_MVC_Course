package ru.xaero.springmvc.config.dao;

import ru.xaero.springmvc.config.models.Person;

import java.util.List;

public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people.add(new Person(++PEOPLE_COUNT, "Marsel1"));
        people.add(new Person(++PEOPLE_COUNT, "Marsel2"));
        people.add(new Person(++PEOPLE_COUNT, "Marsel3"));
        people.add(new Person(++PEOPLE_COUNT, "Marsel4"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        Person resultPerson = null;
        for(Person person : people){
            if(id==person.getId()){
                resultPerson = person;
            }
        }
        return resultPerson;
    }

}
