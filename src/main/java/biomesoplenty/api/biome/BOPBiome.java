/*******************************************************************************
 * Copyright 2015, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.api.biome;

import java.util.HashMap;
import java.util.Map;

import biomesoplenty.common.biome.ExtendedBiomeRegistry.GenerationManager;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BOPBiome extends BiomeGenBase implements IExtendedBiome
{
    private GenerationManager generationManager = new GenerationManager();
    private Map<BiomeType, Integer> weightMap = new HashMap<BiomeType, Integer>();
    
    public BOPBiome()
    {
        super(-1, false);

        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.grassPerChunk = -999;
        this.theBiomeDecorator.sandPerChunk = -999;
        this.theBiomeDecorator.sandPerChunk2 = -999;
        this.theBiomeDecorator.clayPerChunk = -999;
    }

    @Override
    public BiomeOwner getBiomeOwner()
    {
        return BiomeOwner.BIOMESOPLENTY;
    }

    @Override
    public GenerationManager getGenerationManager()
    {
        return this.generationManager;
    }

    @Override
    public Map<BiomeType, Integer> getWeightMap()
    {
        return this.weightMap;
    }

    @Override
    public void addWeight(BiomeType type, int weight)
    {
        this.weightMap.put(type, weight);
    }
    
    @Override
    public void clearWeights()
    {
        this.weightMap.clear();
    }
}