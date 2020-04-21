//second modify
import java.util.HashSet;
import java.util.Scanner;

public class StudentManager {
 Scanner sc = new Scanner(System.in);
 public int getID() {
  return ID;
 }

 public String getName() {
  return name;
 }

 public String getBirDate() {
  return birDate;
 }

 public bool getGender() {
  return gender;
 }

 public void setID(int ID) {
  this.ID = ID;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setBirDate(String birDate) {
  this.birDate = birDate;
 }

 public void setGender(bool gender) {
  this.gender = gender;
 }
 private int ID;
 private String name;
 private String birDate;
 private bool gender;

 
 public void add(StudentManager a){
  int ID1;
  String name2;
  String birdate1;
  bool gender1;
   System.out.println("请输入你要添加的学生信息");
   System.out.println("请输出学生学号");
   ID1 =sc.nextInt();
   a.setID(ID1);
   System.out.println("请输出学生姓名");
   sc.nextLine();
   name2=sc.nextLine();
   a.setName(name2);
   System.out.println("请输出学生出生日期");
   birDate1=sc.nextLine();
   a.setBirDate(birDate1);
   System.out.println("请输出学生性别");
   gender1=sc.nextInt();
   a.setGender(gender1);
 }
 public int find(String[][] a)
 {
  System.out.println("请输入你要查询学生的学号");
  int n=-1;
  int id = sc.nextInt();
  for(int i=0;i<a.length;i++)
  {
   if(Integer.parseInt(a[i][0]) == id)
   {
    n=i;
    break;
   }
  }
  return n;
 }
 public int delay(String[][] a)
 {
  System.out.println("请输入你要删除学生的学号！");
  int id;
  int n=-1;
  id= sc.nextInt();
  for(int i=0;i<a.length;i++)
  {
   if(Integer.parseInt(a[i][0])==id)
   {
    n=i;
    break;
   }
  }
  return n;
 }
 public int print(String[][] a)
 {
  System.out.println("请输入你要打印的学生学号！");
  int id;
  int n=-1;
  id = sc.nextInt();
  for(int i=0;i<a.length;i++)
  {
   if(Integer.parseInt(a[i][0]) == id)
   {
    n=i;
    break;
   }
  }
  return n;
 }
 public int recivice(String[][] a)
 {
  System.out.println("请输入你要修改的学生信息的学生学号！");
  int id;
  int n=-1;
  id = sc.nextInt();
  for(int i=0;i<a.length;i++)
  {
   if(Integer.parseInt(a[i][0]) == id)
   {
    n=i;
    break;
   }
  }
  return n;
 }
 public int Num(){
  System.out.println("选择你要修改的内容：0.学号 1.姓名 2.生日 3.性别");
  int n=sc.nextInt();
  return n;
 }
 public void display()
 {
  System.out.println("请选择操作：");
  System.out.println("***************************************");
  System.out.println("****              1插入                           ***");
  System.out.println("****              2查找                          ****");
  System.out.println("****              3删除                          ****");
  System.out.println("****              4修改                          ****");
  System.out.println("****              5输出                          ****");
  System.out.println("****              6退出                          ****");
  System.out.println("***************************************");
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  StudentManager s1 = new StudentManager();
  boolean flat = true;
  HashSet a = new HashSet();
  String[][] student=new String[4][10];
  int num=0;
  int number;
  int m,n;
  while (flat)
  {
   s1.display();
   number=sc.nextInt();
   switch (number)
   {
    case 1:
    {
     s1.add(s1);
     student[num][0]=s1.ID+"";
     student[num][1]=s1.name+"";
     student[num][2]=s1.birDate+"";
     student[num][3]=s1.gender+"";
     num++;

     break;
    }
    case 2:
    {
     m=s1.find(student);
     if(m>=0){
      System.out.println("学生学号为："+student[m][0]);
      System.out.println("学生姓名为："+student[m][1]);
      System.out.println("学生生日为："+student[m][2]);
      System.out.println("学生性别为："+student[m][3]);
     }else{
      System.out.println("学号错误,未找到学生");
      break;
     }
     break;
    }
    case 3:
    {
     m=s1.delay(student);
     for(int i=0;i<4;i++)
     {
      student[m][i]=null;
     }
     System.out.println("已经成功删除学生信息");
     break;
    }
    case 4:
    {
     m=s1.recivice(student);
     n=s1.Num();
     System.out.println("请输入你要修改的内容：");
     student[m][n]=sc.next();
     System.out.println("修改成功！");
     break;
    }
    
    case 5:
    {
     m=s1.delay(student);
     System.out.println("学号"+student[m][0]+"的学生信息为：");
     System.out.println("学生学号为："+student[m][0]);
     System.out.println("学生姓名为："+student[m][1]);
     System.out.println("学生生日为："+student[m][2]);
     System.out.println("学生性别为："+student[m][3]);
     break;
    }
    case 6:
    {
     System.out.println("程序退出！");
     flat=false;
     break;
    }
   }
  }
 }
}