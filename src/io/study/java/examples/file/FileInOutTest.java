package io.study.java.examples.file;
import java.io.File;

public class FileInOutTest {
    public static void main(String[] args) {
        File m_file = new File("FileTest");

        System.out.println(m_file.exists());

    }
}
