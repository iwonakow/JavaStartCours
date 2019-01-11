public class Company {
    public static  void main(String[]args){
        Employee employee1 = new Employee();
        employee1.name = "Jan";
        employee1.surname = "Kowalski";
        employee1.birthday = 1980;
        employee1.seniority = 5;
        Employee employee2 = new Employee();
        employee2.name = "Adam";
        employee2.surname = "Nowak";
        employee2.birthday = 1965;
        employee2.seniority = 13;
        Employee employee3 = new Employee();
        employee3.name = "Paweł";
        employee3.surname = "Gaweł";
        employee3.birthday = 1996;
        employee3.seniority = 1;
        System.out.println("Pracoenik: "+ employee1.name + " " + employee1.surname + " " + " ,rok urodzenia : " + employee1.birthday+ " ,staż pracy: " + employee1.seniority );
        System.out.println("Pracoenik: "+ employee2.name + " " + employee2.surname + " " + " ,rok urodzenia : " + employee2.birthday+ " ,staż pracy: " + employee2.seniority );
        System.out.println("Pracoenik: "+ employee3.name + " " + employee3.surname + " " + " ,rok urodzenia : " + employee3.birthday+ " ,staż pracy: " + employee3.seniority );


    }

}
