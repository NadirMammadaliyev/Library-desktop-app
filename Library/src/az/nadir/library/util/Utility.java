/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.util;

import az.nadir.library.model.Author;
import az.nadir.library.model.Employee;
import az.nadir.library.model.Language;
import az.nadir.library.model.Topic;
import az.nadir.library.model.User;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Utility {

    public static void getUserList(List<User> userList) {
        for (User user : userList) {
            System.out.println(user.getId() + " --- " + user.getName() + " --- " + user.getSurname() + " --- " + user.getDob() + " --- " + user.getIdentityNumber() + " --- " + user.getMail() + " --- " + user.getPhone() + "---" + user.getUserActivity() + " --- " + user.getProblem());
        }
    }

    public static void getLanguageList(List<Language> LanguageList) {
        for (Language language : LanguageList) {
            System.out.println(language.getId() + " --- " + language.getName());
        }

    }

    public static void getAuthorList(List<Author> authorList) {
        for (Author author : authorList) {
            System.out.println(author.getId() + " --- " + author.getName() + " --- " + author.getSurname());
        }
    }

    public static void getEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee.getId() + " --- " + employee.getName() + " --- " + employee.getSurname() + " --- " + employee.getPosition().getName());
        }
    }

    public static void getTopicList(List<Topic> TopicList) {
        for (Topic topic : TopicList) {
            System.out.println(topic.getId() + " --- " + topic.getName());
        }

    }

}
