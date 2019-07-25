package com.thobho.jirainstaller;

abstract class JiraInstallStrategy {

    protected String installationBinary;

    public JiraInstallStrategy(String installationBinary) {
        this.installationBinary = installationBinary;
    }

    abstract void installJira() throws Exception;
}
