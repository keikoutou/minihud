package fi.dy.masa.minihud.renderer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;

public interface IOverlayRenderer
{
    /**
     * Should this renderer draw anything at the moment, ie. is it enabled for example
     * @return
     */
    boolean shouldRender(MinecraftClient mc);

    /**
     * Return true, if this renderer should get re-drawn/updated
     * @param entity
     * @param mc
     * @return
     */
    boolean needsUpdate(Entity entity, MinecraftClient mc);

    /**
     * Re-draw the buffer contents, if needed
     * @param entity
     * @param mc
     */
    void update(Entity entity, MinecraftClient mc);

    /**
     * Draw the buffer contents to screen
     */
    void draw();

    /**
     * Allocates the OpenGL resources according to the current Video settings
     */
    void allocateGlResources();

    /**
     * Removes the OpenGL buffer allocations etc.
     */
    void deleteGlResources();
}
