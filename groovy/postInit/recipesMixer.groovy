recipemap('mixer').recipeBuilder()
        .fluidInputs(fluid('gasoline')*9000)
        .inputs(item('gregtech:meta_dust', 2) * 3)
        .fluidOutputs(fluid('napalm')*10000)
        .duration(80)
        .EUt(64)
        .buildAndRegister()

 
