package exercise.solutionsimran;

import exercise.ExerciseMain;
import exercise.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)

        );

        //STEP:1 Sort list by last name
        Comparator<Person> lastNameComparator = getComparatorForLastName();

        ActionExecutor sortByLastNameExecutor = peopleList -> {
            peopleList.sort(lastNameComparator);
        };

        /*** Executing sort action ***/
        executeActionsOnList(sortByLastNameExecutor, personList);

        //STEP:2 --> print all the elements in the list

        System.out.println("Printing all the elements in the list...");
        ActionExecutor printListActionExecutor = peopleList -> {
            printConditionally(peopleList, person -> true);
        };

        /*** Executing print action ***/
        executeActionsOnList(printListActionExecutor, personList);

        //STEP:3 Print Person having last name beginning with C
        System.out.println("Printing person having last name starting with 'C'...");
        ActionExecutor beginningWithExecutor = persons -> {
            printConditionally(persons, person -> person.getLastName().startsWith("C"));
        };

        /*** Executing print action last name with C ***/
        executeActionsOnList(beginningWithExecutor, personList);
    }

    public static void executeActionsOnList(ActionExecutor actionExecutor, List<Person> personList) {
        actionExecutor.performActionOnList(personList);
    }

    private static Comparator<Person> getComparatorForLastName() {
        return (personOne, personTwo) -> personOne.getLastName()
                .compareTo(personTwo.getLastName());

    }

    private static void printConditionally(List<Person> personList, Predicate<Person> predicate){
        for(Person person: personList){
            if(predicate.test(person)){
                System.out.println(person);
            }
        }
    }
}
