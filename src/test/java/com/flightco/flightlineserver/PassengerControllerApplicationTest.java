package com.flightco.flightlineserver;

import com.flightco.flightline.FlightlineApplication;
import com.flightco.flightline.model.Passenger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// @RunWith(SpringRunner.class)
// @WebMvcTest(value = FlightController.class, secure = false)
// @RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FlightlineApplication.class)
public class  PassengerControllerApplicationTest extends AbstractTest{
   
   @Override
   @Before
   public void setUp(){
      super.setUp();
   }

   @Test
   public void testAddPassenger()throws Exception{
      Passenger passenger = new Passenger();
      passenger.setName("TestName");
      passenger.setLastname("TestLastname");
      passenger.setSeat("t99");
      passenger.setFlightCode("tt9999");      
      
      String url = "/manifest/add";

      String inputJson = super.mapToJson(passenger);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
      int httpStatusCode = mvcResult.getResponse().getStatus();
      assertEquals(httpStatusCode,200);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals("{\"name\":\"TestName\",\"lastname\":\"TestLastname\",\"seat\":\"t99\",\"flightCode\":\"tt9999\"}", content);
   }
  
}