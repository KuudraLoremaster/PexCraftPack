import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMaps
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType
import gregtech.common.blocks.MetaBlocks

class MetaTileEntitySexer extends RecipeMapMultiblockController {

    /*(1)!*/
    MetaTileEntitySexer(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.SEXER_RECIPES) 
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntitySexer(metaTileEntityId) /*(3)!*/
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start() /*(4)!*/
                .aisle("XXX", "XXX", "XXX") //
                .aisle("XXX", "X#X", "XXX") //
                .aisle("XXX", "XSX", "XXX") //

                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('#', air())
                .build()
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.BRICKED_BRONZE_CASING /*(5)!*/

    /*(6)!*/
    protected IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(MetalCasingType.BRONZE_BRICKED)
    }

    /*(7)!*/
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.SEXER_OVERLAY
    }
}
