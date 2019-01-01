package com.sqli.vehicles;

public class DoorOpen extends DoorStats {
    DoorOpen(Door door) {
        super(door);
        doOpenDoor();
    }

    @Override
    public void open() {
    }

    @Override
    public void close() {
        doCloseDoor();
        door.setDoorStat(new DoorClosed(door));
    }

}
