// Isopropyl Alcohol

recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('water') * 2000, liquid('propene')*1000)
        .fluidOutputs(fluid('isopropyl') * 1000)
        .duration(500)
        .EUt(256)
        .buildAndRegister()


// Potassium Hydroxide
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('water') * 2000)
        .inputs(item('gregtech:meta_dust', 83) * 2)
        .fluidOutputs(fluid('hydrogen') * 1000)
        .outputs(item('gregtech:meta_dust'), 32005)
        .duration(200)
        .EUt(128)
        .buildAndRegister()
// Carbon Disulfide

recipemap('mixer').recipeBuilder()
        .inputs(item('gregtech:meta_dust', 18), item('gregtech:meta_dust', 103) * 2)
        .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
        .outputs(item('gregtech:meta_dust', 32003))
        .duration(100)
        .EUt(8)
        .buildAndRegister()


// PEX

recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('gregtech:meta_dust', 32003) * 1, item('gregtech:meta_dust', 32005) * 1)
        .fluidInputs(fluid('isopropyl') * 1000)
        .outputs(item('gregtech:meta_dust', 32000))
        .fluidOutputs(fluid('water') * 1000)
        .duration(500)
        .EUt(256)
        .buildAndRegister()

