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
   System.out.println("��������Ҫ��ӵ�ѧ����Ϣ");
   System.out.println("�����ѧ��ѧ��");
   ID1 =sc.nextInt();
   a.setID(ID1);
   System.out.println("�����ѧ������");
   sc.nextLine();
   name2=sc.nextLine();
   a.setName(name2);
   System.out.println("�����ѧ����������");
   birDate1=sc.nextLine();
   a.setBirDate(birDate1);
   System.out.println("�����ѧ���Ա�");
   gender1=sc.nextInt();
   a.setGender(gender1);
 }
 public int find(String[][] a)
 {
  System.out.println("��������Ҫ��ѯѧ����ѧ��");
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
  System.out.println("��������Ҫɾ��ѧ����ѧ�ţ�");
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
  System.out.println("��������Ҫ��ӡ��ѧ��ѧ�ţ�");
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
  System.out.println("��������Ҫ�޸ĵ�ѧ����Ϣ��ѧ��ѧ�ţ�");
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
  System.out.println("ѡ����Ҫ�޸ĵ����ݣ�0.ѧ�� 1.���� 2.���� 3.�Ա�");
  int n=sc.nextInt();
  return n;
 }
 public void display()
 {
  System.out.println("��ѡ�������");
  System.out.println("***************************************");
  System.out.println("****              1����                           ***");
  System.out.println("****              2����                          ****");
  System.out.println("****              3ɾ��                          ****");
  System.out.println("****              4�޸�                          ****");
  System.out.println("****              5���                          ****");
  System.out.println("****              6�˳�                          ****");
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
      System.out.println("ѧ��ѧ��Ϊ��"+student[m][0]);
      System.out.println("ѧ������Ϊ��"+student[m][1]);
      System.out.println("ѧ������Ϊ��"+student[m][2]);
      System.out.println("ѧ���Ա�Ϊ��"+student[m][3]);
     }else{
      System.out.println("ѧ�Ŵ���,δ�ҵ�ѧ��");
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
     System.out.println("�Ѿ��ɹ�ɾ��ѧ����Ϣ");
     break;
    }
    case 4:
    {
     m=s1.recivice(student);
     n=s1.Num();
     System.out.println("��������Ҫ�޸ĵ����ݣ�");
     student[m][n]=sc.next();
     System.out.println("�޸ĳɹ���");
     break;
    }
    
    case 5:
    {
     m=s1.delay(student);
     System.out.println("ѧ��"+student[m][0]+"��ѧ����ϢΪ��");
     System.out.println("ѧ��ѧ��Ϊ��"+student[m][0]);
     System.out.println("ѧ������Ϊ��"+student[m][1]);
     System.out.println("ѧ������Ϊ��"+student[m][2]);
     System.out.println("ѧ���Ա�Ϊ��"+student[m][3]);
     break;
    }
    case 6:
    {
     System.out.println("�����˳���");
     flat=false;
     break;
    }
   }
  }
 }
}