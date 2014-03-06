package com.loslobos1234;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.loslobos1234.commandHandler.join;
import com.loslobos1234.eventHandler.DoubleJump;
import com.loslobos1234.eventHandler.InteractEvent;
import com.loslobos1234.eventHandler.JoinEvent;
import com.loslobos1234.eventHandler.KillEvent;
import com.loslobos1234.eventHandler.QuitEvent;

public class main extends JavaPlugin {
	public static DoubleJump dj;
	public static KillEvent KE;
	public static JoinEvent JE;
	public static InteractEvent IE;
	public static QuitEvent QE;
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(dj, this);
		Bukkit.getServer().getPluginManager().registerEvents(KE, this);
		Bukkit.getServer().getPluginManager().registerEvents(JE, this);
		Bukkit.getServer().getPluginManager().registerEvents(IE, this);
		Bukkit.getServer().getPluginManager().registerEvents(QE, this);
	}
	
	public void handler() {
		setExecutor("join", new join());
	}
	
	public void setExecutor(String command, CommandExecutor ce) {
		Bukkit.getServer().getPluginCommand(command).setExecutor(ce);
	}
	
}
