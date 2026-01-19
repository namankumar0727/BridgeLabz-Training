package com.parceltracker;
class ParcelRoute {

    private StageNode head;

    // Default delivery stages
    public ParcelRoute() {
        addStage("Packed");
        addStage("Shipped");
        addStage("In Transit");
        addStage("Delivered");
    }

    // Add stage at end
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Checkpoint failed: Stage not found");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Checkpoint added: " + newStage);
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking data.");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Route: ");

        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Simulate lost parcel
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST");
    }
}
