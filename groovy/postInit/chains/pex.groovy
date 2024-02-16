// Isopropyl Alcohol
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('water') * 2000, liquid('propene')*1000)
        .fluidOutputs(fluid('isopropyl_alcohol') * 3000)
        .duration(500)
        .EUt(256)
        .buildAndRegister()


// KOH
recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('water') * 2000)
        .inputs(item('gregtech:meta_dust', 83) * 2)
        .fluidOutputs(fluid('hydrogen') * 1000)
        .outputs(item('pexologicaljourney:potassium_hydroxide'))
        .duration(200)
        .EUt(128)
        .buildAndRegister()

// CS2
recipemap('mixer').recipeBuilder()
        .inputs(item('gregtech:meta_dust', 18), item('gregtech:meta_dust', 103) * 2)
        .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
        .outputs(item('pexologicaljourney:carbon_disulfide'))
        .duration(100)
        .EUt(8)
        .buildAndRegister()


// PEX
recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('pexologicaljourney:carbon_disulfide') * 1, item('pexologicaljourney:potassium_hydroxide') * 1)
        .fluidInputs(fluid('isopropyl_alcohol') * 1000)
        .outputs(item('gregtech:meta_dust', 32000))
        .fluidOutputs(fluid('water') * 1000)
        .duration(500)
        .EUt(256)
        .buildAndRegister()

