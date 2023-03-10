package group7.entities.inanimate;

public abstract class Collectables extends Inanimate {
    protected int objectType;

    protected boolean active = true; // If object hasn't been picked up TRUE, else FALSE 

    // TYPES OF COLLECTABLES
    public static final int ESCAPE_KEYCARD = 0;
    public static final int GREEN_HEALTH_POTION = 1;
	public static final int PURPLE_SPEED_POTION = 2;
    public static final int EGG_POINT_BONUS = 3;
    
    // Constructor
    public Collectables( int x, int y) {
        super(x, y);
        loadAnimations();
    }

    protected void updateAnimation() {
        // implement if you animate the potion/keys/eggs
    }
    
    public void setActive( boolean active ) {
        this.active = active;
    }

    public boolean getActive() {
        return active;
    }
    
    public int getObjectType() {
        return objectType;
    }
}
