package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    private JsonUtil() {

    }

    public static String serialStudent(Student student) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(student);
        return str;
    }

    public static List<String> serialStudentCollection(List<Student> students) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            String str = gson.toJson(student);
            result.add(str);
        }
        return result;
    }

    public static String serialUniversity(University university) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(university);
        return str;
    }

    public static List<String> serialUniversityCollection(List<University> universities) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<String> result = new ArrayList<>();
        for (University university : universities) {
            String str = gson.toJson(university);
            result.add(str);
        }
        return result;
    }

    public static Student deserialStudent(String jsonStudent) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Student student = gson.fromJson(jsonStudent, Student.class);
        return student;
    }

    public static List<Student> deserialStudentCollection(List<String> jsonStudents) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Student> result = new ArrayList<>();
        for (String jsonStudent : jsonStudents) {
            Student student = gson.fromJson(jsonStudent, Student.class);
            result.add(student);

        }
        return result;
    }

    public static University deserialUniversity(String jsonUniversity) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        University university = gson.fromJson(jsonUniversity, University.class);
        return university;
    }

    public static List<University> deserialUniversityCollection(List<String> jsonUniversitys) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<University> result = new ArrayList<>();
        for (String jsonUniversity : jsonUniversitys) {
            University university = gson.fromJson(jsonUniversity, University.class);
            result.add(university);

        }
        return result;
    }
}
