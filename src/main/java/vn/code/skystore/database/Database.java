package vn.code.skystore.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.code.skystore.models.Item;
import vn.code.skystore.repositories.ItemRepository;


@Configuration
public class Database {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ItemRepository itemRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Item itemA = new Item("Code 11", "Name 11");
                Item itemB = new Item("Code 12", "Name 12");

                //System.out.println("Ok thanh cong");
                logger.warn("insert data: " + itemRepository.save(itemA));
                logger.warn("insert data: " + itemRepository.save(itemB));
            }
        };
    }
}
