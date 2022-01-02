package com.company;
/*
Consider classes: CEO, Manager, Assistant Manager, Supervisor, Employees
Perform Hierarchal Inheritance which includes information that is relevant between CEO and all other
classes. Each class must contain atleast 3 fields, a parameterized constructor for information input from
the user and a DisplayInformation function.
 */
abstract class CEO{
    public String person_name;
    public int id;
    public int salary;
    abstract void displayInformation();
    public void displayCEO(){
        System.out.println("this is CEO class");
    }
}
class Manager extends CEO{
    private String car_name;
    private int noof_assist_mananger;
    private int number_of_manager;
    public Manager(String car_name, int noof_assist_mananger, int number_of_managerString, String person_name, int id, int salary){
        this.car_name = car_name;
        this.noof_assist_mananger = noof_assist_mananger;
        this.number_of_manager = number_of_manager;
        this.person_name = person_name;
        this.id = id;
        this.salary = salary;
    }
    @Override
    void displayInformation() {
        System.out.println("The id of manager is " + id);
        System.out.println("The Manager name is " + person_name);
        System.out.println("The car rewarded by company is " + car_name);
        System.out.println("The number of total assistant manager under " + noof_assist_mananger);
        System.out.println("The number of mananger including me " + number_of_manager);
        System.out.println("The Salary is fixed every month is " + salary);
    }
}
class AssistantManager extends CEO{
    private String bike_name;
    private String id_card_color;
    private int total_colleagues_sameinrank;
    public AssistantManager(String person_name, int id, int salary, String bike_name, String id_card_color, int total_colleagues_sameinrank){
        this.id = id;
        this.person_name = person_name;
        this.id_card_color = id_card_color;
        this.bike_name = bike_name;
        this.total_colleagues_sameinrank = total_colleagues_sameinrank;
        this.salary = salary;
    }
    @Override
    void displayInformation() {
        System.out.println("The Id of Assistant Manager " + id);
        System.out.println("Name of person is " + person_name + " is Assistant Manager");
        System.out.println("Id admit card belt color is " + id_card_color);
        System.out.println("Name of the bike that's rewarded " + bike_name);
        System.out.println("number of colleagues with same ranks " + total_colleagues_sameinrank);
        System.out.println("the salary of " + person_name + " is " + salary);
    }
}
class supervisor extends CEO{
    private int hours_you_work;
    private int employees_under_you;
    private int age;
    public supervisor(int id, String person_name, int salary, int hours_you_work, int employees_under_you, int age){
        this.id = id;
        this.person_name = person_name;
        this.age = age;
        this.hours_you_work = hours_you_work;
        this.employees_under_you = employees_under_you;
        this.salary = salary;
    }
    @Override
    void displayInformation() {
        System.out.println("The id of the Supervisor " + id);
        System.out.println("Name of the person is " + person_name + " is Supervisor");
        System.out.println("Age of the Supervisor is " + age);
        System.out.println("the number of hours you work daily " + hours_you_work);
        System.out.println("Total number of employee work under you " + employees_under_you);
        System.out.println("The salary given to you as Supervisor " + salary);
    }
}
class Employee extends CEO{
    private boolean Are_you_freelancer;
    private int experience_inprevious_company;
    private byte grade;
    public Employee(int id, String person_name, int salary, boolean are_you_freelancer, int experience_inprevious_company, byte grade){
        this.id = id;
        this.person_name = person_name;
        this.salary = salary;
        this.Are_you_freelancer = are_you_freelancer;
        this.experience_inprevious_company = experience_inprevious_company;
        this.grade = grade;
    }
    @Override
    void displayInformation() {
        System.out.println("The Employee id " + id);
        System.out.println("The name of Employee is " + person_name);
        System.out.println("what's your grade working as Employer in this company " + grade);
        System.out.println("Are you already working as freelancer? " + Are_you_freelancer);
        System.out.println("Experience in pervious company you worked " + experience_inprevious_company);
        System.out.println("Salary you take every month from here " + salary);
    }
}
public class question14 {
    public static void main(String[] args){
        supervisor s = new supervisor(1094,"Ahmed", 1400, 5, 7, 2);
        s.displayInformation();
    }
}
