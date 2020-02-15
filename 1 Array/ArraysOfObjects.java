class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
    public class ArraysOfObjects
    {
        public static void main (String args[])
        {
            Student arr[] = new Student[5];
            arr[0] = new Student(1, "Anubhav Madhav");
            arr[1] = new Student(2, "Deep Shah");
            arr[2] = new Student(3, "Yashash Haridas");
            arr[3] = new Student(4, "Ayush Tamta");
            arr[4] = new Student(5, "Sai Kiran Linga");
            
            for(int i=0; i<arr.length; i++)
            {
                System.out.println("Element at "+i+" : "+arr[i].roll_no + " " + arr[i].name);
            }
        }
    
}
