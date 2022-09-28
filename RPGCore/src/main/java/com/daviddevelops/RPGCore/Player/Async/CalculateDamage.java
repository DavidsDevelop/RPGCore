package com.daviddevelops.RPGCore.Player.Async;

import com.daviddevelops.RPGCore.Player.PlayerData;
import com.daviddevelops.RPGCore.Player.PlayerHandler;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class CalculateDamage extends BukkitRunnable {

    private PlayerData data;
    private PlayerHandler handler;

    public CalculateDamage(PlayerData data, PlayerHandler handler){
        this.data = data;
        this.handler = handler;
    }

    @Override
    public void run() {
        data.addStrength(10);
    }
}
