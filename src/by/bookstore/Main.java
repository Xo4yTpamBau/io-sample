package by.bookstore;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//
//        int i;
//        while ((i = fileInputStream.read()) != -1) {
//            System.out.print((char) i);
//        }
//
//        byte[] bytes = fileInputStream.readAllBytes();
//
//        fileInputStream.close();

//        FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true);

//        fileOutputStream.write(72);
//        fileOutputStream.write(72);
//        fileOutputStream.write(10);

//        fileOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        byte[] bytes = fileInputStream.readAllBytes();
//        fileInputStream.close();
//
//        FileOutputStream fileOutputStream = new FileOutputStream("Test2.txt");
//        fileOutputStream.write(bytes);
//        fileOutputStream.close();
//        file("test.txt", "test2.txt");
//    }

//    public static void file(String file, String file2) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream(file);
//        FileOutputStream fileOutputStream = new FileOutputStream(file2);
//        int i;
//        while ((i = fileInputStream.read()) != -1) {
//            fileOutputStream.write(i);
//        }
//        fileInputStream.close();
//        fileOutputStream.close();
//    }

//        char[] buff = new char[20];
//        FileReader fileReader = new FileReader("test.txt");
//        fileReader.read(buff);
//        System.out.println(buff);
//
//        FileWriter fileWriter = new FileWriter("test.txt", true);
//        fileWriter.write("Hello");
//        fileWriter.write("\n");
//        fileWriter.close();
//        file("test.txt", "tst2.txt");


//        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            String[] s = line.split(" ");
//        }
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt"));
//        bufferedWriter.write("asdsad");
//        bufferedWriter.write("asdsad");
//        bufferedWriter.write("asdsad");
//        bufferedWriter.flush();
//    }

//    public static void file(String file, String file2) throws IOException {
//        FileReader fileReader = new FileReader(file);
//        char[] buff = new char[20];
//        fileReader.read(buff);
//        fileReader.close();
//
//        FileWriter fileWriter = new FileWriter(file2);
//        fileWriter.write(buff);
//        fileWriter.close();
//    }

//    public static void file(String file, String file2) throws IOException {
//    FileReader fileReader = new FileReader(file);
//    FileWriter fileWriter = new FileWriter(file2);
//    int i;
//    while ((i = fileReader.read()) != -1){
//        fileWriter.write(i);
//    }
//    fileReader.close();
//    fileWriter.close();
//    }
//        System.out.println(min("test.txt"));
//        System.out.println(max("test.txt"));
//
//    }
//        public static int min (String file) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("Test.txt"));
//            String line;
//            while ((line = bufferedReader.readLine()) != null){
//                String[] s = line.split(" ");
//                int min = Integer.parseInt(s[0]);
//                for (String s1 : s) {
//                    if (min > Integer.parseInt(s1)) min = Integer.parseInt(s1);
//                }
//                return min;
//            }
//            return -1;
//    }
//
//    public static int max (String file) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("Test.txt"));
//        String line;
//        while ((line = bufferedReader.readLine()) != null){
//            String[] s = line.split(" ");
//            int max = Integer.parseInt(s[0]);
//            for (String s1 : s) {
//                if (max < Integer.parseInt(s1)) max = Integer.parseInt(s1);
//            }
//    return max;
//        }
//        return  -1;
//    }
        file("test.txt","test2.txt");
    }
        public static void file (String file,String file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        int i;
        int a = 0, b = 0;
           while((i = fileInputStream.read()) != -1){
               if (i > 47 && i < 58){
                   fileOutputStream.write(i);
                   b = 1;
               } else {
                   a = 1;
               }
               if (a == 1 && b == 1){
                   fileOutputStream.write(32);
                   b = 0;
               }
               a = 0;

           }
           fileInputStream.close();
           fileOutputStream.close();
    }
}
