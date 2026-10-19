package com.example.todo.repository;
// import java.util.List;

import com.example.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
//   public List<Todo> searchTodos(String title) {
//     String sql = "SELECT * FROM todos WHERE title = '" + title + "'";
//     return jdbcTemplate.query(sql, todoRowMapper);
// }
}
