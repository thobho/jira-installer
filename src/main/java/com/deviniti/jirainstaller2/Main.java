package com.deviniti.jirainstaller2;

import expectj.ExpectJ;
import expectj.Spawn;

public class Main {
    public static void main(String[] args) throws Exception {

        String installationBin = args[0];
        String jiraInstallDirectory = args[1];
        String jiraHome = args[2];

        ExpectJ expectinator = new ExpectJ(10);
        Spawn shell = expectinator.spawn(installationBin);
        shell.expect("OK [o, Enter], Cancel [c]");
        shell.send("o \n");
        shell.expect("Express Install");
        shell.send("1 \n");
//        shell.expect("Where should JIRA Software be installed?");
//        shell.send(jiraInstallDirectory + "\n");
//        shell.expect("Default location for JIRA Software data");
//        shell.send(jiraHome + "\n");
        shell.expect("Install as service");
        shell.send("i \n");
    }
}