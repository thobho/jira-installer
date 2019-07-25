package com.thobho.jirainstaller;

class JiraInstallStrategyFactory {

    static JiraInstallStrategy getStrategy(String jiraInstallationBin){
            return new DefaultInstallStrategy(jiraInstallationBin);
    }
}
