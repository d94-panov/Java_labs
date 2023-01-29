package UrFU.first_course.lectures.lecture6;

class Abstract_Classes_Employee extends Abstract_Classes_Person {
    private String bank;

    public Abstract_Classes_Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {
        System.out.println("Employee Name: " + super.getName()
                             + " Bank: " + bank);
    }
}

class Client extends Abstract_Classes_Person {
    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {
        System.out.println("Client Name: " + super.getName() + " Bank " + bank);
    }
}
