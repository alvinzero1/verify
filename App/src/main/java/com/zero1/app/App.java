/* www.Zero1.Sg 2022Dec */
package com.zero1.app;

public class App {

    public static void main(String args[]) {

        var logfile = "logmessages.txt";

        System.out.println("SubString key and name, to hashmap.");

//        String primaryPath = ("D:\\temp");
//        String targetPath = ("C:\\Users\\AlvinNg\\Zero1 Pte Ltd\\Portal - ToBeDeleted\\201808");
//        var m = new Main(primaryPath, targetPath);
//        m.addPrimarypathFilenameToHashmap("C:\\Users\\AlvinNg\\Zero1 Pte Ltd\\Portal - ToBeDeleted\\201809");
//
        String primaryPath = "D:\\temp2";
        String targetPath = "C:\\testdata\\test1";
        var m = new Main(primaryPath, targetPath);

        System.out.println(m.info + "\n"
                + "> row count: " + m.getPrimaryLineCount() + "\n"
                + "> Hashmap size: " + m.getHashmapSize() + "\n"
                + ">> files count: " + m.getTargetFileChkCount());

        if (m.getMode() != 2) {
            m.setErrPrint(">> matched found: " + m.getMatchedArr().size());
        }

        System.out.println(">> Error size: " +  m.getErrPrint().size());
//        m.getErrPrint().forEach(System.out::println);
//        System.out.println("\nMatched 'folder file':");
//        m.getMatchedArr().forEach(System.out::println);

//        m.printErrlogNMatchedToFile(logfile); // OR
        if (m.getMode() == 2) {
            System.out.println("""
                               Portal filename   <> against the txt files:
                               only compare filename.length > 20, ie. ignore  image.jpg, ...
                               """);
            m.getMatchedFilesOnly().forEach(s -> System.out.println(s));
            System.out.println(">>> matchedNameCount: " + m.matchedNameCount);
        }

        System.out.println("Completed. Check " + logfile);
    }
}

/*
--- exec-maven-plugin:3.0.0:exec (default-cli) @ app ---
SubString key and name, to hashmap.
> primaryPath:D:\temp2>> targetPath:C:\testdata\test1
> row count: 9
> Hashmap size: 5
>> files count: 4
>> matched found: 2
>> Error size: 5
Completed. Check logmessages.txt
 */
