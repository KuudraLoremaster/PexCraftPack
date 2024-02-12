//shaped crafting
crafting.addShaped('redstone_engineering_block', item('immersiveengineering:metal_decoration0', 3) * 1, [
        [metaitem('cableGtSingleTin'), item('gregtech:meta_plate', 2064), metaitem('cableGtSingleTin')],
        [item('gregtech:meta_item_1', 217), item('gregtech:machine', 986), item('gregtech:meta_item_1', 232)],
        [metaitem('cableGtSingleTin'), item('gregtech:meta_plate', 2064), metaitem('cableGtSingleTin')]
])
 
crafting.addShaped('heavy_engineering_block', item('immersiveengineering:metal_decoration0', 5) * 1, [
        [item('gregtech:meta_item_1', 172), item('immersiveengineering:material', 9), item('gregtech:meta_item_1', 172)],
        [item('gregtech:meta_plate', 324), item('immersiveengineering:metal_decoration0', 4), item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_item_1', 172), item('immersiveengineering:material', 9), item('gregtech:meta_item_1', 172)]
])
 
crafting.addShaped('light_engineering_block', item('immersiveengineering:metal_decoration0', 4) * 1, [
        [item('gregtech:meta_item_1', 127), item('immersiveengineering:material', 8), item('gregtech:meta_item_1', 127)],
        [item('gregtech:meta_plate', 324), item('gregtech:machine', 986), item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_item_1', 127), item('immersiveengineering:material', 8), item('gregtech:meta_item_1', 127)]
])
 
crafting.addShaped('radiator_block', item('immersiveengineering:metal_decoration0', 7) * 1, [
        [item('gregtech:cable_single', 25),ore('circuitMv'),item('gregtech:cable_single', 25)],
        [item('gregtech:meta_item_1', 128),item('gregtech:machine', 987),item('gregtech:meta_item_1', 143)],
        [item('gregtech:cable_single', 25),ore('circuitMv'),item('gregtech:cable_single', 25)]
])
 
crafting.addShaped('external_heater_block', item('immersiveengineering:metal_device1', 1)*1, [
        [item('gregtech:cable_single', 112),ore('circuitLv'),item('gregtech:cable_single', 112)],
        [item('gregtech:meta_plate', 287),item('gregtech:machine', 986),item('gregtech:meta_plate', 287)],
        [item('gregtech:cable_single', 112),item('gregtech:meta_plate', 25),item('gregtech:cable_single', 112)]
])
 
crafting.addShaped('steel frame conversion', item('immersiveengineering:metal_decoration1', 1) * 8, [
        [item('gregtech:meta_block_frame_20',4),item('gregtech:meta_block_frame_20',4),item('gregtech:meta_block_frame_20',4)],
        [item('gregtech:meta_block_frame_20',4),null,item('gregtech:meta_block_frame_20',4)],
        [item('gregtech:meta_block_frame_20',4),item('gregtech:meta_block_frame_20',4),item('gregtech:meta_block_frame_20',4)]
])
 
crafting.addShaped('gregified_iron_sheetmetal', item('immersiveengineering:sheetmetal', 9) * 1, [
        [item('gregtech:meta_plate', 51), ore('craftingToolHardHammer'), item('gregtech:meta_plate', 51)],
        [item('gregtech:meta_plate', 51), item('gregtech:meta_plate', 51),item('gregtech:meta_plate', 51)],
        [item('gregtech:meta_plate', 51), ore('craftingToolWrench'),item('gregtech:meta_plate', 51)]
 
 
])
 
//shapeless crafting
 
// assembler
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('redstone') * 144)
        .inputs(item('gregtech:meta_wire_fine', 112) * 4,item('gregtech:machine', 986), item('gregtech:meta_item_1', 217), item('gregtech:meta_item_1', 232))
        .outputs(item('immersiveengineering:metal_decoration0', 3) * 2)
        .duration(50)
        .EUt(64)
        .buildAndRegister()
 
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('iron') * 288)
        .inputs(item('gregtech:meta_plate', 51) * 2,item('gregtech:machine', 986), item('gregtech:meta_item_1', 127) * 4)
        .outputs(item('immersiveengineering:metal_decoration0', 4) * 2)
        .duration(50)
        .EUt(64)
        .buildAndRegister()
 
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('steel') * 576)
        .inputs(item('immersiveengineering:metal_decoration0', 4), item('gregtech:meta_item_1', 172) * 4, item('gregtech:meta_plate', 324) * 2)
        .outputs(item('immersiveengineering:metal_decoration0', 5) * 2)
        .duration(50)
        .EUt(64)
        .buildAndRegister()
 
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('iron') * 288)
        .inputs(item('gregtech:meta_plate', 51) * 2)
        .outputs(item('immersiveengineering:sheetmetal', 9) * 3)
        .duration(10)
        .EUt(16)
        .buildAndRegister()
 
recipemap('assembler').recipeBuilder()
        .fluidInputs(liquid('soldering_alloy') * 72)
        .inputs(item('gregtech:machine', 987), item('gregtech:meta_item_1', 128), item('gregtech:meta_item_1', 143),item('gregtech:wire_single', 25) * 2, ore('circuitMv' * 2))
        .outputs(item('immersiveengineering:metal_decoration0', 7) * 20)
        .duration(50)
        .EUt(256)
        .buildAndRegister()
 

// chemical reactor
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('hydrogen')*720,liquid('potassium')*144,liquid('oxygen')*144) //replace this with a real chain
        .inputs(item('gregtech:meta_dust', 18),item('gregtech:meta_dust', 103) * 2)
        .outputs(item('pexologicaljourney:pex_ingot') * 12)
        .duration(500)
        .EUt(64)
        .buildAndRegister()
 
/*recipemap('chemical_reactor').recipeBuilder()
       .fluidInputs(liquid())
//ebf
recipemap('electric_blast_furnace').recipeBuilder()
        .inputs(item('pexologicaljourney:pex_dust'))
        .outputs(item('pexologicaljourney:pex_ingot'))
        .duration(900)
        .EUt(64)
        .buildAndRegister()
// remove recipes
//crafting.remove(item(''))
*/
 
