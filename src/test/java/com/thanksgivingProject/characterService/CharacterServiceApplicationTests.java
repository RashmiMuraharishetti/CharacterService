package com.thanksgivingProject.characterService;

import com.thanksgivingProject.characterService.Controller.CharacterProfileController;
import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import com.thanksgivingProject.characterService.Service.CharacterProfileService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CharacterServiceApplicationTests {

	@Mock
	private CharacterProfileService mockService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateService(){

		//Setup
		CharacterProfile expected = new CharacterProfile();
		CharacterProfileController cpController = new CharacterProfileController(mockService);

		//execute
		when(mockService.generateService(expected.getCharName(), expected.getCharClass())).thenReturn(expected);

		CharacterProfile actual = cpController.generateCharacter(expected.getCharName(), expected.getCharClass());

		//assert
		Assert.assertEquals(expected,actual);

	}

}
