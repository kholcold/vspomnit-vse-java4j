package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Class PhoneDictionary.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 03.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    /**
     * Добавление пользователя.
     *
     * @param person
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ для поиска.
     * @return Список подошедших пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key)) {
                result.add(person);
            } else if (person.getSurname().contains(key)) {
                result.add(person);
            } else if (person.getPhone().contains(key)) {
                result.add(person);
            } else if (person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
