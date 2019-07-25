package com.thobho.jirainstaller;

public class Main {
    public static void main(String[] args) throws Exception {

        String installationBinary = args[0];

        JiraInstallStrategyFactory.getStrategy(installationBinary).installJira();
    }
}