package io.github.winterbear.wintercore.WonderHaul.Crafting;

import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by WinterBear on 02/09/2017.
 */
public class WonderhaulIngredientTest {

    @Test
    public void testWonderhaulIngredients() throws InvalidItemStackException {
        ItemStack mockItemStack = mock(ItemStack.class);
        ItemMeta mockItemMeta = mock(ItemMeta.class);
        List<String> lore = Arrays.asList("⚗ Ingredient: Flour");
        when(mockItemStack.getItemMeta()).thenReturn(mockItemMeta);
        when(mockItemMeta.getLore()).thenReturn(lore);
        Ingredient ingredient = WonderhaulIngredient.create(mockItemStack);
        assertEquals("Flour", ingredient.getName());
    }

}