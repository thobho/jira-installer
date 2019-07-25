package com.thobho.jirainstaller;

import expectj.ExpectJ;
import expectj.Spawn;

class DefaultInstallStrategy extends JiraInstallStrategy {

    DefaultInstallStrategy(String installationBinary) {
        super(installationBinary);
    }

    @Override
    void installJira() throws Exception {
        ExpectJ expectinator = new ExpectJ(10);
        Spawn shell = expectinator.spawn(installationBinary);
        shell.expect("This will");
        shell.send("o\n");
        shell.expect("Express Install");
        shell.send("1\n");
        shell.expect("Install as service");
        shell.send("i\n");
    }
}
