package com.sqli.vehicles;

public class DoorClosed extends DoorStats {

    DoorClosed(Door door) {
        super(door);
        doCloseDoor();
    }

    @Override
    public void open() {
        doOpenDoor();
        door.setDoorStat(new DoorOpen(door));
    }

    @Override
    public void close() {}
}
