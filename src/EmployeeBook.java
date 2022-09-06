class EmployeeBook {
    int numberEmployee = 10;
    private Employee[] arrayEmployee = new Employee[numberEmployee];

    private EmployeeBook(Employee[] arrayEmployee) {
        this.arrayEmployee = arrayEmployee;
    }

    EmployeeBook() {
        arrayEmployee[0] = new Employee("Иванов И.П.", 1, 130000);
        arrayEmployee[1] = new Employee("Петров К.С.", 2, 100000);
        arrayEmployee[2] = new Employee("Сидорова И.Ю.", 3, 150000);
        arrayEmployee[3] = new Employee("Савельева О.А.", 4, 200000);
        arrayEmployee[4] = new Employee("Спиридонов А.В.", 5, 250000);
        arrayEmployee[5] = new Employee("Рябова И.Л.", 5, 220000);
        arrayEmployee[6] = new Employee("Сидорова И.Ю.", 3, 150000);
        arrayEmployee[7] = new Employee("Елизарова И.А.", 1, 100000);
        arrayEmployee[8] = new Employee("Игнатьев А.В.", 2, 80000);
        arrayEmployee[9] = new Employee("Алексеева Р.А.", 2, 90000);
    }

    public int minSalary() {
        int minSalary = 100000000;
        for (int i = 0; i < 10; i++) {
            if (arrayEmployee[i].getSalary() < minSalary) {
                minSalary = arrayEmployee[i].getSalary();
            }
        }
        return minSalary;
    }

    public int maxSalary() {
        int maxSalary = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayEmployee[i].getSalary() > maxSalary) {
                maxSalary = arrayEmployee[i].getSalary();
            }
        }
        return maxSalary;
    }

    public int sumSalary() {
        int sumSalary = 0;
        for (int i = 0; i < 10; i++) {
            sumSalary = sumSalary + arrayEmployee[i].getSalary();
        }
        return sumSalary;
    }

    public void employeesName() {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println("id-" + arrayEmployee[i].getId() + ": " + arrayEmployee[i].getName());
        }
    }

    public Employee[] increaseSalary(int parametr) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            arrayEmployee[i].setSalary(arrayEmployee[i].getSalary() + arrayEmployee[i].getSalary() * parametr / 100);
        }
        return arrayEmployee;
    }

    public void printEmployee() {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println(arrayEmployee[i]);
        }
    }

    public int minSalaryDepartment(int department) {
        int minSalaryDepartment = Integer.MAX_VALUE;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department && arrayEmployee[i].getSalary() < minSalaryDepartment) {
                minSalaryDepartment = arrayEmployee[i].getSalary();
            }
        }
        return minSalaryDepartment;
    }

    public int maxSalaryDepartment(int department) {
        int maxSalaryDepartment = Integer.MIN_VALUE;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department && arrayEmployee[i].getSalary() > maxSalaryDepartment) {
                maxSalaryDepartment = arrayEmployee[i].getSalary();
            }
        }
        return maxSalaryDepartment;
    }

    public int sumSalaryDepartment(int department) {
        int sumSalaryDepartment = 0;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department) {
                sumSalaryDepartment = sumSalaryDepartment + arrayEmployee[i].getSalary();
            }
        }
        return sumSalaryDepartment;
    }

    public double averageSalaryDepartment(int department) {
        int sumSalaryDepartment = 0;
        int count = 0;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department) {
                sumSalaryDepartment = sumSalaryDepartment + arrayEmployee[i].getSalary();
                count++;
            }
        }
        double averageSalaryDepartment = sumSalaryDepartment / count;
        return averageSalaryDepartment;
    }

    public Employee[] increaseSalaryDepartment(int department, int parametr) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department) {
                arrayEmployee[i].setSalary(arrayEmployee[i].getSalary() + arrayEmployee[i].getSalary() * parametr / 100);
            }
        }
        return arrayEmployee;
    }

    public void printWithoutDepartment(int department) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getDepartment() == department) {
                System.out.println("id-" + arrayEmployee[i].getId() + ": ФИО-" + arrayEmployee[i].getName() + "; З/п-" + arrayEmployee[i].getSalary());
            }
        }
    }

    public void salarySmallerNumber(int number) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getSalary() < number) {
                System.out.println("id-" + arrayEmployee[i].getId() + ": ФИО-" + arrayEmployee[i].getName() + "; З/п-" + arrayEmployee[i].getSalary());
            }
        }
    }

    public void salaryBiggerNumber(int number) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getSalary() >= number) {
                System.out.println("id-" + arrayEmployee[i].getId() + ": ФИО-" + arrayEmployee[i].getName() + "; З/п-" + arrayEmployee[i].getSalary());
            }
        }
    }

    public void deleteEmployee(int id) {
        arrayEmployee[id-1].setName(null);
        arrayEmployee[id-1].setDepartment(0);
        arrayEmployee[id-1].setSalary(0);
        arrayEmployee[id-1].setId(0);
    }

    public void addEmployee(String name, int department, int salary) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getId() == 0) {
                arrayEmployee[i].setName(name);
                arrayEmployee[i].setDepartment(department);
                arrayEmployee[i].setSalary(salary);
                arrayEmployee[i].setId(i + 1);
            }
        }
    }

    public void changeEmployee(String name, int newDepartment, int newSalary) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getName() == name) {
                arrayEmployee[i].setDepartment(newDepartment);
                arrayEmployee[i].setSalary(newSalary);
            }
        }
    }

    public void employeesByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники отдела " + i + ":");
            for (int j = 0; j < arrayEmployee.length; j++) {
                if (arrayEmployee[j].getDepartment() == i) {
                    System.out.println("id-" + arrayEmployee[j].getId() + ": " + arrayEmployee[j].getName());
                }
            }
        }
    }
}
