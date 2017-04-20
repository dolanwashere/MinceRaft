package com.waylon.minceraft.init.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

/**
 * Zombie by Unknown
 */
@SideOnly(Side.CLIENT)
public class ModelMummy extends ModelBase {
    public ModelRenderer leftarm;
    public ModelRenderer leftleg;
    public ModelRenderer head;
    public ModelRenderer chest;
    public ModelRenderer rightarm;
    public ModelRenderer rightleg;
    public ModelRenderer headbox;

    public ModelMummy() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.setRotationAngles(this.leftarm, -1.3962635347535182F, -0.10000000116728046F, 0.10000000116728046F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.mirror = true;
        this.setRotationAngles(this.rightarm, -1.3962635347535182F, 0.10000000116728046F, -0.10000000116728046F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.mirror = true;
        this.headbox = new ModelRenderer(this, 32, 0);
        this.headbox.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headbox.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.leftarm.offsetX, this.leftarm.offsetY, this.leftarm.offsetZ);
        GlStateManager.translate(this.leftarm.rotationPointX * scale, this.leftarm.rotationPointY * scale, this.leftarm.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.leftarm.offsetX, -this.leftarm.offsetY, -this.leftarm.offsetZ);
        GlStateManager.translate(-this.leftarm.rotationPointX * scale, -this.leftarm.rotationPointY * scale, -this.leftarm.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.leftarm.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.leftleg.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.head.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.chest.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rightarm.offsetX, this.rightarm.offsetY, this.rightarm.offsetZ);
        GlStateManager.translate(this.rightarm.rotationPointX * scale, this.rightarm.rotationPointY * scale, this.rightarm.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.rightarm.offsetX, -this.rightarm.offsetY, -this.rightarm.offsetZ);
        GlStateManager.translate(-this.rightarm.rotationPointX * scale, -this.rightarm.rotationPointY * scale, -this.rightarm.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.rightarm.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.rightleg.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.headbox.render(scale);
        GlStateManager.disableBlend();
    }

    public void setRotationAngles(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
