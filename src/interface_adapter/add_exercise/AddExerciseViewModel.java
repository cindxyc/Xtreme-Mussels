package interface_adapter.add_exercise;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AddExerciseViewModel extends ViewModel {

    private static AddExerciseState state = new AddExerciseState();

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);


    public AddExerciseViewModel() {
        super("add");
    }

    public void setState(AddExerciseState state) {this.state = state; }

    /**
     *
     */
    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    /**
     * @param listener
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);

    }

    public static AddExerciseState getState() {
        return state;
    }
}
