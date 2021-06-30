package net.dzikoysk.funnyguilds.nms.api;

import net.dzikoysk.funnyguilds.nms.api.entity.EntityAccessor;
import net.dzikoysk.funnyguilds.nms.api.packet.PacketRegistry;
import net.dzikoysk.funnyguilds.nms.api.playerlist.PlayerListAccessor;
import net.dzikoysk.funnyguilds.nms.api.statistics.StatisticsAccessor;

public interface NmsAccessor {
    PacketRegistry getPacketRegistry();

    PlayerListAccessor getPlayerListAccessor();

    StatisticsAccessor getStatisticsAccessor();

    EntityAccessor getEntityAccessor();
}