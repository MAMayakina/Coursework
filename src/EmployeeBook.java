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

    public Employee[] getArrayEmployee() {
        return this.arrayEmployee;
    }

    public int minSalary(Employee[] array) {
        int minSalary = 100000000;
        for (int i = 0; i < 10; i++) {
            if (array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
            }
        }
        return minSalary;
    }

    public int maxSalary(Employee[] array) {
        int maxSalary = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
            }
        }
        return maxSalary;
    }

    public int sumSalary(Employee[] array) {
        int sumSalary = 0;
        for (int i = 0; i < 10; i++) {
            sumSalary = sumSalary + array[i].getSalary();
        }
        return sumSalary;
    }

    public void employeesName(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("id-" + array[i].getId() + ": " + array[i].getName());
        }
    }

    public Employee[] increaseSalary(Employee[] array, int parametr) {
        for (int i = 0; i < array.length; i++) {
            array[i].setSalary(array[i].getSalary() + array[i].getSalary() * parametr / 100);
        }
        return array;
    }

    public void printEmployee(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int minSalaryDepartment(Employee[] array, int department) {
        int minSalaryDepartment = 100000000;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department && array[i].getSalary() < minSalaryDepartment) {
                minSalaryDepartment = array[i].getSalary();
            }
        }
        return minSalaryDepartment;
    }

    public int maxSalaryDepartment(Employee[] array, int department) {
        int maxSalaryDepartment = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department && array[i].getSalary() > maxSalaryDepartment) {
                maxSalaryDepartment = array[i].getSalary();
            }
        }
        return maxSalaryDepartment;
    }

    public int sumSalaryDepartment(Employee[] array, int department) {
        int sumSalaryDepartment = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department) {
                sumSalaryDepartment = sumSalaryDepartment + array[i].getSalary();
            }
        }
        return sumSalaryDepartment;
    }

    public double averageSalaryDepartment(Employee[] array, int department) {
        int sumSalaryDepartment = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department) {
                sumSalaryDepartment = sumSalaryDepartment + array[i].getSalary();
                count++;
            }
        }
        double averageSalaryDepartment = sumSalaryDepartment / count;
        return averageSalaryDepartment;
    }

    public Employee[] increaseSalaryDepartment(Employee[] array, int department, int parametr) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department) {
                array[i].setSalary(array[i].getSalary() + array[i].getSalary() * parametr / 100);
            }

        }
        return array;
    }

    public void printWithoutDepartment(Employee[] array, int department) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment() == department) {
                System.out.println("id-" + array[i].getId() + ": ФИО-" + array[i].getName() + "; З/п-" + array[i].getSalary());
            }
        }
    }

    public void salarySmallerNumber(Employee[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < number) {
                System.out.println("id-" + array[i].getId() + ": ФИО-" + array[i].getName() + "; З/п-" + array[i].getSalary());
            }
        }
    }

    public void salaryBiggerNumber(Employee[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() >= number) {
                System.out.println("id-" + array[i].getId() + ": ФИО-" + array[i].getName() + "; З/п-" + array[i].getSalary());
            }
        }
    }

    public void deleteEmployee(Employee[] array, int id) {
        array[id-1].setName(null);
        array[id-1].setDepartment(0);
        array[id-1].setSalary(0);
        array[id-1].setId(0);
    }

    public void addEmployee(Employee[] array, String name, int department, int salary) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getId() == 0) {
                array[i].setName(name);
                array[i].setDepartment(department);
                array[i].setSalary(salary);
                array[i].setId(i + 1);
            }
        }
    }

    public void changeEmployee(Employee[] array, String name, int newDepartment, int newSalary) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName() == name) {
                array[i].setDepartment(newDepartment);
                array[i].setSalary(newSalary);
            }
        }
    }

    public void employeesByDepartment(Employee[] array) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники отдела " + i + ":");
            for (int j = 0; j < array.length; j++) {
                if (array[j].getDepartment() == i) {
                    System.out.println("id-" + array[j].getId() + ": " + array[j].getName());
                }
            }
        }
    }
}
