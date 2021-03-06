package denoflionsx.ValvePipe.Pipes;

import buildcraft.transport.PipeTransportLiquids;
import buildcraft.transport.pipes.PipeLiquidsSandstone;
import denoflionsx.ValvePipe.ValvePipeMod;
import net.minecraftforge.common.ForgeDirection;

public class SandstoneGoldPipe extends PipeLiquidsSandstone {

    public SandstoneGoldPipe(int itemID) {
        super(itemID);
        ((PipeTransportLiquids) transport).flowRate = 80;
        ((PipeTransportLiquids) transport).travelDelay = 4;
    }

    @Override
    public String getTextureFile() {
        return ValvePipeMod.Core.texture;
    }

    @Override
    public int getTextureIndex(ForgeDirection direction) {
        return 4;
    }
}
