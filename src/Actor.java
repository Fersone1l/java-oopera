import java.util.Objects;

public class Actor extends Person{
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getSurname(), super.getGender(), height);
    }

    @Override
    public boolean equals(Object o) {
        Actor otherActor = (Actor) o;
        return Objects.equals(this.getName(), otherActor.getName())
                && Objects.equals(this.getSurname(), otherActor.getSurname())
                && Objects.equals(height, otherActor.height);
    }

    @Override
    public String toString() {
        return super.toString() + " (рост: " + height + "см)";
    }
}
