import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public Actor searchForActor(String otherActorSurname) { // Поиск актера по фамилии
        if (otherActorSurname == null) return null;

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(otherActorSurname)) {
                return actor;
            }
        }
        return null;
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.getName() + " уже играет в спектакле '" + title + "'");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.getName() + " добавлен в спектакль '" + title + "'");
        }
    }

    public void replaceActor(Actor newActor, String surnameOfReplaceable) {
        Actor replaceableActor = searchForActor(surnameOfReplaceable);
        if (replaceableActor == null) {
            System.out.println("Актер " + surnameOfReplaceable + " не играет в спектакле '"
                    + title + "' или данные введены некорректно");
        } else if (replaceableActor.equals(newActor)) {
            System.out.println("Актер " + newActor.getSurname() + " уже играет в спектакле '" + title + "'");
        } else {
            int replacePosition = listOfActors.indexOf(replaceableActor);
            listOfActors.set(replacePosition, newActor);
            System.out.println("Актер " + surnameOfReplaceable + " успешно заменен на актера "
                    + newActor.getSurname() + " в спектакле '" + title + "'");
        }
    }

}
