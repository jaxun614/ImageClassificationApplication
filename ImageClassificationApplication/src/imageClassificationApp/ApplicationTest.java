package imageClassificationApp;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ApplicationTest {

	@Test
	public void imageTimeAddedTest() {
		Image img = new Image("");
		assertTrue(img.getTimeAdded()!=null);
	}

}
