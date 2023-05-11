package vn.code.skystore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.code.skystore.models.Item;
import vn.code.skystore.models.ResponseObject;
import vn.code.skystore.repositories.ItemRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("")
    List<Item> getAllItems() {
        return List.of(
                new Item(1L, "Code 1", "Name 1"),
                new Item(2L, "Code 2", "Name 2"),
                new Item(3L, "Code 2", "Name 3")
        );
    }

    @GetMapping("/list")
    List<Item> getAllItemList() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<ResponseObject> findById(@PathVariable Long id) {
        Optional<Item> foundItem = itemRepository.findById(id);

        if (foundItem.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("ok", "Query Item success", foundItem)
            );
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseObject("false", "Cannot find item with id = " + id, "")
        );
    }

    @GetMapping("/entity")
    String getNameEntity(@RequestParam(name = "name") String name) {
        String val = "";
        Item item = new Item();
        item.setName(name);

        val = item.getName();
        return val;
    }
}
