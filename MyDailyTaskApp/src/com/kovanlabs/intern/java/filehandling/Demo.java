package com.kovanlabs.intern.java.filehandling;

import java.io.*;


public class Demo {
    public static void main(String[] args){
        String filename = "C:\\Users\\bvign\\KovanLabs\\java\\WeeklyTask\\src\\com\\kovanlabs\\intern\\java\\filehandling\\myFile.txt";
//        try(FileReader fr = new FileReader(filename)){
//            while(fr.ready()) {
//                System.out.print((char) fr.read());
//            }
//            System.out.println();
//            fr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Type something: ");
            int data = isr.read();
            while(isr.ready()) {
                System.out.print((char) data);
                data=isr.read();

            }
//            isr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//
//        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
//            while(br.ready()) {
//                System.out.print((char) br.read());
//            }
//            System.out.println();
////            fr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try(FileWriter fw = new FileWriter(filename)){
//            fw.write("hello ");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
//            bw.write("Hello java");
//        }
//        catch(IOException e){
//
//        }


    }
}
