package victorgponce.com.entityrenderdisabler.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ConfigScreen extends Screen {

    private final Identifier background = Identifier.of("entityrenderdisabler:textures/background.png");

    public ConfigScreen() {
        super(Text.literal("Entity Render Disabler Configuration"));
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawTexture(RenderLayer::getGuiTextured, background, 0, 0, 0F, 0F, this.width, this.height, this.width, this.height);

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    protected void applyBlur() {
        return;
    }
}
