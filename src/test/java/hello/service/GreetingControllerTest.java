/*
package hello.service;

import hello.controller.GreetingController;
import hello.config.TestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import static junit.framework.Assert.assertEquals;

*/
/**
 * Created with IntelliJ IDEA.
 * User: Saloni
 * Date: 4/24/15
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 *//*

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class GreetingControllerTest {

    @Autowired
    private LoginController gtc;

    @Mock
    private Model model;
    //by using before model's mock is intialized,if not used it will throw null pointer exception
    @Before
    public void setUp(){

        MockitoAnnotations.initMocks(this);
    }
    @Test                                        //here we did not mock model oursleves
    public void shouldPrintMessage(){
        String test = gtc.greeting("test",model);
        assertEquals("mock",test);

    }
        //mock model here
//    private Model getMockModel(){
//        Model model = Mockito.mock(Model.class);
//        return model;




}
*/
