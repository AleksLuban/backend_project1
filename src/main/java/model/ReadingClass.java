package model;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadingClass {

    private ReadingClass() {

    }

    public static ArrayList<Student> readStudents() {

        ArrayList<Student> list1 = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\universityInfo.xlsx");
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Студенты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                Student student = new Student(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue(), row.getCell(2).getNumericCellValue(), row.getCell(3).getNumericCellValue());
                list1.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list1;
    }

    public static ArrayList<University> readUniversity() {

        ArrayList<University> list2 = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\universityInfo.xlsx");
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Университеты");
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                StudyProfile studyProfile = StudyProfile.valueOf(row.getCell(4).getStringCellValue());
                University university = new University(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue(),row.getCell(3).getNumericCellValue(),studyProfile);
                list2.add(university);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list2;
    }
}
