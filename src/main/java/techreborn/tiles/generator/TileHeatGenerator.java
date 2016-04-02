package techreborn.tiles.generator;

import ic2.api.tile.IWrenchable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import reborncore.api.power.EnumPowerTier;
import reborncore.common.powerSystem.TilePowerAcceptor;
import techreborn.config.ConfigTechReborn;
import techreborn.init.ModBlocks;

public class TileHeatGenerator extends TilePowerAcceptor implements IWrenchable {

    public static final int euTick = ConfigTechReborn.heatGeneratorOutput;

    public TileHeatGenerator() {
        super(1);
    }

    @Override
    public void updateEntity() {
        super.updateEntity();

        if (!worldObj.isRemote) {
            if (worldObj.getBlockState(new BlockPos(getPos().getX() + 1, getPos().getY(), getPos().getZ())).getBlock() == Blocks.lava) {
                addEnergy(euTick);
            } else if (worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY(), getPos().getZ() + 1)).getBlock() == Blocks.lava) {
                addEnergy(euTick);
            } else if (worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY(), getPos().getZ() - 1)).getBlock() == Blocks.lava) {
                addEnergy(euTick);
            } else if (worldObj.getBlockState(new BlockPos(getPos().getX() - 1, getPos().getY(), getPos().getZ())).getBlock() == Blocks.lava) {
                addEnergy(euTick);
            } else if (worldObj.getBlockState(new BlockPos(getPos().getX(), getPos().getY() - 1, getPos().getZ())).getBlock() == Blocks.lava) {
                addEnergy(euTick);
            }

        }
    }

    @Override
    public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
        return new ItemStack(ModBlocks.heatGenerator, 1);
    }

    public boolean isComplete() {
        return false;
    }


    @Override
    public double getMaxPower() {
        return 10000;
    }

    @Override
    public boolean canAcceptEnergy(EnumFacing direction) {
        return false;
    }

    @Override
    public boolean canProvideEnergy(EnumFacing direction) {
        return true;
    }

    @Override
    public double getMaxOutput() {
        return 64;
    }

    @Override
    public double getMaxInput() {
        return 0;
    }

    @Override
    public EnumPowerTier getTier() {
        return EnumPowerTier.LOW;
    }

//    @Override
//	public void addWailaInfo(List<String> info)
//	{
//		super.addWailaInfo(info);
//		info.add("Power Generarating " + euTick +" EU/t");
//
//	}

}
