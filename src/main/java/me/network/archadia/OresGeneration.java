package me.network.archadia;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OresGeneration implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
       switch (world.provider.dimensionId)
       {
           case -1:
               generateNether(world, random, chunkX, chunkZ);
               break;
           case 0:
               generateOverworld(world, random, chunkX, chunkZ);
               break;
           case 1:
               generateEnd(world, random, chunkX, chunkZ);
               break;
       }
    }

    public void generateNether(World world, Random rand, int x, int z){
    }

    public void generateOverworld(World world, Random rand, int x, int z){
        generateOre(ModBlocks.oreAlexandrite, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreAmber, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreAmethyst, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreAquamarine, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreBlackOpal, world, rand, x, z, 1, 4, 5, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreCitrine, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreGarnet, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreJade, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreJasper, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreMalachite, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreOnyx, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreOpal, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.orePeridot, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreRoseQuartz, world, rand, x, z, 1, 4, 5, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreRuby, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreSapphire, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreSpinel, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreSugilite, world, rand, x, z, 1, 4, 5, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreTanzanite, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreTopaz, world, rand, x, z, 1, 4, 10, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreTourmaline, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreTurquoise, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);
        generateOre(ModBlocks.oreZircon, world, rand, x, z, 1, 4, 20, 0, 17, Blocks.stone);

    }

    public void generateEnd(World world, Random rand, int x, int z){
    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn){
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
        for(int i = 0; i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);;
            gen.generate(world, random, xRand, yRand, zRand);
        }
    }
}
