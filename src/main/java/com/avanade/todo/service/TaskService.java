package com.avanade.todo.service;

import com.avanade.todo.model.Task;
import com.avanade.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;

	public Task create( Task task ) {
		task.setCreatedAt( LocalDateTime.now( ) );
		task.setIsCompleted( false );
		task.setCompletedAt( null );
		return this.repository.save( task );
	}

	public List< Task > findAll( ) {
		return repository.findAll( );
	}

	public Task findById( Long id ) {
		return new Task( );
	}

	public void delete( Long id ) {

	}

	public Task update( Task task ) {
		return new Task( );
	}
}
