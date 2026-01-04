package entities;

import model.Money;
import model.RoomKind;

public class RoomType {

    private RoomKind kind;
    private Money cost;

    public RoomType(RoomKind kind, Money cost) {
        this.kind = kind;
        this.cost = cost;
    }

    // Getters and Setters
    public RoomKind getKind() {
        return kind;
    }

    public void setKind(RoomKind kind) {
        this.kind = kind;
    }

    public Money getCost() {
        return cost;

    }

    public void setCost(Money cost) {
        this.cost = cost;

    }
}
