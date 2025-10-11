package net.me.quark_innermod.internal_zeta.org;


public interface IZetaBlock {
    default int getFlammabilityZeta() {
        /*
        if (state.getEntries().containsKey(Properties.WATERLOGGED) && (boolean)state.get(Properties.WATERLOGGED)) {
            return 0;
        } else {
            BlockSoundGroup soundGroup = state.getSoundGroup();
            if (soundGroup == BlockSoundGroup.WOOL) {
                return 60;
            } else if (soundGroup != BlockSoundGroup.WOOD && !state.isBurnable()) {
                Identifier id = Registries.BLOCK.getId(state.getBlock());
                return id == null || !id.getPath().endsWith("_log") && !id.getPath().endsWith("_wood") ? 0 : 5;
            } else {
                return 20;
            }
        }
        */
        return 20;
    }
    default int getFireSpreadSpeedZeta() {
        /*
        if (state.getEntries().containsKey(Properties.WATERLOGGED) && (Boolean)state.get(Properties.WATERLOGGED)) {
            return 0;
        } else {
            BlockSoundGroup soundGroup = state.getSoundGroup();
            if (soundGroup == BlockSoundGroup.WOOL) {
                return 30;
            } else {
                return soundGroup != BlockSoundGroup.WOOD && !state.isBurnable() ? 0 : 5;
            }
        }*/
        return 5;
    }
}
