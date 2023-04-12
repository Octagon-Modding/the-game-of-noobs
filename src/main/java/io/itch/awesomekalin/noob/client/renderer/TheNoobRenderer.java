
package io.itch.awesomekalin.noob.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import io.itch.awesomekalin.noob.entity.TheNoobEntity;

public class TheNoobRenderer extends HumanoidMobRenderer<TheNoobEntity, HumanoidModel<TheNoobEntity>> {
	public TheNoobRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(TheNoobEntity entity) {
		return new ResourceLocation("noob:textures/entities/2022_08_17_noob-20735075.png");
	}
}
