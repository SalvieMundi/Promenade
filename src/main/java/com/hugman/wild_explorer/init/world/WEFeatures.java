package com.hugman.wild_explorer.init.world;

import com.hugman.dawn.api.creator.FeatureCreator;
import com.hugman.wild_explorer.init.WEBundle;
import com.hugman.wild_explorer.object.world.gen.feature.BoulderFeature;
import com.hugman.wild_explorer.object.world.gen.feature.HugeMushroomFeature;
import com.hugman.wild_explorer.object.world.gen.feature.SpikeFeature;
import com.hugman.wild_explorer.object.world.gen.feature.TallHugeFungusFeature;
import com.hugman.wild_explorer.object.world.gen.feature.config.BoulderFeatureConfig;
import com.hugman.wild_explorer.object.world.gen.feature.config.HugeMushroomFeatureConfig;
import com.hugman.wild_explorer.object.world.gen.feature.config.SpikeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

public class WEFeatures extends WEBundle {
	public static final Feature<HugeFungusFeatureConfig> TALL_HUGE_FUNGUS = add(new FeatureCreator<>("tall_huge_fungus", new TallHugeFungusFeature(HugeFungusFeatureConfig.CODEC)));
	public static final Feature<HugeMushroomFeatureConfig> HUGE_MUSHROOM = add(new FeatureCreator<>("huge_mushroom", new HugeMushroomFeature(HugeMushroomFeatureConfig.CODEC)));
	public static final Feature<SpikeFeatureConfig> SPIKE = add(new FeatureCreator<>("spike", new SpikeFeature(SpikeFeatureConfig.CODEC)));
	public static final Feature<BoulderFeatureConfig> BOULDER = add(new FeatureCreator<>("boulder", new BoulderFeature(BoulderFeatureConfig.CODEC)));

	public static void init() {
	}
}
