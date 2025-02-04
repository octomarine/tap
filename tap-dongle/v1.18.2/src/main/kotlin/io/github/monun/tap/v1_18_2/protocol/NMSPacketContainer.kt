/*
 * Tap
 * Copyright (C) 2021 Monun
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.monun.tap.v1_18_2.protocol

import io.github.monun.tap.protocol.PacketContainer
import net.minecraft.network.protocol.Packet
import org.bukkit.craftbukkit.v1_18_R2.entity.CraftPlayer
import org.bukkit.entity.Player


class NMSPacketContainer(private val packet: Packet<*>) : PacketContainer {
    override fun sendTo(player: Player) {
        (player as CraftPlayer).handle.connection.send(packet, null)
    }
}