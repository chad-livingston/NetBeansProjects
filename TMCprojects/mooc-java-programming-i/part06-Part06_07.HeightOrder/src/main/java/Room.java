import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }


    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if (this.persons.isEmpty()){
            return true;
        } else {
            return false;
        }
        //return true;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){

        if (this.persons.isEmpty()){
            return null;
        }
        Person shortestPerson = persons.get(0);
        for (Person person : this.persons){
            if (person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    public Person take(){
        Person person = shortest();
        this.persons.remove(person);
        return person;
    }



}
