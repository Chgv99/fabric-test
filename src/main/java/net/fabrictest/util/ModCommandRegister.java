package net.fabrictest.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabrictest.command.ReturnHomeCommand;
import net.fabrictest.command.SetHomeCommand;

public class ModCommandRegister {
    
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
}
