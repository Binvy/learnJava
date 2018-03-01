package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls spaceShipControls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    public void up(int velocity) { spaceShipControls.up(velocity); }
    public void down(int velocity) { spaceShipControls.down(velocity); }
    public void left(int velocity) { spaceShipControls.left(velocity); }
    public void right(int velocity) { spaceShipControls.right(velocity); }
    public void forward(int velocity) { spaceShipControls.right(velocity); }
    public void back(int velocity) { spaceShipControls.back(velocity); }
    public void turboBoost() { spaceShipControls.turboBoost(); }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("LiaoNing No1");
        spaceShipDelegation.forward(100);
    }

}

class SpaceShipControls {
    void up(int velocity) {}
    void down(int velocity) {}
    void left(int velocity) {}
    void right(int velocity) {}
    void forward(int velocity) {}
    void back(int velocity) {}
    void turboBoost() {}
}
