package fi.vamk.tka.reactspring.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertNotNull(found);
        if(found != null) {
            assertEquals(found.getName(), item.getName());
            //we Don't want to keep the data
            repository.delete(found);
        }

        // copmare the initial and the saved one if the name is the same

        // use assertEquals
    }

}