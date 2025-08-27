class Student{
        String name;
        static String school;
    }
    public class OOPS
    {
        public static void main(String args[])
        {
            Student.school = "XYZ";
            Student s1 = new Student();
            Student s2 = new Student();

            s1.name = "John";
            String a1 = s1.name + " studies at " + Student.school;
            System.out.println(a1);

            s2.name = "Raj";
            String a2 = s2.name + " studies at " + Student.school;
            System.out.println(a2);
        }
    }
