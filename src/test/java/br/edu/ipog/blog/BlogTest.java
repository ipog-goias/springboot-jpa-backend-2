package br.edu.ipog.blog;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class BlogTest {

    @Test
    void testar(){
      log.info("teste projeto");
    }
}
