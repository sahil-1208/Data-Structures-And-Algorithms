package arrays;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String arg[]) {
        Result rs = new Result();
        rs.setInfo();
        rs.setMarks();
        rs.show();
    }
}

class Student {
    Scanner sc = new Scanner(System.in);
    String name[] = new String[3];
    int age[] = new int[3];

    public void setInfo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Name");
            name[i] = sc.nextLine();
            System.out.println("Age ");
            age[i] = sc.nextInt();
            sc.nextLine();
        }
    }
}

class Marks extends Student {
    int p[] = new int[3];
    int c[] = new int[3];
    int m[] = new int[3];

    public void setMarks() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Phy ");
            p[i] = sc.nextInt();
            System.out.println("Che ");
            c[i] = sc.nextInt();
            System.out.println("Maths ");
            m[i] = sc.nextInt();
        }
    }

}

class Result extends Marks {
    int per[] = new int[3];
    int total[] = new int[3];

    public void show() {
        String div = "";
        System.out.println("S Name\tAge\tT Marks\tPer%\tDivision");
        for (int i = 0; i < 3; i++) {
            total[i] = p[i] + c[i] + m[i];
            per[i] = total[i] / 3;
            if (per[i] >= 60) {
                div = "1st";
            } else if ((per[i] >= 45) && (per[i] < 60)) {
                div = "IInd";
            } else if ((per[i] >= 33) && (per[i] < 45)) {
                div = "IIIrd";
            } else {
                div = "Gandhi";
            }
            System.out.println(name[i] + "\t" + age[i] + "\t" + total[i] + "\t" + per[i] + "\t" + div);
        }
    }
}
