package denoflionsx.ValvePipe;

import denoflionsx.ValvePipe.Core.ValvePipeCore;
import denoflionsx.ValvePipe.Proxy.Proxy;
import denoflionsx.ValvePipe.Version.Version;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "ValvePipe", name = "Valve Pipe", version = Version.version, dependencies = "required-after:BuildCraft|Transport;required-after:BuildCraft|Energy;required-after:BuildCraft|Silicon")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ValvePipeMod {

    @Mod.Instance("vp")
    public static ValvePipeMod vp;
    @SidedProxy(clientSide = "denoflionsx.ValvePipe.Proxy.ProxyClient", serverSide = "denoflionsx.ValvePipe.Proxy.ProxyServer")
    public static Proxy proxy;
    public static ValvePipeCore Core;

    public ValvePipeMod() {
        vp = this;
        Core = new ValvePipeCore();
    }

    @Mod.PreInit
    public void preLoad(FMLPreInitializationEvent event) {
        Core.loadTexture();
    }

    @Mod.Init
    public void load(FMLInitializationEvent event) {
        Core.createActions();
    }

    @Mod.PostInit
    public void modsLoaded(FMLPostInitializationEvent evt) {
        Core.createPipes();
    }
}
