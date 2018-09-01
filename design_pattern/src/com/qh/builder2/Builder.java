package com.qh.builder2;

public class Builder {

    static class Student{
        String name = null ;
        int number = -1 ;
        String sex = null ;
        int age = -1 ;
        String school = null ;

        static class StudentBuilder{
            String name = null ;
            int number = -1 ;
            String sex = null ;
            int age = -1 ;
            String school = null ;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getSchool() {
                return school;
            }

            public void setSchool(String school) {
                this.school = school;
            }

            @Override
            public String toString() {
                return "StudentBuilder{" +
                        "name='" + name + '\'' +
                        ", number=" + number +
                        ", sex='" + sex + '\'' +
                        ", age=" + age +
                        ", school='" + school + '\'' +
                        '}';
            }
            public Student build(){
                return new Student(this);
            }
        }

        public Student(StudentBuilder studentBuilder){
            this.age=studentBuilder.age;
            this.name=studentBuilder.name;
            this.number=studentBuilder.number;
            this.sex=studentBuilder.sex;
            this.school=studentBuilder.school;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    ", sex='" + sex + '\'' +
                    ", age=" + age +
                    ", school='" + school + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student.StudentBuilder studentBulider = new Student.StudentBuilder();
        studentBulider.setAge(24);
        studentBulider.setName("qiaohan");
        Student s = studentBulider.build();
        System.out.println(s);
    }
}
