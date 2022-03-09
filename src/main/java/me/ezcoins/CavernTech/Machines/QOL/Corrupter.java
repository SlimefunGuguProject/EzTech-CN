package me.ezcoins.CavernTech.Machines.QOL;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Corrupter extends AContainer implements RecipeDisplayItem{
    public static final int ENERGY_CONSUMPTION = 60;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    public static final int SPEED = 1;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public Corrupter(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }

    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(5, new ItemStack[] { new ItemStack(Material.COBBLESTONE,16) }, new ItemStack[] { new ItemStack(Material.NETHERRACK, 8) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.SAND,6) }, new ItemStack[] { new ItemStack(Material.SOUL_SAND, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COPPER_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.EXPOSED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.EXPOSED_COPPER,1) }, new ItemStack[] { new ItemStack(Material.WEATHERED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.WEATHERED_COPPER,1) }, new ItemStack[] { new ItemStack(Material.OXIDIZED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GRASS_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.PODZOL, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PODZOL,1) }, new ItemStack[] { new ItemStack(Material.MYCELIUM, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.OAK_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BIRCH_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.DARK_OAK_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.SPRUCE_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.ACACIA_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.JUNGLE_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });



        } else {
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COBBLESTONE,16) }, new ItemStack[] { new ItemStack(Material.NETHERRACK, 8) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.SAND,6) }, new ItemStack[] { new ItemStack(Material.SOUL_SAND, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COPPER_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.EXPOSED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.EXPOSED_COPPER,1) }, new ItemStack[] { new ItemStack(Material.WEATHERED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.WEATHERED_COPPER,1) }, new ItemStack[] { new ItemStack(Material.OXIDIZED_COPPER, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GRASS_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.PODZOL, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PODZOL,1) }, new ItemStack[] { new ItemStack(Material.MYCELIUM, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.OAK_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BIRCH_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.DARK_OAK_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.SPRUCE_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.ACACIA_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.JUNGLE_LEAVES,16) }, new ItemStack[] { new ItemStack(Material.DIRT, 1) });


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
        return new ItemStack(Material.LAVA_BUCKET);
    }

    @Override
    public String getMachineIdentifier() {
        return "CORRUPTER";
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
        return SPEED;
    }
}