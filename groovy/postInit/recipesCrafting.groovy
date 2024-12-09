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

crafting.addShaped('pressurized_air_tank', item('immersiveengineering:toolupgrade') * 1, [
        [metaitem('drum.aluminium'), ore('dyeBlue'), null],
        [ore('dyeBlue'), metaitem('drum.aluminium'), ore('dyeBlue')],
        [null, ore('dyeBlue'), item('immersiveengineering:material', 9)]
])

crafting.addShaped('gregified_iron_component', item('immersiveengineering:material', 8) * 2, [
        [item('gregtech:meta_plate', 51), item('gregtech:cable_single', 112),item('gregtech:meta_plate', 51) ],
        [item('gregtech:cable_single', 112),item('gregtech:meta_plate', 51) ,item('gregtech:cable_single', 112)],
        [item('gregtech:meta_plate', 51),item('gregtech:cable_single', 112),item('gregtech:meta_plate', 51)]
])

crafting.addShaped('gregified_steel_component', item('immersiveengineering:material', 9) * 2, [
        [item('gregtech:meta_plate', 324), item('gregtech:cable_single', 25),item('gregtech:meta_plate', 324) ],
        [item('gregtech:cable_single', 25),item('gregtech:meta_plate', 324) ,item('gregtech:cable_single', 25)],
        [item('gregtech:meta_plate', 324),item('gregtech:cable_single', 25),item('gregtech:meta_plate', 324)]
])

// crafting.addShaped('projector', item('immersivepetroleum:schematic') * 1, [
//         [item('gregtech:meta_lens', 2000), ore('circuitLv'), null],
//         [item('gregtech:meta_plate', 324), ore('batteryLv'), ore('circuitLv')],
//         [null, item('gregtech:meta_plate', 324), item('gregtech:meta_plate', 1648)]
// ])

crafting.addShaped('generator_block', item('immersiveengineering:metal_decoration0', 6) * 1, [
        [item('gregtech:cable_single', 25), item('gregtech:meta_plate', 25), item('gregtech:cable_single', 25)],
        [item('gregtech:meta_plate', 324), item('immersiveengineering:metal_device1', 2), item('gregtech:meta_plate', 324)],
        [item('gregtech:cable_single', 25), ore('circuitMv'), item('gregtech:cable_single', 25)]
])

crafting.addShaped('dynamo', item('immersiveengineering:metal_device1', 2) * 1, [
        [item('gregtech:meta_plate', 324), item('gregtech:wire_single', 25), item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_plate', 2064), item('gregtech:wire_coil'), item('gregtech:meta_plate', 2064)],
        [null, metaitem('plate.ultra_low_power_integrated_circuit'), null]
])

crafting.addShaped('rizz', item('immersiveengineering:metal_device1', 2) * 1, [
        [item('gregtech:meta_plate', 324), item('gregtech:wire_single', 25), item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_plate', 2064), item('gregtech:wire_coil'), item('gregtech:meta_plate', 2064)],
        [null, metaitem('plate.ultra_low_power_integrated_circuit'), null]
])
