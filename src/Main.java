public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // Вывод всех сотрудников
        System.out.println("Сотрудники");
        employeeBook.printEmployee(employeeBook.getArrayEmployee());

        //Вывод статистических данных по з/п
        System.out.println();
        System.out.println("Статистические данные по з/п");
        System.out.println("Минимальная з/п: " +  employeeBook.minSalary(employeeBook.getArrayEmployee()));
        System.out.println("Максимальная з/п: " +  employeeBook.maxSalary(employeeBook.getArrayEmployee()));
        System.out.println("Сумма затрат на з/п в месяц: " +  employeeBook.sumSalary(employeeBook.getArrayEmployee()));
        System.out.println("Средняя з/п: " +  employeeBook.sumSalary(employeeBook.getArrayEmployee()) / employeeBook.numberEmployee);

        //Сотруднки ФИО
        System.out.println();
        System.out.println("ФИО сотрудников:");
        employeeBook.employeesName(employeeBook.getArrayEmployee());

        // Увеличение з/п на параметр
        System.out.println();
        int percentageIncrease = 50;
        employeeBook.increaseSalary(employeeBook.getArrayEmployee(), percentageIncrease);

        System.out.println("Сотрудники после увеличения з/п на " + percentageIncrease + "%");
        employeeBook.printEmployee(employeeBook.getArrayEmployee());


        // Статистические данные по отделу
        int numberDepartment = 2;
        System.out.println();
        System.out.println("Статистические данные по з/п по отделу " + numberDepartment);
        System.out.println("Сумма затрат на з/п в месяц: " +  employeeBook.sumSalaryDepartment(employeeBook.getArrayEmployee(), numberDepartment));
        System.out.println("Минимальная з/п: " +  employeeBook.minSalaryDepartment(employeeBook.getArrayEmployee(), numberDepartment));
        System.out.println("Максимальная з/п: " +  employeeBook.maxSalaryDepartment(employeeBook.getArrayEmployee(), numberDepartment));
        System.out.println("Средняя з/п: " +  employeeBook.averageSalaryDepartment(employeeBook.getArrayEmployee(), numberDepartment));


        //Увеличение з/п по отделу
        System.out.println();
        System.out.println("Сотрудники отдела " + numberDepartment + " после увеличения з/п на " + percentageIncrease + "%");
        employeeBook.increaseSalaryDepartment(employeeBook.getArrayEmployee(), numberDepartment, percentageIncrease);
        employeeBook.printWithoutDepartment(employeeBook.getArrayEmployee(), numberDepartment);

        //Сотрудники с з/п меньше/больше числа
        int numberToCompare = 200000;
        System.out.println();
        System.out.println("Сотрудники c з/п меньше, чем " + numberToCompare);
        employeeBook.salarySmallerNumber(employeeBook.getArrayEmployee(), numberToCompare);
        System.out.println();
        System.out.println("Сотрудники c з/п больше, чем " + numberToCompare);
        employeeBook.salaryBiggerNumber(employeeBook.getArrayEmployee(), numberToCompare);

        //Удалить сотрудника и добавить нового
        System.out.println("");
        int idToDelete = 4;
        System.out.println("Сотрудники после увольнения сотрудника с id " + idToDelete);
        employeeBook.deleteEmployee(employeeBook.getArrayEmployee(),idToDelete);
        employeeBook.printEmployee(employeeBook.getArrayEmployee());

        System.out.println("");
        System.out.println("Сотрудники после добавления нового с id " + idToDelete);
        employeeBook.addEmployee(employeeBook.getArrayEmployee(),"Поляков Т.В.", idToDelete, 20000);
        employeeBook.printEmployee(employeeBook.getArrayEmployee());

        //Изменить зарплату и отдел сотрудника
        String name = "Алексеева Р.А.";
        int newDepatment = 1;
        int newSalary = 150000;
        employeeBook.changeEmployee(employeeBook.getArrayEmployee(), name, newDepatment, newSalary);
        System.out.println("");
        System.out.println("Сотрудники после всех изменений");
        employeeBook.printEmployee(employeeBook.getArrayEmployee());

        //Сотрудники по отделам
        System.out.println("");
        System.out.println("Сотрудники по отделам");
        employeeBook.employeesByDepartment(employeeBook.getArrayEmployee());


    }



}