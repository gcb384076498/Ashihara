package kogasastudio.ashihara.interaction.recipes.register;

import kogasastudio.ashihara.Ashihara;
import kogasastudio.ashihara.interaction.recipes.CuttingBoardRecipe;
import kogasastudio.ashihara.interaction.recipes.MillRecipe;
import kogasastudio.ashihara.interaction.recipes.MortarRecipe;
import kogasastudio.ashihara.interaction.recipes.base.BaseSerializer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * todo 注册新的 RecipeSerializer 在这里注册
 * @author DustW
 **/
public class RecipeSerializers {
    private static final DeferredRegister<RecipeSerializer<?>> SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Ashihara.MODID);

    public static final RegistryObject<BaseSerializer<?>> CUTTING_BOARD =
            SERIALIZER.register("cutting", () -> new BaseSerializer<>(CuttingBoardRecipe.class));

    public static final RegistryObject<BaseSerializer<?>> MORTAR =
            SERIALIZER.register("mortar", () -> new BaseSerializer<>(MortarRecipe.class));

    public static final RegistryObject<BaseSerializer<?>> MILL =
            SERIALIZER.register("mill", () -> new BaseSerializer<>(MillRecipe.class));


    static void register(IEventBus bus) {
        SERIALIZER.register(bus);
    }
}
