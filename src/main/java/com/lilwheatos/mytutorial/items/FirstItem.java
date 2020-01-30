package com.lilwheatos.mytutorial.items;

import com.lilwheatos.mytutorial.MyTutorial;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(MyTutorial.setup.itemgroup));
        setRegistryName("firstitem");
    }
}
