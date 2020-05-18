
import java.util.HashSet;
import java.util.Scanner;
//
//聂立 2017012695 审查后
//
//
//
public class StudentManager {
    private int ID;
    private String name;
    private String birDate;
    private boolean gender;
    Scanner IN = new Scanner(System.in);

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getBirDate() {
        return birDate;
    }

    public boolean getGender() {
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

    public void setGender(boolean gender) {
        this.gender = gender;
    }

//问题编号：11
//    插入学生信息
    public void insert(StudentManager student) {
        System.out.println("请输入你要添加的学生信息");
        System.out.println("请输出学生学号");
        ID = IN.nextInt();
        student.setID(ID);
        System.out.println("请输出学生姓名");
        IN.nextLine();
        name = IN.nextLine();
        student.setName(name);
        System.out.println("请输出学生出生日期");
        birDate = IN.nextLine();
        student.setBirDate(birDate);
        System.out.println("请输出学生性别(true为男性，false为女性)");
        gender = IN.nextBoolean();
        student.setGender(gender);
    }
//查询学生信息
    public int find(String[][] a) {
        System.out.println("请输入你要查询学生的学号");
        int n = -1;
        int id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
//删除学生信息
    public int delete(String[][] a) {
        System.out.println("请输入你要删除学生的学号！");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
//打印学生信息
    public int printer(String[][] a) {
        System.out.println("请输入你要打印的学生学号！");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
//修改学生信息
    public int recivice(String[][] a) {
        System.out.println("请输入你要修改的学生信息的学生学号！");
        int id;
        int n = -1;
        id = IN.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i][0]) == id) {
                n = i;
                break;
            }
        }
        return n;
    }
//选择修改内容
    public int Num() {
        System.out.println("选择你要修改的内容：0.学号 1.姓名 2.生日 3.性别");
        int n = IN.nextInt();
        return n;
    }
//菜单选择操作
    public void display() {
        System.out.println("请选择操作：");
        System.out.println("****************");
//        问题标号：13
//        System.out.println("****              1插入                           ***");
//        System.out.println("****              2查找                          ****");
//        System.out.println("****              3删除                          ****");
//        System.out.println("****              4修改                          ****");
//        System.out.println("****              5输出                          ****");
//        System.out.println("****              6退出                          ****");
        System.out.println("****1插入***");
        System.out.println("****2查找****");
        System.out.println("****3删除****");
        System.out.println("****4修改****");
        System.out.println("****5输出****");
        System.out.println("****6退出****");
        System.out.println("**************");
    }

    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        StudentManager s1 = new StudentManager();
        boolean flag = true;
        HashSet a = new HashSet();
        String[][] student = new String[4][10];
        int num = 0;
        int number;
        int m, n;
        while (flag) {
            s1.display();
            number = IN.nextInt();
            switch (number) {
                case 1: {
                    s1.insert(s1);
                    student[num][0] = s1.ID + "";
                    student[num][1] = s1.name + "";
                    student[num][2] = s1.birDate + "";
                    student[num][3] = s1.gender + "";
                    num++;

                    break;
                }
                case 2: {
                    m = s1.find(student);
                    if (m >= 0) {
                        System.out.println("学生学号为：" + student[m][0]);
                        System.out.println("学生姓名为：" + student[m][1]);
                        System.out.println("学生生日为：" + student[m][2]);
                        System.out.println("学生性别为：" + student[m][3]);
                    } else {
                        System.out.println("学号错误,未找到学生");
                        break;
                    }
                    break;
                }
                case 3: {
                    m = s1.delete(student);
                    for (int i = 0; i < 4; i++) {
                        student[m][i] = null;
                    }
                    System.out.println("已经成功删除学生信息");
                    break;
                }
                case 4: {
                    m = s1.recivice(student);
                    n = s1.Num();
                    System.out.println("请输入你要修改的内容：");
                    student[m][n] = IN.next();
                    System.out.println("修改成功！");
                    break;
                }

                case 5: {
                    m = s1.printer(student);
                    System.out.println("学号" + student[m][0] + "的学生信息为：");
                    System.out.println("学生学号为：" + student[m][0]);
                    System.out.println("学生姓名为：" + student[m][1]);
                    System.out.println("学生生日为：" + student[m][2]);
                    System.out.println("学生性别为：" + student[m][3]);
                    break;
                }
                case 6: {
                    System.out.println("程序退出！");
                    flag = false;
                    break;
                }
            }
        }
    }
}