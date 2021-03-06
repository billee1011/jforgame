package com.kingston.game.player.events;

import com.kingston.listener.EventType;
import com.kingston.listener.PlayerEvent;

public class EventPlayerLevelUp extends PlayerEvent {

	/** 新的等级 */
	private int upLevel;
	
	public EventPlayerLevelUp(EventType evtType, long playerId, int newLevel) {
		super(evtType, playerId);
		this.upLevel = newLevel;
	}
	
	public int getUpLevel() {
		return this.upLevel;
	}

	@Override
	public String toString() {
		return "EventPlayerLevelUp [upLevel=" + upLevel + ", playerId="
				+ getPlayerId() + ", EventType=" + getEventType() + "]";
	}
	
	
}
