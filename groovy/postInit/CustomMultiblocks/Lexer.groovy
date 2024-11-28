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

class MetaTileEntityLexer extends RecipeMapMultiblockController {

    /*(1)!*/
    MetaTileEntityLexer(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.LEXER_RECIPES) 
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityLexer(metaTileEntityId) /*(3)!*/
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start() /*(4)!*/
                .aisle("XXX", "XXX", "XXXXX") //
                .aisle("XXX", "X#X", "XXGGX") //
                .aisle("XXX", "XSX", "XXXXX") //

                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('#', air())
                .where('G', steelGearBox())
                .build()
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING /*(5)!*/
    }

    /*(6)!*/
    protected IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(MetalCasingType.STEEL_SOLID)
    }

    /*(7)!*/
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.LEXER_OVERLAY
    }
}
