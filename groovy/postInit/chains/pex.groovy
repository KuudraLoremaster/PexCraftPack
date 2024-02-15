// Isopropyl Alcohol

recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(liquid('water')*2000,liquid('propene')*1000)
        .fluidOutputs(fluid('pexologicaljourney:isopropyl_alcohol') * 3000)
        .duration(500)
        .EUt(256)
        .buildAndRegister()


