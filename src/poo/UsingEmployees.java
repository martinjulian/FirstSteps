package poo;

public class UsingEmployees {

    public static void main(String[] args) {
        Employees employee1 = new Employees("juan");
        Employees employee2 = new Employees("maria");
        Employees employee3 = new Employees("laura");
        Employees employee4 = new Employees("carlos");

        employee2.setSection("Gerencia");
        employee1.setAge(32);
        employee2.setAge(45);
        employee3.setAge(22);
        employee4.setAge(49);

        System.out.println(employee1.tellMeData());
        System.out.println(employee2.tellMeData());
        System.out.println(employee3.tellMeData());
        System.out.println(employee4.tellMeData());
        System.out.println(Employees.tellMeNextId());
    }
}
    class Employees{
        public Employees(String nam){
             id = nextId;
             name=nam;
             section="Administracion";
             nextId++;
        }


        public void setSection(String section){ //setter
            this.section=section;

        }

        public String tellMeData(){ //getter
            return "el nombre es " + name + " tiene "+ age + " años, la seccion es "
                    + section+ " y su numero de id es " +id;
        }

        public static String tellMeNextId(){  //metodo static
            return "el id siguiente es "+ nextId;
        }



        public void setAge(int age){ //setter

            this.age=age;
        }

        private  final String name;
        private String section;
        private int age;
        private final int id;
        private static int nextId = 1;


    }

