package bai5_access_modifier_static_method_static_property.thuc_hanh_5;

public class Student {
        private int rollno;
        private String name;
        public static String college = "BBDIT";
        Student(int r,String n){
                rollno = r;
                name = n;
        }
        static void change(){
                college = "CODEGYM";
        }
        void display(){
                System.out.println(rollno + " "+ name+ " "+ college);
        }

}

