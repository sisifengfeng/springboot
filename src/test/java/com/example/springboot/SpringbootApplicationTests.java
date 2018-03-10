package com.example.springboot;

import com.example.springboot.repository.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Autowired
	private ProjectRepository projectRepository;
	@Test
	public void contextLoads() {
		projectRepository.list().forEach(System.out::println);
	}

}
