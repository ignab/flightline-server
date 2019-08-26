package com.flightco.flightlineserver;

import com.flightco.flightline.FlightlineApplication;
import com.flightco.flightline.payload.FlightResponse;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(classes = FlightlineApplication.class)
public class  FlightControllerApplicationTest extends AbstractTest{
   
   @Override
   @Before
   public void setUp(){
      super.setUp();
   }

   @Test
   public void testGetManifest()throws Exception{
      
      FlightResponse flightResponse = new FlightResponse();
      flightResponse.setFlight("tt9998");
      String url = "/manifest/{flightCode}";

      String inputJson = super.mapToJson(flightResponse);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url,"tt9998").contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
      int httpStatusCode = mvcResult.getResponse().getStatus();
      assertEquals(httpStatusCode,200);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals("{\"flight\":\"tt9998\",\"passengers\":[]}", content);
   }
  
}