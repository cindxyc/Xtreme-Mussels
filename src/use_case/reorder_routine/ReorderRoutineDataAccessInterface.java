package use_case.reorder_routine;

import entity.Exercise;

import java.util.ArrayList;

public interface ReorderRoutineDataAccessInterface {
    boolean existsById(int id);

    void updateRoutine(int id, ArrayList<Exercise> exercises);
}
