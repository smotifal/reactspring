package fi.vamk.tka.reactspring.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import fi.vamk.tka.reactspring.model.Group;
import fi.vamk.tka.reactspring.model.GroupRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackageClasses = GroupRepository.class)
public class GroupTest {
    @Autowired
    private GroupRepository repository;

    @Test 
    public void justTesting() {
        System.out.println("------Test, test, test");
    }

    @Test
    public void againTesting() {
        System.out.println("--------------Test 22222222 -------");
    }


    @Test
    public void addGroupAndVerifyTest() {

        //create an instance of GroupTest
        Group item = new Group();

        //set the group name to "Vaasa JUG"
        item.setName("Vaasa JUG");
        // add instance of GroupRepository to save it to database
        repository.save(item);
        // get the save one by findByName
        Group found = repository.findByName("Vaasa JUG");
        assertEquals(found.getName(), item.getName());

        // copmare the initial and the saved one if the nale is the same

        // use assertEquals
    }

}