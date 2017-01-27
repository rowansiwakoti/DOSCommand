package com.leapfrog.doscommand;

import java.util.HashMap;
import java.util.Map;

public class DOSCommandFactory {
    
    private static Map<String, DOSCommand> commands = initCommands();
    
    private static Map<String, DOSCommand> initCommands() {
        Map<String, DOSCommand> map = new HashMap<>();
        map.put("md", new MDCommand());
        map.put("rd", new RDCommand());
        map.put("dir", new DirCommand());
        map.put("ren", new RenameCommand());
        map.put("copy", new CopyCommand());
        map.put("download", new DownloadCommand());
        map.put("exit", new ExitCommand());
        map.put("cls", new CLSCommand());
        return map;

    }

    public static DOSCommand getCommand(String key) {

        return (commands.containsKey(key)) ? commands.get(key) : null;
    }
}
