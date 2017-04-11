package com.waylon.minceraft.proxy;

import com.waylon.minceraft.init.ModBlocks;
import com.waylon.minceraft.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
