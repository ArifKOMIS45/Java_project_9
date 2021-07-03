package Lessons;


import Student.StudentClass;

import java.util.ArrayList;

public class Biology extends LessonClass {
    private ArrayList<String> topicList=new ArrayList<>();;

    public Biology(StudentClass student) {
        super(student);
    }

    @Override
   public ArrayList<String> topics() {
        topicList.add(" Ecology");
        topicList.add("  Opportunities in Biology");
        topicList.add(" Principles of Biology 1");
        topicList.add(" Principles of Biology 2");
        topicList.add("  Principles of Genetics");

        return topicList;
    }

}
