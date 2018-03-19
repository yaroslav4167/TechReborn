/*
 * This file is part of TechReborn, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2018 TechReborn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package techreborn.compat;

import reborncore.common.registration.RebornRegistry;
import reborncore.common.registration.impl.ConfigRegistry;
import techreborn.lib.ModInfo;

@RebornRegistry(modID = ModInfo.MOD_ID)
public class CompatConfigs {
	@ConfigRegistry(config = "compat", category = "buildcraft", key = "ExpensiveQuarryRecipe", comment = "Buildcraft's quarry will require an advanced circuit and diamond drill if enabled")
	public static boolean expensiveQuarry = true;

	@ConfigRegistry(config = "compat", category = "buildcraft", key = "EnableBuildcraftFuels", comment = "Allow Buildcraft fuels to be used in fuel generators")
	public static boolean allowBCFuels = true;

	@ConfigRegistry(config = "compat", category = "theoneprobe", key = "EnableTOPSupport", comment = "Display machine info in The One Probe's HUD")
	public static boolean enableTOP = true;
	
	@ConfigRegistry(config = "compat", category = "jei", key = "ShowScrabpox", comment = "Show Scrapbox loot in JEI")
	public static boolean showScrapbox = false;

}
