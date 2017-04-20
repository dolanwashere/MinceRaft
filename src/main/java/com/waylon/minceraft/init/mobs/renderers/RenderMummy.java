package com.waylon.minceraft.init.mobs.renderers;

import com.waylon.minceraft.Reference;
import com.waylon.minceraft.init.mobs.entities.EntityMummy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMummy extends RenderLiving<EntityMummy> {

	public static final ResourceLocation MUMMY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/mummy/mummy.png");
	
	public RenderMummy(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMummy entity) {
		return MUMMY_TEXTURE;
	}
}
