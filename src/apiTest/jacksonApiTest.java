package apiTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import testclass.User;

public class jacksonApiTest {
	
	@Test
	public void testAPIAtrributes() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		User user=obj.readValue(new File(System.getProperty("user.dir")+"//testdata//jsonexample.json"), User.class);
		
		assert user.getage().equals(28):"User age is wrong";
		assert user.getphoneNumber().size()==2:"Not all phone numbers are available";
		
	}

}
