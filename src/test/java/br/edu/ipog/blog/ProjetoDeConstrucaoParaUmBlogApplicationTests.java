package br.edu.ipog.blog;

import br.edu.ipog.blog.model.Comment;
import br.edu.ipog.blog.model.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class ProjetoDeConstrucaoParaUmBlogApplicationTests {

	@Test
	void contextLoads() {
	}
}
