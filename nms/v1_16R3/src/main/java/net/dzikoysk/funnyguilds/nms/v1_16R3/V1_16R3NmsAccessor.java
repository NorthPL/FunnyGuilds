package net.dzikoysk.funnyguilds.nms.v1_16R3;

import net.dzikoysk.funnyguilds.nms.api.NmsAccessor;
import net.dzikoysk.funnyguilds.nms.api.entity.EntityAccessor;
import net.dzikoysk.funnyguilds.nms.api.packet.PacketAccessor;
import net.dzikoysk.funnyguilds.nms.api.playerlist.PlayerListAccessor;
import net.dzikoysk.funnyguilds.nms.api.statistics.StatisticsAccessor;
import net.dzikoysk.funnyguilds.nms.v1_16R3.packet.V1_16R3PacketAccessor;
import net.dzikoysk.funnyguilds.nms.v1_16R3.statistics.V1_16R3StatisticsAccessor;

public class V1_16R3NmsAccessor implements NmsAccessor {
    @Override
    public PacketAccessor getPacketAccessor() {
        return new V1_16R3PacketAccessor();
    }

    @Override
    public PlayerListAccessor getPlayerListAccessor() {
        return null;
    }

    @Override
    public StatisticsAccessor getStatisticsAccessor() {
        return new V1_16R3StatisticsAccessor();
    }

    @Override
    public EntityAccessor getEntityAccessor() {
        return null;
    }
}
