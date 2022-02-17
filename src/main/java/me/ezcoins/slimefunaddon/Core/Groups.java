package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.ezcoins.slimefunaddon.MainRecipes;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Groups {



    private Groups() {
    }


    public static final ItemGroup EzMachines = new ItemGroup(new NamespacedKey(MainRecipes.getInstance(), "EzMachines"),
            new CustomItemStack(SlimefunItems.CARBONADO_EDGED_FURNACE, "&7EzMachines", ""));

    public static final ItemGroup EzMaterials = new ItemGroup(new NamespacedKey(MainRecipes.getInstance(), "EzResources"),
            new CustomItemStack(SlimefunItems.CARBON, "&7EzResources", ""));

    public static final ItemGroup EzGenerators = new ItemGroup(new NamespacedKey(MainRecipes.getInstance(), "EzGenerators"),
            new CustomItemStack(Material.DAYLIGHT_DETECTOR, "&7EzResources", ""));

    public static final ItemGroup EzFood = new ItemGroup(new NamespacedKey(MainRecipes.getInstance(), "EzFood"),
            new CustomItemStack(Material.BREAD, "&7EzFood", ""));


    }

