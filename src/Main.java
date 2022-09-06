public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // Вывод всех сотрудников
        System.out.println("Сотрудники");
        employeeBook.printEmployee();

        //Вывод статистических данных по з/п
        System.out.println();
        System.out.println("Статистические данные по з/п");
        System.out.println("Минимальная з/п: " +  employeeBook.minSalary());
        System.out.println("Максимальная з/п: " +  employeeBook.maxSalary());
        System.out.println("Сумма затрат на з/п в месяц: " +  employeeBook.sumSalary());
        System.out.println("Средняя з/п: " +  employeeBook.sumSalary() / employeeBook.numberEmployee);

        //Сотруднки ФИО
        System.out.println();
        System.out.println("ФИО сотрудников:");
        employeeBook.employeesName();

        // Увеличение з/п на параметр
        System.out.println();
        int percentageIncrease = 50;
        employeeBook.increaseSalary(percentageIncrease);

        System.out.println("Сотрудники после увеличения з/п на " + percentageIncrease + "%");
        employeeBook.printEmployee();


        // Статистические данные по отделу
        int numberDepartment = 2;
        System.out.println();
        System.out.println("Статистические данные по з/п по отделу " + numberDepartment);
        System.out.println("Сумма затрат на з/п в месяц: " +  employeeBook.sumSalaryDepartment(numberDepartment));
        System.out.println("Минимальная з/п: " +  employeeBook.minSalaryDepartment(numberDepartment));
        System.out.println("Максимальная з/п: " +  employeeBook.maxSalaryDepartment(numberDepartment));
        System.out.println("Средняя з/п: " +  employeeBook.averageSalaryDepartment(numberDepartment));


        //Увеличение з/п по отделу
        System.out.println();
        System.out.println("Сотрудники отдела " + numberDepartment + " после увеличения з/п на " + percentageIncrease + "%");
        employeeBook.increaseSalaryDepartment(numberDepartment, percentageIncrease);
        employeeBook.printWithoutDepartment(numberDepartment);

        //Сотрудники с з/п меньше/больше числа
        int numberToCompare = 200000;
        System.out.println();
        System.out.println("Сотрудники c з/п меньше, чем " + numberToCompare);
        employeeBook.salarySmallerNumber(numberToCompare);
        System.out.println();
        System.out.println("Сотрудники c з/п больше, чем " + numberToCompare);
        employeeBook.salaryBiggerNumber(numberToCompare);

        //Удалить сотрудника и добавить нового
        System.out.println("");
        int idToDelete = 4;
        System.out.println("Сотрудники после увольнения сотрудника с id " + idToDelete);
        employeeBook.deleteEmployee(idToDelete);
        employeeBook.printEmployee();

        System.out.println("");
        System.out.println("Сотрудники после добавления нового с id " + idToDelete);
        employeeBook.addEmployee("Поляков Т.В.", idToDelete, 20000);
        employeeBook.printEmployee();

        //Изменить зарплату и отдел сотрудника
        String name = "Алексеева Р.А.";
        int newDepatment = 1;
        int newSalary = 150000;
        employeeBook.changeEmployee(name, newDepatment, newSalary);
        System.out.println("");
        System.out.println("Сотрудники после всех изменений");
        employeeBook.printEmployee();

        //Сотрудники по отделам
        System.out.println("");
        System.out.println("Сотрудники по отделам");
        employeeBook.employeesByDepartment();
    }
}