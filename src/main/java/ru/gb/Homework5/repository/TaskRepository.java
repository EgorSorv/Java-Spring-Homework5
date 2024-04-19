package ru.gb.Homework5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.Homework5.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
