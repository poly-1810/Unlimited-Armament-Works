package UAW.world.blocks.power.steam;

import UAW.world.blocks.production.FilterGenericCrafter;
import UAW.world.consumers.ConsumeItemFuelFlammable;
import mindustry.world.consumers.ConsumeItemExplode;
import mindustry.world.meta.Stat;

import static UAW.Vars.tick;

public class SteamBoiler extends FilterGenericCrafter {

	public SteamBoiler(String name) {
		super(name);
		warmupSpeed = 0.0025f;
		craftTime = 2f * tick;
		hasItems = true;
		hasLiquids = true;
		consume(new ConsumeItemFuelFlammable());
		consume(new ConsumeItemExplode());
	}

	@Override
	public void setStats() {
		super.setStats();
		stats.remove(Stat.productionTime);
	}

}
