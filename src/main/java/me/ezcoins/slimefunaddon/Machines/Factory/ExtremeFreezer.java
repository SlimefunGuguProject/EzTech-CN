package me.ezcoins.slimefunaddon.Machines.Factory;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialsSetup;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ExtremeFreezer extends AContainer implements RecipeDisplayItem{
    public static final int ENERGY_CONSUMPTION = 60;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public ExtremeFreezer(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }

    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.WATER_BUCKET, 1) }, new ItemStack[] { new ItemStack(Material.BUCKET), new SlimefunItemStack(SlimefunItems.REACTOR_COOLANT_CELL, 1) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.LAVA_BUCKET, 1) }, new ItemStack[] { new ItemStack(Material.BUCKET, 1), new ItemStack(Material.OBSIDIAN) });


        } else {
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.WATER_BUCKET, 1) }, new ItemStack[] { new ItemStack(Material.BUCKET), new SlimefunItemStack(SlimefunItems.REACTOR_COOLANT_CELL, 1) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.LAVA_BUCKET, 1) }, new ItemStack[] { new ItemStack(Material.BUCKET, 1), new ItemStack(Material.OBSIDIAN) });


        }

    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size());

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);


        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLUE_ICE);
    }

    @Override
    public String getMachineIdentifier() {
        return "ExtremeFreezer";
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    @Override
    public int getEnergyConsumption() {return ENERGY_CONSUMPTION;
    }

    @Override
    public int getSpeed() {
        return 01;
    }
}
