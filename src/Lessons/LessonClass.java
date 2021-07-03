package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class LessonClass {
    private static int totalCreditCount;
    private static LinkedHashMap<String, Integer> classNameAndScore=new LinkedHashMap<>();
    private  StudentClass student;

    public LessonClass(StudentClass student) {

        this.student = student;
        setCreditCount();
    }

    public abstract ArrayList<String> topics();
    //-------------------------------------------------------------------------------------------------------
     /*
    Create a constructor for the LessonClass
    parameter is StudentClass object

    make StudentClass instance variable equal to StudentClass parameter

    call the setCreditCount method  which you are expected to create below
     */

    /*
     LessonClass için constructor oluşturun

    parametresi StudentClass object

   StudentClass instance variable'ini StudentClass parametresine eşit yapın

   aşağıda oluşturmanız beklenen setCreditCount methodunu çağırın
     */
//-------------------------------------------------------------------------------------------------------
    public void setCreditCount() {
        ArrayList<String> lessonsName = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (totalCreditCount <= 7) {
            System.out.print("Which class you would like to take your options are here :" +
                    " Math , Science , Biology , Chemistry , Music = ");
            String str = scan.nextLine();
            System.out.println("totalCreditCount = " + totalCreditCount);

            if (lessonsName.contains(str))
                System.out.print("You already took this class please choose other class");
            else {
                lessonsName.add(str);
                totalCreditCount += checkCredit(str);
            }
        }
    }

    public int checkCredit(String lessonName) {
        int credit = 0;
        if (lessonName.equalsIgnoreCase("Math")) credit = 3;
        else if (lessonName.equalsIgnoreCase("Science")) credit = 4;
        else if (lessonName.equalsIgnoreCase("Biology")) credit = 2;
        else if (lessonName.equalsIgnoreCase("Chemistry")) credit = 2;
        else if (lessonName.equalsIgnoreCase("Music")) credit = 3;
        else throw new RuntimeException("You class name is not a valid class name.");
        classNameAndScore.put(lessonName, RandomNum());
        return credit;
    }

    public static int RandomNum() {
        return (int) (java.lang.Math.random() * 100 + 1);
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

}
