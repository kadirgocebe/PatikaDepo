

public class Employee {


    String name;
    double salary;
    int workHours;
    int hireYear;

Employee(String name, double salary, int workHours, int hireYear){

    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;

}

Double Tax(double salary){
    double tax=0;

    if(this.salary>1000){

       tax= this.salary *0.03;
    }
    return tax;

}

Double Bonus(int workHours){
double bonus=0;
if(workHours>40){
bonus = (workHours-40)*30;

}
return bonus;
}

Double raiseSalary(int hireYear){
    double raise=0;
    int fark = 2021 - hireYear;
    if(fark<10){

        raise = salary*0.05;
    }
    if(fark>9 && fark<20){

        raise = salary*0.10;
    }
    if(fark>19){

        raise = salary*0.15;
    }
    return raise;
}

void Yazdir(){

    System.out.println(" Çalışanın Adı :" +name);
    System.out.println(" Çalışanın Baz Maaşı :" +salary);
    System.out.println(" Toplam Çalışma Saati :" +workHours);
    System.out.println(" Çalışanın Başlangıç Yılı :" +hireYear);
    System.out.println(" Uygulanan Vergi :" +Tax(salary));
    System.out.println(" Çalışanın Kazandığı Bonus :" +Bonus(workHours));
    System.out.println(" Vergiler ve Bonuslar ile Maaş :" +(salary-Tax(salary)+Bonus(workHours)));
    System.out.println(" Ele geçen Maaş :" +(salary-Tax(salary)+Bonus(workHours)+raiseSalary(hireYear)));
}



public static void main(String[] args) {
        
    Employee e1 = new Employee("Kadir", 2000, 45, 1985);
    e1.Yazdir();
    System.out.println(" ============ 0 ===========");
    Employee e2 = new Employee("Pelin", 3000, 35, 2000);
    e2.Yazdir();
}

}
