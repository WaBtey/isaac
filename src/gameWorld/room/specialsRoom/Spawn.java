package gameWorld.room.specialsRoom;

import java.util.List;

import gameWorld.room.Room;
import gameobjects.Door;
import gameobjects.moving_entity.Hero;
import libraries.StdDraw;
import libraries.Vector2;
import resources.DoorInfos;

public class Spawn extends Room {

	public Spawn(Hero hero, List<Door> doors) {
		super(hero, doors);
		//getDoors().add(new Door(DoorInfos.NORTH, new Room(hero)));
		
	}
	
	
	public void drawRoom() {
		super.drawRoom();
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledSquare(0.5, 0.2, 0.05);
	}
	
}