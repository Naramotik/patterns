package com.patterns.naramotik.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "LogFile \n";

    public static ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){
    }

    public void addLogInfo(String info){
        logFile += info + "\n";
    }

    public void shoLogFile(){
        System.out.println(logFile);
    }
}
