//package com.javapractice.practice;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class IO {
//
//    public static void main(String[] args) throws IOException {
//
//        // read and write bytes using println
////        byte[] bytes = new byte[1];
////        System.out.print("enter bytes: ");
////        System.in.read(bytes);
////
////        for (byte b : bytes)
////
////            System.out.println(b);
//
//        //output byte using write()
////        int in = 'B';
////
////        System.out.write(in); //writes to this stream
////        //why was it buffered/stored temporarily? hmm...print or println doesn't do this. Alright. it flushes only when it sees a new line.
////        System.out.flush();
//
//        //FIleInputStream
//        //so close() will be called only when file is open / exists
////        FileInputStream inStream = null;
////
////        try {
////            // show how to use run program
////            if (args.length != 1) {
////                System.out.println("Usage: IO 'filename'");
////                return; //don't continue progrAM
////            }
////            //open file
////            inStream = new FileInputStream(args[0]); //file allocated and opened
////
////            int intOfByte;
////            //loop through file bytes
////            do {
////                // store output of each byte-int conversion
////                intOfByte = inStream.read();
////                System.out.print((char) intOfByte); //I need the char equivalent
////            } while (intOfByte != -1);
////        }
////        catch (FileNotFoundException e) {
////            System.out.println("sorry. file isn't in directory."); //catch filNotFound separately
////        }
////        catch(IOException e) {
////            System.out.println(e); //prints content of toString in exception
////        } finally {
////            //close file
////            if (inStream != null) { // close only if file was opened
////                inStream.close();
////                System.out.println(); //move to next line
////            }
////        }
//
//        //FileOutPutStream and FileInputStream in copy a file to another
//        //instantiate input reader
////        var inStream = new FileInputStream(args[0]);
////        var outStream = new FileOutputStream(args[1]);
////        //declare contentIndex and charHolder
////        int contentIndex;
////        //String strHolder;
////
////        //check whether program is used properly
////        if (args.length != 2) {
////            System.out.println("Bad number of arguments. \n Right usage is IO.java <inputfile.extension> <outputfile.extension>");
////            return;
////        }
////        // try to open, read and write
////        try (inStream; outStream)
////        {
////            do { //body runs before getting to while(). Beware!
////
////                contentIndex = inStream.read(); //returns -1 at end of stream or if empty initially
////                if (contentIndex != -1) {
////                    if (contentIndex == ' ') {
////                        contentIndex = (int) '-';
////                    }
////                    outStream.write(contentIndex);
////                }
////            } while (contentIndex != -1);
////
////        }
////        catch (IOException e) {
////            System.out.println(e);
////        }
//
//        //using DataOutputStream
//        //try writing types
////        try (DataOutputStream outStream = new DataOutputStream(new FileOutputStream("output.txt")))
////        {
////            int i = 10;
////            double d = 1.2;
////            boolean bool = true;
////
////            outStream.writeInt(i);
////            outStream.writeDouble(d);
////            outStream.writeBoolean(bool);
////
////        } catch(IOException e) {
////            System.out.println(e);
////        }
//        //try to read binary data
////        try (DataInputStream inStream = new DataInputStream(new FileInputStream("input.txt")))
////        {
////            int i = inStream.readInt();
////            System.out.println("int value was: " + i);
////
////            double d = inStream.readDouble();
////            System.out.println("double value was: " + d);
////
////            boolean b = inStream.readBoolean();
////            System.out.println("boolean value was: " + b);
////        } catch (IOException e) {
////            System.out.println(e);
////        }
//
//        //program compares contents of two
//        //check if run was done rightly
////        if (args.length != 2) {
////            System.out.println("Usage: IO.java <file1> <file2>");
////            return;
////        }
//
//        //declare contentIndex
////        String i, j;
////        String eofValue = (char) -1 + "";
////
////        //instantiate input sources
////        var input1 = new FileInputStream(args[0]);
////        var input2 = new FileInputStream(args[1]);
////        //try to compare
////        try (input1; input2)
////        {
////            do {
////                i = (char) input1.read() + ""; //can only be read sequentually: byte after byte
////                j = (char) input2.read() + "";
////                if (!i.equalsIgnoreCase(j)) {//if different, print difference
////                    System.out.println("Found difference!");
////                    System.out.println("char in input1.txt is " + i + ", while that in input2.txt is " + j + ".");
////                    break;
////                }
////            } while ((!i.equals(eofValue)) && (!j.equals(eofValue)));
////
////            if (!i.equalsIgnoreCase(j)) {
////                System.out.println("files differ.");
////            } else {
////                System.out.println("files are the same.");
////            }
////        }
////        catch (IOException e) {
////            System.out.println(e);
////        }
//
//        //RandomAccessFile
//        //using to write booleans to a file and read them(meanwhile printing on console)
////        boolean[] booleans = {true, false, true, false}; //takes 2 bytes to represent a boolean value
////        RandomAccessFile randAccessFile = new RandomAccessFile(args[0], "rw");
////        try (randAccessFile)
////        {
////            System.out.println("About to write booleans...");
////            for (boolean b: booleans)
////                randAccessFile.writeBoolean(b); //booleans written
////            //declare boolHolder
////            boolean bool;
////            //now, read second and 4th boolean
////            randAccessFile.seek(1); //be at byte at position 1. Inference: it takes one byte to represent a boolean value
////            bool = randAccessFile.readBoolean();
////            System.out.println("Second boolean is " + bool);
////            randAccessFile.seek(3); //be at byte at position 3
////            bool = randAccessFile.readBoolean();
////            System.out.println("fourth boolean is " + bool);
////        }
////        catch(IOException e) {
////            System.out.println(e);
////        }
//
//        //Using Console. A convenience class which simplifies reading strings from the console
////        Console console = System.console();
////        System.out.print("enter pass: ");
////        String string = String.valueOf(console.readPassword());
////        System.out.println(string);
//
//        //CHaracter-based Streams: streams that read chars
//        //BufferedReader
//        //instantiate bufferedReader
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        //declare charHolder
////        char charHolder;
////        //print inputed char except '.' is inputed
////        do {
////            System.out.println("Enter character below:");
////            charHolder = (char) bufferedReader.read(); //returns int of char, hence I convert
////            if (charHolder != '.')
////                System.out.println(charHolder);
////            else
////                System.out.println("Program ended.");
////        } while (charHolder != '.');
//
//        //PrintWriter: preferred method for writing to the console. Writes characters to console
////        PrintWriter printWriter = new PrintWriter(System.out, true);
////        int integer = 5;
////        char blah = 'c';
////        printWriter.println(integer);
////        printWriter.println(blah);
////
////        System.out.write(100000);
////        System.out.write('\n');
//
//        //Using FileWriter to write to perform a key-to-disk run
//        //instantiate char console reader
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        //declare string holder
////        String strHolder;
////        //instantiate file writer
////        FileWriter fw = new FileWriter("output.txt", true);
////
////        //try
////        try (bufferedReader; fw)
////        {
////            System.out.println("enter words below:");
////            System.out.println("Note: Program ends when 'stop' is entered.");
////            do {
////
////                strHolder = bufferedReader.readLine();
////                // was 'stop' entered?
////                if (strHolder.compareTo("stop") == 0)
////                    break;
////                //append new line
////                strHolder = strHolder + ("\r\n");
////                //write to output file
////                fw.append('b').write(strHolder);
////            } while (strHolder.compareTo("stop") != 0);
////        } catch(IOException e) {
////            System.out.println(e);
////        }
//
//        //Using FileReader
//        //Instantiate file_reader with file and writer with file
//        BufferedReader bReader = new BufferedReader(new FileReader(args[0]));
//        FileWriter fw = new FileWriter(args[1]);
//
//        //declare string holder
//        String stringHolder;
//        //algorithm proper
//        try (bReader; fw)
//        {
//            do {
//                stringHolder = bReader.readLine();
//                if (stringHolder != null) {
//                    stringHolder = stringHolder.replace(' ', '-');
//                    fw.write(stringHolder);
//                }
//            } while (stringHolder != null);
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }
//
////        Help help = new Help("HelpFile.txt"); //pass help file
////        String topic; //topic Holder
////        System.out.println("Try the help system. " + "Enter 'stop' to end.");
////
////        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in)); // System.in closes automatically
////
////        do {
////            topic = help.getSelection(breader); // gets user-entered topic
////
////            if(!help.helpOn(topic)) // if topic is not found, print below. Else, provide input prompt again
////                System.out.println("Topic not found.\n");
////        } while(topic.compareTo("stop") != 0);
////    }
////}
////
////class Help {
////
////    String helpfile; //file containing help
////
////    Help(String topic) {
////        helpfile = topic;
////    }
////    //create selection subroutine
////    //get selection as string from console
////    String getSelection(BufferedReader breader) {
////
////        // instantiate stringHolder
////        String topic = null;
////
////        System.out.println("Enter topic:");
////        //try to read selection
////        try //stream closes after first input. Why? since we are looping, when control comes here again, the stream will be closed. Why not open it again?. How does it recognise that the old stream is what we need? Perhaps only one instance of a particular stream can be used in a process! And this is true!
////        {
////            topic = breader.readLine(); //provides console input ability and stores input
////        }catch (IOException e) {
////            System.out.println(e);
////        }
////        return topic;
////    }
////
////    //returns whether topic is present in helpfile.txt and prints contents of help topic
////    boolean helpOn(String whatTopic) {
////        //declaare char holder, topicHolder and contentHolder
////        int charHolder;
////        String topicHolder, contentHolder;
////
////        //check HelpFile.txt
////        try (BufferedReader bReader = new BufferedReader(new FileReader("HelpFile.txt")))
////        {
////            //find #
////            do {
////                charHolder = (char) bReader.read();
////                //compare topic
////                if (charHolder == '#') { //when # is found
////                    topicHolder = bReader.readLine(); //read remainder of line, which is topic.
////                    if (whatTopic.compareTo(topicHolder) == 0) { //topic found! yay!
////                        //print topic content
////                        do {
////                            contentHolder = bReader.readLine(); //read first line
////                            if (contentHolder != null) //if line wasn't empty
////                                System.out.println(contentHolder); //display line
////
////                        } while (contentHolder != null && contentHolder.compareTo("") != 0); //while content isn't finished
////
////                        return true; //when content is finished.
////                    }
////                }
////            } while (charHolder != -1); //while stream isn't finished
////        }
////        catch (IOException e) {
////            System.out.println(e);
////            return false; //if file isn't found
////        }
////        return false; //if topic isn't found.
//
//        //using Sacnner to read numeric strings from the console
////        Scanner scanner = new Scanner(System.in);
////        int input = 0;
////        System.out.print("Enter integer: ");
////        if (scanner.hasNextInt())
////            input = scanner.nextInt(); //returns 0 if not int
////        System.out.println(input);
//
////        double d = Double.parseDouble("123.23");
////        System.out.println(d);
//    }
//}
